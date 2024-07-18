package com.yash.productcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.yash.productcart.model.ProductCart;

@Repository
public interface ProductCartRepository extends JpaRepository<ProductCart, Integer>  {
	

}
