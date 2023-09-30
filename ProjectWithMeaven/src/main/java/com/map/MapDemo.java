package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
   public static void main(String  args[]) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		// creation question object
		Question q1 = new Question();
		q1.setQuestionid(1212);
		q1.setQuestion("What is java");
	     
		// creating answer
		Answer answer = new Answer();
		answer.setAnswerId(342);
	    answer.setAnswer("Java is a programming language");
	    q1.setAnswer(answer);
	    answer.setQuestion(q1);
	    
	    // creating question
	    Question q2 = new Question();
		q2.setQuestionid(242);
		q2.setQuestion("What is hibernate");
		
		// creating answer
		Answer answer1 = new Answer();
		answer1.setAnswerId(344);
	    answer1.setAnswer("A tool to interact with the database ");
	    q2.setAnswer(answer1);
	    answer1.setQuestion(q2);
	    
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction(); 
		
		
		session.save(q1);
		session.save(answer);
		
		session.save(q2);
		session.save(answer1);
		
		tx.commit(); 
		
		
		// Fetching ....
		
	Question question = (Question)session.get(Question.class, 1212);
	System.out.println(question.getQuestion());
	System.out.println(question.getAnswer().getAnswer());
		
		
		
		session.close();
		sessionFactory.close();
		
		
		
   }
	
	
}
