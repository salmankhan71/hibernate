package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) throws IOException {
		System.out.println("Bismillah");
	Configuration configuration	=new Configuration().configure("hibernate.cfg.xml");
			SessionFactory factory = configuration.buildSessionFactory();
		//create object of Student class
		Student st = new Student();// object entered in transient state 
		st.setId(100);
		 st.setName("Imran khan");
		 st.setCity("Mumbai");
	
		System.out.println(st);
		
		//create object of Address class.
		
		College ad=new College();// object entered in transient state
		ad.setStreet("Bhatpara");
		ad.setCity("UttarPradesh");
		ad.setIsOpen("open");
		ad.setX(1483.3224);
		
		
		// image reading
		@SuppressWarnings("resource")
		FileInputStream fi=new FileInputStream("src/main/java/pic.jpg");
		byte [] data=new byte[fi.available()];
		fi.read(data);
		ad.setImage(data);
		ad.setAddedDate(new Date());
		Session session = factory.openSession();// here factory provides the current session
		Transaction tx = session.beginTransaction();// here session start the transaction.....
		session.save(st); // object entered in Persistent state
		session.save(ad);
		tx.commit();
		session.close();// object entered in Detached state
		factory.close();
		System.out.println("done");
	}
}