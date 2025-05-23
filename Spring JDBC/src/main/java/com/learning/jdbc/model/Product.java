package com.learning.jdbc.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	public Product() {
		super();
	}

	private int id;
	private String name;
	private String description;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return " id = " + id + ",\nname = " + name + ",\ndescription = "
				+ description + ",\nprice = " + price + ",\n\n";
	}
	
	
}
