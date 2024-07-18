package com.yash.productcart.model;


//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
//@Table(name = "product_rating")
public class ProductRating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private double rating;
	
	public ProductRating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductRating(int productId, double rating) {
		super();
		this.productId = productId;
		this.rating = rating;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	

}
