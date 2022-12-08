package com.src;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory factory = cfg.buildSessionFactory();
		
		StudentAddress address = new StudentAddress();
		address.setParAddress("BHATPATA");
		address.setCurAddress("MUMBAI");
		

		Student student = new Student();
		student.setSid(1);
		student.setSname("kalam");
		student.setAddress(address);

		System.out.println(student);

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		/*
		 * Student student2 = session.get(Student.class, 2);
		 * System.out.println(student2.getId());
		 */
		session.save(student);
		transaction.commit();
		session.close();
		factory.close();

	}
}
