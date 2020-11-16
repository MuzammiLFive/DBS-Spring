import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Client {

	private static SessionFactory factory;
	
	public static void getSessionFactory() {
		try {
			Configuration conf = new Configuration().configure();
			StandardServiceRegistryBuilder builder =  new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
			factory = conf.buildSessionFactory(builder.build());
		} catch(Throwable ex) {
			System.err.println("Failed to create sessionFactory object. "+ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		getSessionFactory();
		Client client_1 = new Client();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Set<Student> Std1 = new HashSet<Student>();
		Set<Student> Std2 = new HashSet<Student>();
		Set<Student> Std3 = new HashSet<Student>();
		Set<Student> Std4 = new HashSet<Student>();
		Std1.add(new Student(93, "Muzammil Hussain"));
		Std1.add(new Student(98, "Dilip kumar"));
		Std2.add(new Student(68, "Abhilash"));
		Std2.add(new Student(83, "Nikhil"));
		Std3.add(new Student(61, "Rohan"));
		Std3.add(new Student(70, "Sai Kiran"));
		Std4.add(new Student(88, "B K Arjun"));
		Std4.add(new Student(90, "M A Nayeem"));
		
		College Clg1 = new College ("GRIET", "Gokaraju Rangaraju", Std1);
		College Clg2 = new College ("CBIT", "Chaitanya Bharathi", Std2);
		College Clg3 = new College ("VNR", "Vignan Jyothi", Std3);
		College Clg4 = new College ("JNTU", "Jawaharlal Nehru", Std4);
		
		session.save(Clg1);
		session.save(Clg2);
		session.save(Clg3);
		session.save(Clg4);
		tx.commit();
		client_1.displayRecords();
		} 
		catch(HibernateException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void displayRecords() throws HibernateException{
		Session session = factory.openSession();

		List<Student> stdList = session.createQuery("FROM Student_details").list();
		display(stdList);
		List clgList = session.createQuery("FROM college").list();
		display(clgList);
		List clgstd = session.createQuery("FROM CLGSTU").list();
		display(clgstd);
		session.close();
	}
	
	public void display(List obj) {
		for(Iterator iterator = obj.iterator(); iterator.hasNext();) {
			College clg = (College) iterator.next();
			System.out.println(clg.toString());
		}
	}
	

}
