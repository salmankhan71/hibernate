package com.hql;

import java.util.List;

import javax.persistence.criteria.From;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hql2.Student;

public class HQLexamle {

	public static void main(String[] args) {
		System.out.println("projec Running");
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		/*
		 * Student student = new Student(); student.setId(6); student.setName("salman");
		 * student.setCity("Blaipur"); student.setCourse("Python");
		 */
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		// HQL
		// Syntax

		/*
		 * String query = "from Student where city='Bhatpara'"; Query q =
		 * session.createQuery(query); List<Student> list = q.list(); for (Student p :
		 * list) { System.out.println(p.getName() + ":" + p.getCourse()); }
		 */

		String query="from Student as s where s.city=:x and s.name=:n" ;
		Query qt = session.createQuery(query);
		qt.setParameter("x", "Bhatpara");
		qt.setParameter("n", "Iqra");
		List<Student> list = qt.list();
		
		for(Student sb:list)
		{
			System.out.println(sb.getName()+":"+sb.getCourse());
		}
		
		
		
		// session.save(student);
		tx.commit();
		session.close();
		factory.close();
	}

}
