package com.app.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products1_table")
public class Product {
	
	@Column(name="pid")
	@Id
	private int pid;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="price")
	private double price;
	
	public Product() {
		System.out.println("Product called here"+getClass().getName());
	}

	public Product(int pid, String productName, double price) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", price=" + price + "]";
	}
	
	

}
