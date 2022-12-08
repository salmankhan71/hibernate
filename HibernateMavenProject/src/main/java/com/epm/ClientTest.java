package com.epm;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientTest {

	public static void main(String[] args) {
		System.out.println("project Start");
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		Employee1 emp1 = new Employee1();
		emp1.setEmployeeName("Obaid bhai");
		emp1.setEmail("obaid@1456gmail.com");
		emp1.setSalary(90000.00);
		emp1.setDob(new Date());
		
		Employee1 employee2 = new Employee1();
		employee2.setEmployeeName(" Mohshin");
		employee2.setEmail("mohshin9876@gmail.com");
		employee2.setSalary(270000.00);
		employee2.setDob(new Date());
		
		Employee1 employee3 = new Employee1();
		employee3.setEmployeeName("Imram");
		employee3.setEmail("imran3421.gmail.com");
		employee3.setSalary(150000.00);
		employee3.setDob(new Date());
		
		Department department = new Department();
		department.setDepartmentName("ITT");
		department.setDepartmentLocation("karnatka");
		
		department.getEmpList().add(emp1);
		department.getEmpList().add(employee2);

		department.getEmpList().add(employee3);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(department);
		tx.commit();
		session.close();
		factory.close();
	}}