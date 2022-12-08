package com.stmp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoadingObjectTest {

	public static void main(String[] args) {
		System.out.println("project Start");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		
		
		StudentEntity l = session.load(StudentEntity.class, 3040);
System.out.println(l.getClass()+" "+l.getClass().getSuperclass());
System.out.println(l.getName());
System.out.println(l.getCourse());

		/*
		 * StudentEntity student = session.get(StudentEntity.class, 3040);
		 * System.out.println(student);
		 * 
		 * StudentEntity student2= session.get(StudentEntity.class, 3654);
		 * System.out.println(student2);
		 * 
		 * System.out.println(student2.getName());
		 */
		
		/*
		 * StudentEntity st = new StudentEntity(); st.setStudentId(3040);
		 * st.setName("Gufran khan"); st.setCourse("python");
		 * st.setEmail("gufran1745@gmail.com");
		 * 
		 * session.save(st); tx = session.beginTransaction(); try { tx.commit();
		 * System.out.println("object is saved......."); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */

	}

}
