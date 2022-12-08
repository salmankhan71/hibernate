package com.gufran;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EagerLoading {

	public static void main(String[] args) {
		System.out.println("project start");

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Alien alien = (Alien)session.get(Alien.class, 1);
		System.out.println(alien.getAid());
		System.out.println(alien.getAname());
		
		tx.commit();
		session.close();
		factory.close();
		
	}
}
