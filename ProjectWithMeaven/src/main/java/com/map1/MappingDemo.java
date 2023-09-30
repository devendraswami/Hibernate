package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		
		
		Emp e1  = new Emp();
		Emp e2 = new Emp();
		
		e1.setEid(11);
		e1.setName("RajaRam");
		
		e2.setEid(12);
		e2.setName("RadheShayam");
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPid(111);
		p1.setName("Library-Management-System");
		
		p2.setPid(112);
		p2.setName("ChatBot");
		
		
		List<Emp> list = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();
		
		list.add(e2);
		list.add(e1);
		
		list2.add(p2);
		list2.add(p1);
		
		e1.setProjects(list2);
		p2.setEmps(list);
		
		
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
				
	    session.close();
		sessionfactory.close();
	}

}
