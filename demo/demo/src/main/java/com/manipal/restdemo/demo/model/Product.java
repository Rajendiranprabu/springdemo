package com.manipal.restdemo.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {
	
	private int productId;
	private String productName;
	private int quantity;
	Product(){
		
	}
	
	
	public Product(int productId, String productName, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
	}


	@Id
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
}
