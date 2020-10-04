package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table
public class Question  {
      @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
  public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuestionString() {
	return questionString;
}
public void setQuestionString(String questionString) {
	this.questionString = questionString;
}
private String questionString;

@OneToOne 
private Answer answer;
public Answer getAnswer() {
	return answer;
}
@Override
public String toString() {
	return "Question [id=" + id + ", questionString=" + questionString + ", answer=" + answer + "]";
}
public void setAnswer(Answer answer) {
	this.answer = answer;
}

}
