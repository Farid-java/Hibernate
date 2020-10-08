package com.onetoone;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
public static void main(String[] args) {
	// hibernate configuration
	Configuration cfg=new Configuration().configure().addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session= sf.openSession();
	System.out.println(session);
	
	Question question=new Question();
	Answer answer=new Answer();
	//setting answer in AnswerBean 
	answer.setAnswer_id(11);
	answer.setAnswer_list("Java is Programing language");
	answer.setQuestion(question);
	
	//setting question in QuestionBean 
	question.setQuestion_id(1);
	question.setQuestion_list("What is java");
	
	
	question.setAnswer(answer);
	
	
	Transaction tx=session.beginTransaction();	
	// save object to data base.
	session.save(question);
	session.save(answer);
	
	//session.save(answer);
	tx.commit();
	// for getting data from Data base
	Question q = (Question) session.get(Question.class, 1);
	System.out.println(q.getQuestion_list());
	System.out.println(q.getAnswer().getAnswer_list());
	
	session.close();
	
}
}
