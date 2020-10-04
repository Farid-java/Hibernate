package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Answer {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + "]";
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String answer;
	
	
	
	  @OneToOne
	  
	  @JoinColumn(name = "question_id" , nullable = false ) private Question
	  question; public Question getQuestion() { return question; } public void
	  setQuestion(Question question) { this.question = question; }
	 
	  
}
