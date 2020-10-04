package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Answer {
   @Id
	private int answer_id;

	
	  @OneToOne(mappedBy = "answer")
	  private Question question;
	 
	
	  public Question getQuestion() { return question; } public void
	  setQuestion(Question question) { this.question = question; }
	 
	public int getAnswer_id() {
	return answer_id;
}
public void setAnswer_id(int answer_id) {
	this.answer_id = answer_id;
}
public String getAnswer_list() {
	return answer_list;
}
public void setAnswer_list(String answer_list) {
	this.answer_list = answer_list;
}
	private String answer_list;
}
