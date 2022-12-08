package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Apple {

	public static void main(String[] args) {
	System.out.println("hello world");
	Orang orang=new Orang();
	orang.setId(123);
	orang.setName("Aatif");
	orang.setCollege("pune inversity");
	
	Configuration configuration=new Configuration().configure("Hibernate.cfg.xml");
SessionFactory factory=configuration.buildSessionFactory();
Session session=factory.openSession();
Transaction transaction=session.beginTransaction();
System.out.println(orang);
session.save(orang);
transaction.commit();
session.close();
factory.close();
	}

}
