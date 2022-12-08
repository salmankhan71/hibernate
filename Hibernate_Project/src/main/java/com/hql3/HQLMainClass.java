package com.hql3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLMainClass {

	public static void main(String[] args) {
		System.out.println("projec Running");
		Configuration cfg = new Configuration().configure("src/main/java/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
      Session session=factory.openSession();
      System.out.println("-------------------------------------------------");
      Transaction tx=session.beginTransaction();
      
      Query query2 = session.createQuery("update Student set city=:c where name=:n");
  	query2.setParameter("c", "Bhatpara");
  	query2.setParameter("n", "Iqra");
  	int e = query2.executeUpdate();
  	System.out.println(e+" Object Update");
  	
  	tx.commit();
  	session.close();
  	factory.close();
	}

}
