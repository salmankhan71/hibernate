package com.book;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class DemoMainClass {

	public static void main(String[] args) {
		System.out.println("java hinernate start");
		Configuration cfg = new Configuration();
		cfg.configure("com/book/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		/*
		 * Question q1 = new Question(); q1.setQuestionId(1212);
		 * q1.setQuestion("what is the java?");
		 * 
		 * Answer answer = new Answer(); answer.setAnserId(343);
		 * answer.setAnswer("java is the programming laguage "); answer.setQuestion(q1);
		 * 
		 * Answer answer1 = new Answer(); answer1.setAnserId(34);
		 * answer1.setAnswer("With the help java we can create software ");
		 * answer1.setQuestion(q1);
		 * 
		 * Answer answer2 = new Answer(); answer2.setAnserId(35);
		 * answer2.setAnswer("java is the different type of fremwork");
		 * 
		 * List<Answer> allAnswers=new ArrayList<Answer>(); allAnswers.add(answer1);
		 * allAnswers.add(answer2); q1.setAnswers(allAnswers);
		 */
		 
		 Session session=factory.openSession();
		 Transaction tx=session.beginTransaction();
		 
			/*
			 * session.save(q1); session.save(answer1); session.save(answer2);
			 */
			
			Question que =(Question) session.get(Question.class, 1212);
			System.out.println(que.getQuestionId());
			System.out.println(que.getQuestion());
			System.out.println(que.getAnswers().size());
			/*
			 * for(Answer s:que.getAnswers()) { System.out.println(s.getAnswer()); }
			 */
			
			tx.commit();
			
		
			session.close();
			factory.close();		 
		
	}
}