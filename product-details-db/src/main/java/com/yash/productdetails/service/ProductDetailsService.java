package com.yash.productdetails.service;

import java.util.List;
import java.util.Optional;

import com.yash.productdetails.model.Product;

public interface ProductDetailsService {
	
	public Optional<List<Product>> getAllProductDetails();


}
