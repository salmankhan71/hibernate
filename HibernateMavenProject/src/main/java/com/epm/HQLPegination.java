package com.epm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class HQLPegination {

	public static void main(String[] args) {
System.out.println("project runing start");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
     Session session=factory.openSession();
     
    Query query= session.createQuery("from Employee1");
    
    //implementing prenation using hibernate
    
    query.setFirstResult(0);
    query.setMaxResults(3);
    List<Employee1> list=query.list();
    
    for(Employee1 st:list)
    {
    	System.out.println(st.getEmployeeId()+" "+st.getEmployeeName()+" "+st.getSalary());
    }
    session.close();
    factory.close();

	}

}
