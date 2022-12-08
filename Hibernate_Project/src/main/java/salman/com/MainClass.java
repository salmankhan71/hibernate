    package salman.com;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Project Start");
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		
		Question question=new Question();
		question.setQuestionId(1);
		question.setQuestion("What is java");
		
		Answer answer1=new Answer();
		answer1.setAnswerId(11);
		answer1.setAnswer("java is the programming laguage");
		answer1.setQuestion(question);
		
		Answer answer2=new Answer();
		answer2.setAnswerId(15);
		answer2.setAnswer("java is the high level programming laguage");
		answer2.setQuestion(question);
		
		List<Answer> allAnswers=new ArrayList<>();
		allAnswers.add(answer1);
		allAnswers.add(answer2);
		question.setAnswers(allAnswers);
		Transaction transaction=session.beginTransaction();
		
		session.save(question);
		session.save(answer1);
		session.save(answer2);
		
		
		
		transaction.commit();
		System.err.println("Inserted");
		session.close();
		factory.close();
		

	}

}
