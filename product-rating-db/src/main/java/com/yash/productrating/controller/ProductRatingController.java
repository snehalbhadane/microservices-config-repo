package com.yash.productrating.controller;

import com.yash.productrating.model.ProductRating;
import com.yash.productrating.service.ProductRatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rating")
public class ProductRatingController {
	
	@Autowired
	ProductRatingServiceImpl productRatingServiceImpl;
	
	@GetMapping("/getAllRatings")
	public Optional<List<ProductRating>> getProductRating() {
		return productRatingServiceImpl.getAllProductRatingDetails();
	}

	@PostMapping("/add-rating")
	public ProductRating addProductRating(@RequestBody ProductRating productRating) {
		return productRatingServiceImpl.addProductRating(productRating);
	}

}