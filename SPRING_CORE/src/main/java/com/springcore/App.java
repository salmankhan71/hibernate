package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("configuration.xml");
        Student s = (Student)context.getBean("student1");
        Student s2 =(Student) context.getBean("student2");
        
        System.out.println(s);
        System.out.println(s2);
    }
}
