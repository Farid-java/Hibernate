package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Question.class);
		SessionFactory sf=cfg.buildSessionFactory();
    	Session session= sf.openSession();
    	
    	Answer answer=new Answer();
    	//answer.setId(1);
    	answer.setAnswer("Java is programing language");
    	Question question=new Question();
    	//question.setId(12);
    	question.setQuestionString("What is java ");
    	question.setAnswer(answer);
    	
    	System.out.println(question);
    	session.save(question);
    	session.save(answer);
    	
    	Transaction beginTransaction = session.beginTransaction();
    	beginTransaction.commit();
    	//session.close();
    	
    }
}
