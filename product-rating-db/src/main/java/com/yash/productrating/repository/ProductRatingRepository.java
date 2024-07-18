package com.yash.productrating.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.productrating.model.ProductRating;

@Repository
public interface ProductRatingRepository extends JpaRepository<ProductRating, Integer> {

}
