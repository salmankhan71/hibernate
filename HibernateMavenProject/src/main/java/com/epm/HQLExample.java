package com.epm;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class HQLExample {

	public static void main(String[] args) {
		System.out.println("project runing start");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String q = "select * from employee1";

		NativeQuery qn = session.createSQLQuery(q);

		List<Object[]> list = qn.list();

		for (Object[] st : list) 
		{
			System.out.println(st[4]+":"+st[3]);
		}

	}
}
