package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	System.out.println(factory);
    	System.out.println(factory.isClosed()); 
    	
    	Student std = new Student();
    	std.setId(2);
    	std.setName("Devendra ");
    	std.setCity("Jaipur");
    	
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	session.save(std);
    	
    	tx.commit();
    	
    	System.out.println(std);
    }
}
