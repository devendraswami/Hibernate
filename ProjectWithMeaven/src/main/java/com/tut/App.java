package com.tut;

import java.io.FileInputStream;
import java.io.IOException;

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
    public static void main( String[] args ) throws IOException
    {
        
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	//System.out.println(factory);
    	//System.out.println(factory.isClosed()); 
    	
    	// Creating Student Object 
    	Student std = new Student();
    //	std.setId();
    	std.setName("devendra");
    	std.setCity("Jaipur");
    	
//    	// Creating Address Object
    	Address ad = new Address();
    	ad.setCity("JAIPUR");
    	ad.setOpen(true);
    	ad.setX(25.22);
    	ad.setStreet("Godhvari Path Shantinagar");
    	
    	// Reading Image 
//    	
//    	FileInputStream fis = new FileInputStream("src/main/java/Professor.jpg");
//    	byte[] data = new byte[fis.available()];
//    	fis.read(data);
    	
    //	ad.setImage(data);
    	
    
    	
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	session.save(std);
    	session.save(ad);
    	
    	tx.commit();
    	session.close();
    	
    	System.out.println("Done...");
    	
    //	System.out.println(std);
    	//System.out.println(ad);
    }
}
