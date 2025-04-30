package com.learning.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.learning.jdbc.controller.ProductController;
import com.learning.jdbc.model.Product;
import java.util.List;

@SpringBootApplication
public class JdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JdbcApplication.class, args);
		
		Product product = context.getBean(Product.class);
		product.setName("Utils");
		product.setDescription("ToothPaste");
		product.setPrice(30);
		
		ProductController productController = context.getBean(ProductController.class);
		productController.setProducts(product);
		List<Product> products = productController.getProducts();
		Product p = null;
		
		for (Product product2 : products) {
			if(product2.getId() == 1) {
				p = product2;
				break;
			}
		}
		
		p.setDescription("Acer swift 3");
		productController.updateProduct(p);
		productController.deleteProduct(5);
		System.out.println(productController.getProducts());
	}

}