package com.yash.productcart.model;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductCartDto {
    private List<ProductCart> productCart;
    private List<Product> product;
    private List<ProductRating> productRating;
	public List<ProductCart> getProductCart() {
		return productCart;
	}
	public void setProductCart(List<ProductCart> productCart) {
		this.productCart = productCart;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public List<ProductRating> getProductRating() {
		return productRating;
	}
	public void setProductRating(List<ProductRating> productRating) {
		this.productRating = productRating;
	}
    
}
