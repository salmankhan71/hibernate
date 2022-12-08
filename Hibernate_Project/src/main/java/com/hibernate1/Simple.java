package com.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Simple {

	public static void main(String[] args) {
		Test t =new Test();
		t.setId(1);
		t.setName("Imran");
		t.setCity("baghNagar");
		Configuration configuration=new Configuration();
		configuration.configure("src/main/java/hibernate1.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(t);
		transaction.commit();
		session.close();
		factory.close();

	}

}
