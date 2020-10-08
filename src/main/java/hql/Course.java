package hql;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Course {

	@Column(name = "Course" , length = 50)
	private String course;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Column(name = "Duration", length = 50)
	private String duration;
}
