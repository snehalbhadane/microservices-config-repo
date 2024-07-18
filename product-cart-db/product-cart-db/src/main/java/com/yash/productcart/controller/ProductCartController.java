package com.yash.productcart.controller;

import com.yash.productcart.model.ProductCart;
import com.yash.productcart.model.ProductCartDto;
import com.yash.productcart.service.ProductCartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class ProductCartController {

    @Autowired
    ProductCartServiceImpl productCartServiceImpl;

    @GetMapping(value = "/get-cart", headers = "Accept=application/json")
    public List<ProductCartDto> getCart() {
        return productCartServiceImpl.getAllProductCartDetails();
    }

    @PostMapping("/add-product-cart")
    public ProductCart addProductCart(@RequestBody ProductCart productCart) {
        return productCartServiceImpl.addProductCart(productCart);
    }

}


	

