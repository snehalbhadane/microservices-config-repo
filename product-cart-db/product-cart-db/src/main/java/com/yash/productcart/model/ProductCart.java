package com.yash.productcart.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductCart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productCardId;
	private int productId;
	private String productName;
	private double price;
	private String description;
	private double rating;
	
	public ProductCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductCart(int productCardId, int productId, String productName, double price, String description,
			double rating) {
		super();
		this.productCardId = productCardId;
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.rating = rating;
	}
	public int getProductCardId() {
		return productCardId;
	}
	public void setProductCardId(int productCardId) {
		this.productCardId = productCardId;
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
	
}

