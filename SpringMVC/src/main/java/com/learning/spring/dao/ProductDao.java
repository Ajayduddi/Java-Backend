package com.learning.spring.dao;

import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.learning.spring.model.Product;
import java.util.List;


@Component
public class ProductDao {
	
	private SessionFactory sessionFactory;
	
	@Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
	public List<Product> getProducts(){
		Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Product", Product.class).getResultList();
	}

    @Transactional
    public Product getProduct(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Product.class, id);
    }

    @Transactional
    public void addProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(product);
    }

    @Transactional
    public void updateProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(product);
    }

    @Transactional
    public Product deleteProduct(int id) {
        Session session = sessionFactory.getCurrentSession();
        Product p = session.get(Product.class, id);

        if(p != null) {
            session.remove(p);
            System.out.println("record deleted");
        }
        return p;
    }
}
