package salman.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student {

	public static void main(String[] args) {
		System.out.println("Project Start");
		Address address=new Address();
		
		  address.setId(2); 
		  address.setName("Imran");
		  address.setCity("Karnatka");
		  System.out.println(address);
		 
        Configuration cfg =new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory =cfg.buildSessionFactory();
        Session session =factory.openSession();
        Transaction t =session.beginTransaction();
        
       
        
        
        
       session.save(address);
        t.commit();
        
		
		  session.close();
		  factory.close();
		 
	}

}
