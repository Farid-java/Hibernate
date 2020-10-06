package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ManyToMany_Question1")
public class Qu {
    @Id
	private int question_id;
    public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion_list() {
		return question_list;
	}
	public void setQuestion_list(String question_list) {
		this.question_list = question_list;
	}
	@Column(name = "Question")
	private String question_list;
	
	@ManyToMany 
	private List<An> answerAns;
	public List<An> getAnswerAns() {
		return answerAns;
	}
	public void setAnswerAns(List<An> answerAns) {
		this.answerAns = answerAns;
	}
	 
}
