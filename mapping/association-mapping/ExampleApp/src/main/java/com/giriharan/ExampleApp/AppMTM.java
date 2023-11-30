package com.giriharan.ExampleApp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMTM {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).addAnnotatedClass(Product.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Customer customer1 = new Customer();
    	List<Customer> customers = new ArrayList<>();
    	customers.add(customer1);
    	
    	Product product1 = new Product();
    	Product product2 = new Product();
    	List<Product> products = new ArrayList<>();
    	product1.setCustomers(customers);
    	product2.setCustomers(customers);
    	customer1.setProducts(products);
    	products.add(product1);
    	products.add(product2);
    	
    	/* Before cascading 
    	session.save(customer1);
    	session.save(product1);
    	session.save(product2); */
    	
    	// After cascading
    	session.save(customer1);
    	
    	
    	transaction.commit();
    	session.close();
    	
    	System.out.println("Successfully added!");
	}

}
