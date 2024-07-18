/**
 * 
 */
package com.yash.productdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.productdetails.model.Product;

@Repository
public interface ProductDetailsRepository extends JpaRepository<Product, Integer> {

}
