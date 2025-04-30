package com.learning.jdbch2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learning.jdbch2.controller.ProductController;
import com.learning.jdbch2.model.Product;

@SpringBootApplication
public class Jdbch2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Jdbch2Application.class, args);
		
		Product product = context.getBean(Product.class);
		product.setName("Utils");
		product.setDescription("ToothPaste");
		product.setPrice(30);
		
		ProductController p = context.getBean(ProductController.class);
		p.addProduct(product);
		System.out.println(p.getProducts());
		System.out.println();
		
		product.setId(4);
		product.setDescription("Sleep");
		p.updateProduct(product);
		System.out.println(p.getProducts());
		System.out.println();
		
		p.deleteProduct(4);
		System.out.println(p.getProducts());
	}

}
