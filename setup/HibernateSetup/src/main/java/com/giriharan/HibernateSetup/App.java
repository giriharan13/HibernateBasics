package com.giriharan.HibernateSetup;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	cfg.addAnnotatedClass(Student.class);
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session s = sf.openSession();
    	s.beginTransaction();
    	Student stud1 = new Student();
    	stud1.setRoll(1);
    	stud1.setName("AAA");
    	stud1.setAge(20);
    	s.save(stud1);
    	s.getTransaction().commit();
    	
    	System.out.println("Transaction committed successfully!");

    }
}
