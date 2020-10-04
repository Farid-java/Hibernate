package image.and.date;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetoone.Question;

public class App {
public static void main(String[] args) throws IOException {
	Configuration cfg=new Configuration().configure().addAnnotatedClass(ImageAndData.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session= sf.openSession();
	 
	ImageAndData imageAndData=new ImageAndData();
	imageAndData.setStudentaddress("Room No 10 Sakanaka Mohilivillage Mumbai 400072");
	imageAndData.setDate(new Date());
	imageAndData.setX(30332555.555551);
	
	FileInputStream fis=new FileInputStream("src/main/java/Farid.jpg");
	byte[] data=new byte[fis.available()];
	fis.read(data);
	imageAndData.setImage(data);
	
	session.save(imageAndData);
	Transaction beginTransaction = session.beginTransaction();
beginTransaction.commit();
session.close();
}
}