package embedabble;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		
	Configuration cfg=new Configuration().configure("embedabble/hibernate.cfg.xml").addAnnotatedClass(Student.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session= sf.openSession();
	
	// first student
	Student student=new Student();
	student.setName("Gufran");
	student.setAddress("Sakinaka");
	
	Course course=new Course();
	course.setCourse("JAVA");
	course.setDuration("3 month");
	student.setCourse(course);
	
	
	// second student
	Student student1=new Student();
	student1.setName("Farid");
	student1.setAddress("Sakinaka");
	
	Course course1=new Course();
	course1.setCourse("Python");
	course1.setDuration("2 month");
	student1.setCourse(course1);
	
	// Third student
		Student student2=new Student();
		student2.setName("Rahul");
		student2.setAddress("Andheri");
		
		Course course2=new Course();
		course2.setCourse("C++");
		course2.setDuration("1 month");
		student2.setCourse(course2);
		
	
	
	Transaction transaction = session.beginTransaction();
	
	session.save(student);
	session.save(student1);
	session.save(student2);
	
	transaction.commit();
	
	
	  Query create= session.createQuery("from Student");
	  List list = create.list();
	  Iterator iterator = list.iterator(); 
	  while(iterator.hasNext())
	  { Student next=(Student) iterator.next();
	  System.out.println(next.getId()+" "+next.getName()+" "+next.getAddress()+" "
	  +next.getCourse().getCourse()+" "+next.getCourse().getDuration()); }
	 
	
	
	 
	session.close();
}
}