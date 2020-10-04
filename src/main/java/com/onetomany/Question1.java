package com.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Question1 {
    @Id
	private int question_id;
    
    @OneToMany
    private List<Answer1> answers;
    
	public List<Answer1> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer1> answers) {
		this.answers = answers;
	}
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
	private String question_list;
}
