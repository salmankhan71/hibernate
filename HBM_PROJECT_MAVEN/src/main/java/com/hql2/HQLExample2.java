package com.hql2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

public class HQLExample2 {

	public static void main(String[] args) {
		System.out.println("projec Running");
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
      Session session=factory.openSession();
      
      String query="from Student as s where s.city=:x and s.name=:n" ;
		Query qt = session.createQuery(query);
		qt.setParameter("x", "Bhatpara");
		qt.setParameter("n", "Iqra");
		List<Student> list = qt.list();
		
		
		for(Student sb:list)
		{
			System.out.println(sb.getName()+":"+sb.getCourse());
		}
		System.out.println("-------------------------------------------------");
		
		Transaction tx=session.beginTransaction();
	//Query q3=session.createQuery("delete from Student s where s.city=:c");
	
	//delete Query
	/*
	 * q3.setParameter("c", "Bhatpara"); int r = q3.executeUpdate();
	 * System.out.println("delete"); System.out.println(r);
	 */
	//Update Query
	
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
