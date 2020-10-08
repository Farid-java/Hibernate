package lazy_eager;

import javax.persistence.FetchType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App {

public static void main(String[] args) {
	

	Configuration cfg=new Configuration().configure("lazy_eager/hibernate.cfg.xml").addAnnotatedClass(Question1.class).addAnnotatedClass(Answer1.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session= sf.openSession();
	System.out.println(session);
	
	// for Eager loading u have to write fetch = FetchType.EAGER in OneToOne or so on.
	//lazy loading or Eager loading 
	
	Question1 student =(Question1) session.get(Question1.class, 1);
	System.out.println(student.getQuestion_id());
	System.out.println(student.getQuestion_list());
	//after this u realize lazy loading answer query run after blow statement
	System.out.println(student.getAnswers().size());
	
	
}
}	