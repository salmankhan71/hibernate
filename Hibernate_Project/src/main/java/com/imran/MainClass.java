package com.imran;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		FirstClass class1 = new FirstClass();
		class1.setId(2);
		class1.setName("Imran khan");
		class1.setCollege("M.I.H.S.SCHOOL");
		System.out.println(class1);

		Configuration c = new Configuration().configure();
		c.addAnnotatedClass(com.imran.FirstClass.class);

		StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder().applySettings(c.getProperties());

		SessionFactory factory = c.buildSessionFactory(sb.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(class1);
		System.err.println("hello");
    session.save(class1);
		transaction.commit();
		session.close();
		factory.close();

	}

}
