package hql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Question {
     @Id
	private int question_id;
     
     public Question(int question_id, Answer answer, String question_list) {
		super();
		this.question_id = question_id;
		this.answer = answer;
		this.question_list = question_list;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	@OneToOne
     private Answer answer;
	
	
	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
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
