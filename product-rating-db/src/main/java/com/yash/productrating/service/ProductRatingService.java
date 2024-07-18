package com.yash.productrating.service;

import java.util.List;
import java.util.Optional;

import com.yash.productrating.model.ProductRating;

public interface ProductRatingService {
	
	public Optional<List<ProductRating>> getAllProductRatingDetails();

	public ProductRating addProductRating(ProductRating productRating);

}
