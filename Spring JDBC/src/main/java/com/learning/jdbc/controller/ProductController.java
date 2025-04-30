package com.learning.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.learning.jdbc.model.Product;
import com.learning.jdbc.repo.ProductRepo;

@Controller
public class ProductController {
	
	private ProductRepo productRepo;
	
	@Autowired
	public void setProduct(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}
	
	public List<Product> getProducts(){
		return productRepo.getProducts();
	}
	
	public void setProducts(Product product) {
		productRepo.addProduct(product);
	} 
	
	public void updateProduct(Product product) {
		productRepo.updateProduct(product);
	}
	
	public void deleteProduct(int id) {
		productRepo.deleteProduct(id);
	}
}
