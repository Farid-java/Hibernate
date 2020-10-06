package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	
public static void main(String[] args) {
	Configuration cfg=new Configuration().configure().addAnnotatedClass(com.manytomany.Qu.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session= sf.openSession();
	System.out.println(session);
	//creating Question class object
	Qu q=new Qu();
	Qu q1=new Qu();
	
	q.setQuestion_id(1000);
	q.setQuestion_list("Types of language?");
	
	q1.setQuestion_id(1001);
	q1.setQuestion_list("Name Any language?");
	
	// creating Answer class object
	An ans=new An();
	An ans1=new An();
	
	ans.setAnswer_id(1100);
	ans.setAnswer_liSt("Java ");
	
	ans1.setAnswer_id(1101);
	ans1.setAnswer_liSt("python ");
	
	//list for Question class
	List<Qu> list=new ArrayList<Qu>();
      list.add(q);
      list.add(q1);
  	//list for Answer class
      List<An> list1=new ArrayList<An>();
      list1.add(ans);
      list1.add(ans1);
      
      q.setAnswerAns(list1);
      ans.setQuestionList(list);
      
      session.save(q);
      session.save(q1);
      session.save(ans);
      session.save(ans1);
      
      Transaction transaction = session.beginTransaction();
      transaction.commit();
      
      session.close();
      
      
}
}