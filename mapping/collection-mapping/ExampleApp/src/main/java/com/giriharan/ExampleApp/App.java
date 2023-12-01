package com.giriharan.ExampleApp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	List<String> classmates = new ArrayList<>();
    	classmates.add("Takemichi");
    	classmates.add("Draken");
    	
    	Student student = new Student("Mikey",classmates);
    	
    	session.save(student);   
    	
    	transaction.commit();
    	session.close();
    	
    	System.out.println("Successfully added!");
    }
}
