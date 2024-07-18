package com.yash.productcart.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yash.productcart.model.ProductCart;
import com.yash.productcart.repository.ProductCartRepository;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;

@Service
public class ProductCartServiceImpl implements ProductCartService {
	Logger logger=LoggerFactory.getLogger(ProductCartServiceImpl.class);
	@Autowired
	ProductCartRepository productCartRepo;
	@Autowired
    RestTemplate restTemplate;
	@Override
	//@HystrixCommand(fallbackMethod="getFallbackCart")
	@CircuitBreaker(fallbackMethod="getFallbackCart", name = "circuit")
	@Retry(name = "retry", fallbackMethod = "getFallbackCart")
	@RateLimiter(name = "ratelimiter", fallbackMethod = "getFallbackCart")
	//@TimeLimiter(name = "timelimiter", fallbackMethod = "getFallbackCart1")
	//@Bulkhead(name = "bulkhead", fallbackMethod = "getFallbackCart")
	public List<ProductCart> getAllProductCartDetails() {
		ArrayList forObject = restTemplate.getForObject("http://localhost:8087/products/getAllProductDetails", ArrayList.class);
        ArrayList forObject2 = restTemplate.getForObject("http://localhost:8088/rating/getAllRatings", ArrayList.class);
        logger.info("product details: {}",forObject);
        logger.info("product details: {}",forObject2);
        //getFallbackCart();
        return productCartRepo.findAll();
		
	}
	 public List<ProductCart> getFallbackCart(Throwable e) {
	        return Arrays.asList(new ProductCart());
	    }
	 
	 public void getFallbackCart1(Throwable e) {
	       System.out.println("Timeout service is unavailable");
	    }
	

	/*@Override
	public Optional<List<ProductCart>> getAllProductCartDetails() {
		// TODO Auto-generated method stub
		List<ProductCart> products= productCartRepo.findAll();
		return Optional.ofNullable(products).filter(list -> !list.isEmpty());
		/*System.out.println("Get cart");
		List<ProductCart> list=new ArrayList<>();
		Iterable<ProductCart> data=productCartRepo.findAll();
		data.forEach(list::add);
		return(list);*/
	
	}

	

	   /*Logger logger=LoggerFactory.getLogger(serviceImp.class);
	    @Autowired
	    private productRepo productRepo;
	    @Autowired
	    private RestTemplate restTemplate;
	    @Override
	    @HystrixCommand(fallbackMethod="getFallbackCart")
	    public List<Product> getallproduct() {
	        ArrayList forObject = restTemplate.getForObject("http://localhost:8083/productdetails", ArrayList.class);
	        ArrayList forObject2 = restTemplate.getForObject("http://localhost:8084/productrating", ArrayList.class);
	        logger.info("product details: {}",forObject);
	        logger.info("product details: {}",forObject2);
	        getfallbackCart();
	        return productRepo.findAll();
	    }
	    public static void getfallbackCart(){
	        System.out.print("service is unable ");
	    }
	}*/
	
	/*public ProductCart createProductCart(@RequestBody ProductCart cart)
	{
			System.out.println("creating a record");	
		return productCartRepo.save(cart);
		
	}*/



