package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	
public static void main(String[] args) {
	Configuration cfg=new Configuration().configure().addAnnotatedClass(com.onetomany.Question1.class).addAnnotatedClass(Answer1.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session= sf.openSession();
	System.out.println(session);
	
	
	   //Question 1 
	   com.onetomany.Question1 question1=new com.onetomany.Question1();
	   question1.setQuestion_id(1);
	  question1.setQuestion_list("What is java?");
	  
	 //  many Answer for one Question
	   Answer1 answer=new Answer1();
	  answer.setAnswer_id(11);
	  answer.setAnswer_liSt("Java is programing Language");
	  
	  Answer1 answer1=new Answer1(); answer1.setAnswer_id(12);
	  answer1.setAnswer_liSt("Java is used to make softwere");
	  
	  Answer1 answer2=new Answer1(); answer2.setAnswer_id(13);
	  answer2.setAnswer_liSt("Java is easy to use");
	  
	  
	  List<Answer1> list=new ArrayList<Answer1>(); list.add(answer);
	  list.add(answer1); list.add(answer2);
	  
	  question1.setAnswers( list);
	  
	  
	  Transaction beginTransaction = session.beginTransaction();
	  session.save(question1); session.save(answer); session.save(answer1);
	  session.save(answer2); beginTransaction.commit();
	 
    Question1    question = (Question1) session.get(Question1.class, 1);
    System.out.println(question.getQuestion_list());
List<Answer1> answers = question.getAnswers();   
for(Answer1 answers11:answers)
{
	
	System.out.println(answers11.getAnswer_liSt());
}



  // Question 2 
com.onetomany.Question1 question2=new
  com.onetomany.Question1(); question2.setQuestion_id(2);
  question2.setQuestion_list("What is python?");
  
  // many Answer for one Question
  Answer1 answer21=new Answer1();
  answer21.setAnswer_id(21);
  answer21.setAnswer_liSt("python is programing Language");
  
  Answer1 answer22=new Answer1(); answer22.setAnswer_id(22);
  answer22.setAnswer_liSt("python is used to make softwere");
  
  Answer1 answer23=new Answer1(); answer23.setAnswer_id(23);
  answer23.setAnswer_liSt("python is easy to use");
  
  List<Answer1> list1=new ArrayList<Answer1>(); list1.add(answer21);
  list1.add(answer22); list1.add(answer23);
  
  question2.setAnswers(list1);
  
  session.save(question2); session.save(answer21); session.save(answer22);
  session.save(answer23);
 
Transaction beginTransaction1 = session.beginTransaction();
Question1 questiona= (Question1) session.get(Question1.class, 2);
System.out.println(questiona.getQuestion_list());
List<Answer1> answers2 = questiona.getAnswers();
for(Answer1 ans:answers2) {
	System.out.println(ans.getAnswer_liSt());
}
beginTransaction1.commit();

    session.close();
}
}
