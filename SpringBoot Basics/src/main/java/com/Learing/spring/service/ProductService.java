package com.Learing.spring.service;

import com.Learing.spring.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Laptop", "Dell Inspiron", 800.00),
                                            new Product(102, "Smartphone", "Samsung Galaxy", 500.00),
                                            new Product(103, "Tablet", "Apple iPad", 300.00)));
    public List<Product> getProducts(){
        return products;
    }
    
    public Product getProductById(int id) {
    	return products.stream().
    			filter(p -> p.getId() == id).
    			findFirst().orElse(new Product(100, "No Item", "", 0));
    }
    
    public String addProduct(Product product) {
    	products.add(product);
    	return "Product added successfully";
    }

	public String updateProduct(int id, Product product) {
		int index = 0;
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		
		products.set(index, product);
		return "Product Updated Successfully";
	}
	
	public String deleteProduct(int id) {
		int index = 0;
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		
		products.remove(index);
		return "Products delted successfully";
	}
}
