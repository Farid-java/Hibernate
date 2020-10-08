package second_level_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Cache {

public static void main(String[] args) {
	Configuration cfg=new Configuration().configure("second_level_cache/hibernate.cfg.xml").addAnnotatedClass(Student.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session= sf.openSession();
	
	Student student = (Student) session.get(Student.class, 1);
	
	System.out.println(student);

	session.close();
	
	Session session1= sf.openSession();
	
	Student student1 = (Student) session1.get(Student.class, 1);
	System.out.println(student1);
	session1.close();
}
}
