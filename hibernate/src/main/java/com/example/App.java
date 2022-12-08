package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		System.out.println("hello world");

		Student student = new Student();
		student.setId(103);
		student.setName("Mohad");
		student.setCity("balaipur");
		System.out.println("hello world................");

		

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		System.out.println("hello world");

		Session session = factory.openSession();
		System.out.println("hello world1");

		Transaction transaction = session.beginTransaction();
		System.out.println(student);
		session.save(student);
	

		transaction.commit();
		session.close();
		factory.close();

	}

}
