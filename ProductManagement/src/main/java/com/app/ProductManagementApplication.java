package com.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.pojos.IProduct;
import com.app.pojos.Product;

@SpringBootApplication
public class ProductManagementApplication {
	
	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(ProductManagementApplication.class, args);
	
	
   
	IProduct p = context.getBean(IProduct.class);
	
	/*
	 * Product product = new Product(); product.setPid(5);
	 * product.setProductName("Fan"); product.setPrice(9000.00);
	 * 
	 * 
	 * p.save(product);
	 */
	
	}

}
