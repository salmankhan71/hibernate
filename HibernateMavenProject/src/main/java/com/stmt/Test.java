package com.stmt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	

	public static void main(String[] args) {
		System.out.println("project satart");
		
		App app=new App();
		app.setId(3);
		app.setName("Ayaz");
		app.setCity("Basti");
	Configuration cfg =new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	session.save(app);
	t.commit();
	session.close();
	factory.close();
	}
}
