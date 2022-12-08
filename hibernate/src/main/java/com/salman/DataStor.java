package com.salman;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import com.example.Student;

public class DataStor {

	public static void main(String[] args) {
		System.out.println("project start");
		StandardServiceRegistry Registry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(Registry).getMetadataBuilder().build();
		SessionFactory factory=metadata.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		/*
		 * Employee empl=new Employee(); empl.setId(16); empl.setFirrstName("salman");
		 * empl.setLastName("khan");
		 */
		Student student =(Student) session.get(Student.class, 103);
		 System.out.println(student);
		//session.save();  
	   // transaction.commit();  
	    System.out.println("successfully saved");    
	    factory.close();  
	    session.close();    
	        

	}

}
