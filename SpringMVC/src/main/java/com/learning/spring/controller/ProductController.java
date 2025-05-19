package com.learning.spring.controller;

import com.learning.spring.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.learning.spring.dao.ProductDao;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	
	private ProductDao productRepo;
	
	@Autowired
	public void setProduct(ProductDao productRepo) {
		this.productRepo = productRepo;
	}

	@GetMapping("products")
	public String getProducts(Model m){
		m.addAttribute("products", productRepo.getProducts());
		return "products";
	}

	@GetMapping("getProduct")
	public String getProduct(@RequestParam("id") int id, Model m){
		m.addAttribute("products", productRepo.getProduct(id));
		return "products";
	}

	@GetMapping("addProduct")
	public String setProducts(@ModelAttribute("products") Product product) {
		productRepo.addProduct(product);
		return "products";
	}

	@GetMapping("updateProduct")
	public String updateProduct(@ModelAttribute("products") Product product) {
		productRepo.updateProduct(product);
		return "products";
	}

	@GetMapping("deleteProduct")
	public String deleteProduct(@RequestParam("id") int id, Model m) {
		m.addAttribute("products",productRepo.deleteProduct(id));
		return "products";
	}
}
