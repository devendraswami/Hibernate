package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session s = sessionFactory.openSession();
		
		Transaction tx = s.beginTransaction()
;		
		Student stu1 = new Student();
		stu1.setCity("Jpr-Aatishmarket");
		stu1.setId(94);
		stu1.setName("Devendra");
		
		// certificate object creation
		Certificate certi = new Certificate();
	    certi.setCourse("Java");
	    certi.setDuration("3 Months");
	     
	    stu1.setCertificate(certi);
	    
	    
	    
	    Student stu2 = new Student();
		stu2.setCity("Jpr-Gurjar-ki-Thadi");
		stu2.setId(95);
		stu2.setName("Dev");
		stu2.setCertificate(certi);
		
		
		s.save(stu2);
		s.save(stu1);
		
		tx.commit();
		sessionFactory.close();
		s.close();
		
	     
		
		
	}

}
