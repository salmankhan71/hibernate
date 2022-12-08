package com.stmt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentMainClass {

	public static void main(String[] args) {
		System.out.println("project Start");
		 Configuration configuration = new Configuration();
	        configuration.configure("hibernate.cfg.xml");
	        configuration.addAnnotatedClass(Student.class);
	 
	        // Create Session Factory
	        SessionFactory sessionFactory
	            = configuration.buildSessionFactory();
	 
	        // Initialize Session Object
	        Session session = sessionFactory.openSession();
	 
	        Student student = new Student();
	 
	        student.setId(1);
	        student.setSongName("Broken Angel");
	        student.setArtist("Akon");
	 
	        session.beginTransaction();
	 
	        // Here we have used
	        // save() method of JPA
	        session.save(student);
	 
	        session.getTransaction().commit();
	    }
	}