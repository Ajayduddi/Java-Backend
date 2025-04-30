package com.learning.jdbc.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.learning.jdbc.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductRepo {
	
	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Product> getProducts() {
		String sql = "select * from products";
		// Anonymous class
		RowMapper<Product> mapper = new RowMapper<Product>() {
			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product a = new Product();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setDescription(rs.getString(3));
				a.setPrice(rs.getDouble(4));
				return a;
			}
		};
		
		List<Product> result = template.query(sql, mapper);
		return result;
	}

	public void addProduct(Product product) {
		String sql = "insert into products (name, description, price) values (?,?,?)";
		System.out.println("add product : " + template.update(sql, product.getName(), product.getDescription(), product.getPrice()));
	}
	
	public void updateProduct(Product product) {
		String sql = "update products set name = ?, description = ?, price = ? where id = ?";
		System.out.println("update product : " + template.update(sql, product.getName(), product.getDescription(), product.getPrice(), product.getId()));
	}
	
	public void deleteProduct(int id) {
		String sql = "delete from products where id = ?";
		System.out.println("Delete product : " + template.update(sql, id));
	}
	
}
