package get_and_load;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import image.and.date.ImageAndData;

public class App {
public static void main(String[] args) {
	

	Configuration cfg=new Configuration().configure("get_and_load/hibernate.cfg.xml").addAnnotatedClass(ImageAndData.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session= sf.openSession();
	System.out.println(session);
	
	// use of get method 
	// use only when u dont know about object(data) present on database.
	//it check object present in cache if not then hit query to Db before using Syso.
	ImageAndData   img =(ImageAndData) session.get(ImageAndData.class, 1);
	
	//System.out.println(img);
	
	// use of load method
	//use only when u confirm object is present in DB otherwise throw exception.
	//it check object from cache if not then hit database only after u use Syso till that time give proxy object.
	ImageAndData load = (ImageAndData)session.load(ImageAndData.class, 1);
	//System.out.println(load);
	
	Transaction transaction = session.beginTransaction();
	transaction.commit();
	session.close();
	
	
}
}