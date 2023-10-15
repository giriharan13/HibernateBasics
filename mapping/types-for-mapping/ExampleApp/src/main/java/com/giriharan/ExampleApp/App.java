package com.giriharan.ExampleApp;

import java.util.Currency;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Item.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session s = sf.openSession();
        
        s.beginTransaction();
        
        Item it = new Item();
        
        Date date = new Date();
        it.setDateOfPurchase(date);
        
        it.setNameInBytes("Naruto: The tests of the Ninja. vol. 1".getBytes());
        
        Currency curr = Currency.getInstance("JPY");
        it.setCurrency(curr);
        
        
        s.save(it);
        s.getTransaction().commit();
        
        System.out.println("Item saved successfully!");
        
    }
}
