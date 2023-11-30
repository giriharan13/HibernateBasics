package com.giriharan.ExampleApp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppOTM_MTO {
	public static void main(String args[]) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Library.class).addAnnotatedClass(Book.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Library library = new Library();
    	Book book1 = new Book("God of war : Ragnarok");
    	Book book2 = new Book("Red Dead Redemption II");
    	book1.setLibrary(library);
    	book2.setLibrary(library);
    	
    	List<Book> books = new ArrayList<Book>();
    	books.add(book1);
    	books.add(book2);
    	
    	library.setBooks(books);
    	
    	session.save(book1);
    	session.save(book2);
    	session.save(library);
    	
    	transaction.commit();
    	session.close();
    	
    	System.out.println("Successfully added!");
	}

}
