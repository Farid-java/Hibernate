package image.and.date;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name = "ImageAndDate")
public class ImageAndData {
  public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
   @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Student_Id", length = 50)
	private int studentid;
  
  @Column(name = "Student_Address", length = 100)
	private String studentaddress;
  
  @Transient
	private double x;
  
  @Column(name = "Date")
  @Temporal(TemporalType.DATE)
	private Date date;
  
  @Lob
	private byte[] image;
	
	
}
