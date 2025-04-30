package com.Learing.spring.controller;

import com.Learing.spring.model.Product;
import com.Learing.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return  productService.getProductById(id);
    }
    
    @PostMapping("/products")
    public String addProduct(@RequestBody Product product) {
    	return productService.addProduct(product);
    }
    
    @PutMapping("/products/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product product) {
    	return productService.updateProduct(id, product);
    }
    
    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id) {
    	return productService.deleteProduct(id);
    }
}
