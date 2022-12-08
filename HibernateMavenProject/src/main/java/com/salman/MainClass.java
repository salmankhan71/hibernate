package com.salman;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("salman khan");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("what is the java?");
		
		System.out.println("imran khan");

		Answer answer = new Answer();
		answer.setAnswerId(343);
		answer.setAnswer("java is the programming laguage ");

		System.out.println("hibernate start");
		q1.setAnswer(answer);
		//..........................................................
		Question q2 = new Question();
		q2.setQuestionId(242);
		q2.setQuestion("what is the Collection fremwork");
		
		System.out.println("imran khan");

		Answer answer2 = new Answer();
		answer2.setAnswerId(344);
		answer2.setAnswer("API to work with grop of object ");

		System.out.println("hibernate start");
		q1.setAnswer(answer2);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		System.out.println("java run");
		session.save(q1);
		session.save(q2);
		
		tx.commit();
	
		session.close();
		
		factory.close();
	}
}