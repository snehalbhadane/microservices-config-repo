package com.yash.productcart.controller;

import java.util.Arrays;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yash.productcart.model.Product;
import com.yash.productcart.model.ProductCart;
import com.yash.productcart.model.ProductRating;
import com.yash.productcart.repository.ProductCartRepository;
//import com.yash.productcart.service.ProductServiceImpl;
import com.yash.productcart.service.ProductCartServiceImpl;

//import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/cart")
public class ProductCartController {
	@Autowired
    RestTemplate restTemplate;
	@Autowired
	ProductCartServiceImpl productCartServiceImpl;
	@Autowired
	ProductCartRepository productCartRepo;

	@GetMapping("/getcart")
	//@CircuitBreaker(name = "cartcircuitBreaker", fallbackMethod = "getFallbackCart()")
	//@HystrixCommand(fallbackMethod="getFallbackCart")
	public List<ProductCart> getCart() {
		
		// return Collections.singletonList(new ProductCart(1, "Shirt", 2000.0, "Blue
		// ColorShirt", 4.3));

		//return Arrays.asList(new ProductCart(1, "Shirt", 2000, "Blue Color Shirt", 4.3),
				//new ProductCart(2, "Sunglasses", 4000, "Black Color UV Protected", 4.6));
		//System.out.println("Product fetched");
		//return productCartServiceImpl.getAllProductCartDetails();
	///}
		//Product[] product = restTemplate.getForObject("http://localhost:8087/products/getAllProductDetails",Product[].class);
		//ProductRating[] productRating = restTemplate.getForObject("http://localhost:8088/ratingproduct/getAllRatings",ProductRating[].class);
	/*List<ProductCart> cartList = productCartRepo.findAll();
	return cartList.stream().map(cartsList -> {
		Product product = restTemplate.getForObject("http://localhost:8082/products/getAllProductDetails",Product.class);
		ProductRating productRating = restTemplate.getForObject("http://localhost:8083/ratingproduct/getAllRatings",ProductRating.class);
		return new ProductCart(product.getProductId(),product.getProductName(),cartList.get(0).getPrice(), cartList.get(0).getDescription(), productRating.getRating());
	}).collect(Collectors.toList());
	}*/return productCartServiceImpl.getAllProductCartDetails();
	}
		/*public List<ProductCart> getFallbackCart(@PathVariable("id")String id)
		{
			return Arrays.asList(new ProductCart(0, "No product available",0, "0", 0));
		}*/
		//public List<ProductCart> getFallbackCart(Throwable e) {
		  //  return Arrays.asList(new ProductCart());
		//}

		
}
	/*public static void getFallbackCart(){
        System.out.print("service is unavailable");
    }*/

			
	/*
	 * 
	 * List<ProductCart> cartList = productCartRepo.findAll();
		return cartList.stream().map(cartsList -> {
			Product product = restTemplate.getForObject("http://localhost:8087/products/getAllProductDetails",Product.class);
			ProductRating productRating = restTemplate.getForObject("http://localhost:8088/ratingproduct/getAllRatings",ProductRating.class);
			return new ProductCart(product.getProductId(), product.getProductName(), cartList.get(0).getPrice(), cartList.get(0).getDescription(), productRating.getRating());
		}).collect(Collectors.toList());
	 */
	
	/*@PostMapping("/pcart/create")
	public void createBook(ProductCart cart)
{
		
		System.out.println("creating a record");	
		productCartServiceImpl.createProductCart(cart);
	
}*/
	
	

