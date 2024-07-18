package com.yash.productcart.model;



//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
//@Table(name="product_cart")
public class ProductCart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	private double price;
	private String description;
	private double rating;
	
	
	public ProductCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductCart(int productId, String productName, double price, String description, double rating) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.rating = rating;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "ProductCart [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", description=" + description + ", rating=" + rating + "]";
	}

}

