package lazy_eager;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Answer1 {
        @Id
	private int answer_id;
        @ManyToOne
        private Question1 question1;
        
	public Question1 getQuestion1() {
			return question1;
		}
		public void setQuestion1(Question1 question1) {
			this.question1 = question1;
		}
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
	private String answer_liSt;
}
