package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "ManyToMany_Answer1")
public class An {
        @Id
	private int answer_id;
       public int getAnswer_id() {
			return answer_id;
		}
		public void setAnswer_id(int answer_id) {
			this.answer_id = answer_id;
		}
		public String getAnswer_liSt() {
			return answer_liSt;
		}
		public void setAnswer_liSt(String answer_liSt) {
			this.answer_liSt = answer_liSt;
		}
	@Column(name = "Answer")
	private String answer_liSt;
	
	@ManyToMany 
 private List<Qu> questionList;
public List<Qu> getQuestionList() {
	return questionList;
}
public void setQuestionList(List<Qu> questionList) {
	this.questionList = questionList;
}
}
