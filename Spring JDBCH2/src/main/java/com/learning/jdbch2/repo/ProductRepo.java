package com.learning.jdbch2.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.learning.jdbch2.model.Product;

@Repository
public class ProductRepo {
	
	@Autowired
	private JdbcTemplate template;
	
	public List<Product> getProducts(){
		String sql = "select * from products";
		RowMapper<Product> mapper = new RowMapper<Product>() {
			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product a = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
				return a;
			}
		};
		
		List<Product> products = template.query(sql, mapper);
		return products;
	}
	
	public void setProduct(Product product) {
		String sql = "insert into products(name, description, price) values(?,?,?)";
		System.out.println("add product : " + template.update(sql, product.getName(), product.getDescription(), product.getPrice()));
	}
	
	public void updateProduct(Product product) {
		String sql = "update products set name = ?, description = ?, price = ? where id = ?";
		System.out.println("update product : " + template.update(sql, product.getName(), product.getDescription(), product.getPrice(), product.getId()));
	}
	
	public void deleteProducts(int id) {
		String sql = "delete from products where id = ?";
		System.out.println("delete product : "+ template.update(sql, id));
	}
}
