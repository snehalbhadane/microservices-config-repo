package com.yash.productcart.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yash.productcart.mapper.ProductCartMapper;
import com.yash.productcart.model.ProductCart;
import com.yash.productcart.model.ProductCartDto;
import com.yash.productcart.repository.ProductCartRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class ProductCartServiceImpl implements ProductCartService {

    @Autowired
    ProductCartRepository productCartRepo;

    @Autowired
    RestTemplate restTemplate;

    @Override
    //@CircuitBreaker(name = "cartcircuitBreaker", fallbackMethod = "getFallbackCart()")
    @HystrixCommand(fallbackMethod = "getFallbackCart")
    public List<ProductCartDto> getAllProductCartDetails() {
        List forObject = restTemplate.getForObject("http://localhost:8082/products/get-product", List.class);
        ArrayList forObject2 = restTemplate.getForObject("http://localhost:8083/rating/getAllRatings", ArrayList.class);
       // log.info("product details: {}", forObject);
        //log.info("product details: {}", forObject2);
        List<ProductCart> all = productCartRepo.findAll();

        List<ProductCartDto> list =  ProductCartMapper.mapToProductCartDetail(all, forObject, forObject2);
        return list;
    }

    @Override
    public ProductCart addProductCart(ProductCart productCart) {
        return productCartRepo.save(productCart);
    }

    public List<ProductCartDto> getFallbackCart(Throwable e) {
        return Arrays.asList(new ProductCartDto());
    }
}



