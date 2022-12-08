package com.hibernate1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Project start");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Emp<Project> e1 = new Emp<Project>();
		Emp<Project> e2 = new Emp<Project>();

		e1.setId(12);
		e1.setName("salman");

		e2.setId(30);
		e2.setName("Imran");

		Project p1 = new Project();
		Project p2 = new Project();

		p1.setPid(12123);
		p1.setProjectName("Library management system");

		p2.setPid(111);
		p2.setProjectName("CHATBOT");

		List<Emp> list = new ArrayList<>();
		List<Project> list2 = new ArrayList<>();

		list.add(e1);
		list.add(e2);

		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p2.setEmps(list);
		
		Session session=factory.openSession();
		Transaction tx =session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		tx.commit();
		session.close();
		factory.close();
		
	}

}
