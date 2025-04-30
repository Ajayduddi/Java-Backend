package com.learning.jdbch2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.learning.jdbch2.model.Product;
import com.learning.jdbch2.repo.ProductRepo;

@Controller
public class ProductController {
	
	private ProductRepo productRepo;

	@Autowired
	public void setProductRepo(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}
	
	public List<Product> getProducts(){
		return productRepo.getProducts();
	}
	
	public void addProduct(Product product) {
		productRepo.setProduct(product);
	}
	
	public void updateProduct(Product product) {
		productRepo.updateProduct(product);
	}
	
	public void deleteProduct(int id) {
		productRepo.deleteProducts(id);
	}
}
