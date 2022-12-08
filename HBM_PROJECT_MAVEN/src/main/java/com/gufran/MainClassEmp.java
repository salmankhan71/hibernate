package com.gufran;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClassEmp {

	public static void main(String[] args) {
		System.out.println("start project");

		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		/*
		 * Employee emp = new Employee(); emp.setId(2); emp.setName("Imran");
		 * emp.setDob(1995);
		 */
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee employee = session.get(Employee.class, 2);
		System.out.println(employee.getName());
		System.out.println(employee.getDob());

		//session.save(emp);
		tx.commit();
		session.close();
		factory.close();

	}

}
