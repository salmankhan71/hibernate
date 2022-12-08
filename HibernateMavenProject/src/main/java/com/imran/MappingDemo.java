package com.imran;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		System.out.println("project start in hibernate");
		Configuration cfg=new Configuration();
		cfg.configure("com/imran/imran.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.setEid(34);
		e1.setName("salman");
		
		e2.setEid(35);
		e2.setName("Imran");
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPid(12121);
		p1.setProjectName("Liberary Managment System");
		
		p2.setPid(12214);
		p2.setProjectName("HATBOT");
		
		List<Emp> list1=new ArrayList<Emp>();
		List<Project> list2=new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p2.setEmps(list1);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		session.close();
		factory.close();
		

	}

}
