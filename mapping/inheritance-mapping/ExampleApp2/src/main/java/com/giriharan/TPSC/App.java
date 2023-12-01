package com.giriharan.TPSC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Shape.class).addAnnotatedClass(Square.class).addAnnotatedClass(Rectangle.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Shape s1 = new Shape(20);
    	Square sq1 = new Square(5);
    	Rectangle r1 = new Rectangle(7,8);
    	
    	session.save(s1);
    	session.save(sq1);
    	session.save(r1);
    	
    	transaction.commit();
    	session.close();
    	
    	System.out.println("Successfully added!");
    }
}
