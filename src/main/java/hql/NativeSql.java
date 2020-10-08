package hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class NativeSql {
	
	public static void main(String[] args) {
		Session session=new Configuration().configure("hql/hibernate.cfg.xml").buildSessionFactory().openSession();
       Query createSQLQuery = session.createSQLQuery("select * from student_information");
	List<Object[]> list = createSQLQuery.list();
	for(Object[] a:list) {
		
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]);
	}
	}

}
