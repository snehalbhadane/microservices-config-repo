package com.yash.productdetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.productdetails.model.Product;
import com.yash.productdetails.service.ProductDetailsServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductDetailsServiceImpl productDetailsServiceImpl;
	
	@GetMapping("/getAllProductDetails")
	public Optional<List<Product>> getProductDetails() {
		
		//return new Product(productId,"test");
		return productDetailsServiceImpl.getAllProductDetails();
	}}