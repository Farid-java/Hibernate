package hql;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import embedabble.Student;

public class App {
	
public static void main(String[] args) {
	Configuration cfg=new Configuration().configure("hql/hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session= sf.openSession();
	
	//fetching All data from Db here Student is Class Name of Bean. 
	
	Query createQuery = session.createQuery("from Student");
	List<Student> list = createQuery.list();
	for(Student list11:list) {
		System.out.println(list11.getId()+" "+list11.getName()+" "+list11.getAddress()+" "+list11.getCourse().getCourse()+" "+list11.getCourse().getDuration());
	}
	
	// fetching single data 
	
	Query createQuery2 = session.createQuery("from Student where Name=:n");
	String s="farid";
	  createQuery2.setString("n", s);
	  Student uni = (Student) createQuery2.uniqueResult();
System.out.println(uni.getId()+" "+ uni.getName()+" "+uni.getAddress()+" "+uni.getCourse().getCourse()+" "+uni.getCourse().getDuration());

//fetching data based on where clause 

//Query createQuery3 = session.createQuery("from Student where address=:c");
//String s1="sakinaka";
//createQuery3.setString("c", s1);
//List<Student> list2 = createQuery3.list();
//for(Student student:list2) {
//	System.out.println(student.getId()+" "+student.getName()+" "+student.getAddress()+" "+student.getCourse().getCourse()+" "+student.getCourse().getDuration());
//}

// update data from Db

//Query createQuery4 = session.createQuery("update Student set name=:n   where id=:n1 ");
//createQuery4.setString("n", "Kartik");
//createQuery4.setInteger("n1", 1);
//int executeUpdate = createQuery4.executeUpdate();
//System.out.println(executeUpdate+" " +"update");
//Transaction transaction = session.beginTransaction();
//transaction.commit();
//session.close();

// delete data from Db

//Query createQuery5 = session.createQuery("delete from Student s  where s.id=:i");

//createQuery5.setString("i", "2");
//int executeUpdate2 = createQuery5.executeUpdate();
//System.out.println(executeUpdate2+" " +"deleted");
//Transaction transaction = session.beginTransaction();
//transaction.commit();
//session.close();

// execute join query

Query createQuery6 = session.createQuery("select q.question_id ,q.question_list , a.answer_list from Question as q INNER JOIN q.answer as a ");
List<Object[] > li = createQuery6.list();
for(Object[] arr:li)
{
System.out.println(Arrays.toString(arr));	
}


// Pagination in HQl
Query createQuery7 = session.createQuery("from Student");
createQuery7.setFirstResult(0);// it give starting index.
createQuery7.setMaxResults(2);// it give max limit from 0 index to maximum 1 index
List<Student> list2 = createQuery7.list();
for(Student st:list2) {
	System.out.println(st.getId()+" "+st.getName()+" "+st.getAddress()+" "+st.getCourse().getCourse()+" "+st.getCourse().getDuration());
}

}
}
