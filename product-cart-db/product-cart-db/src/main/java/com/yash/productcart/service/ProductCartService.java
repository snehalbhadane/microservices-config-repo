package com.yash.productcart.service;

import java.util.List;
import java.util.Optional;

import com.yash.productcart.model.ProductCart;
import com.yash.productcart.model.ProductCartDto;

public interface ProductCartService {
	
	List<ProductCartDto> getAllProductCartDetails();

	ProductCart addProductCart(ProductCart productCart);

}
