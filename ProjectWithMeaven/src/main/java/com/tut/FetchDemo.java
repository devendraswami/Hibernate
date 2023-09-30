package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
   public static void main(String args[]) {
	   
	   Configuration cfg = new Configuration();
	   cfg.configure();
	   SessionFactory factory = cfg.buildSessionFactory();
	   Session session = factory.openSession();
	   
	    
	   Student std = (Student)session.get(Student.class, 04);
	   
	   System.out.println(std);
	   
	   
	   
	   factory.close();
	   session.close();
   }
	 
}
