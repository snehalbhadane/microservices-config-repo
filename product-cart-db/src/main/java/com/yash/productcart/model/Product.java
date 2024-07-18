package com.yash.productcart.model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author snehal.pawar
 *
 */
/**
 * @author snehal.pawar
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
//@Table(name="product_details")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
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
	
}
