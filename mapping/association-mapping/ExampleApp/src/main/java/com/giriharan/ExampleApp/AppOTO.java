package com.giriharan.ExampleApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppOTO 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class).addAnnotatedClass(Passport.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	
    	Person person = new Person("Arjun");
    	Passport passport = new Passport();
    	person.setPassport(passport);
    	passport.setPerson(person);
    	
    	session.save(person);
    	session.save(passport);
    	
    	transaction.commit();
    	session.close();
    	
    	System.out.println("Successfully added!");
    	
    }
}
