import java.util.Iterator;
import java.util.List;

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
		getSessionFactory();
		Client client_1 = new Client();
		
		Address add1 = new Address("Flemingo Road", "Washington DC", "USA", "532");
		Student std1 = new Student(1, "Muzammil", 9, "A");
		std1.setAddress(add1);
		client_1.insertData(std1, add1);
		
		Address add2 = new Address("Mg Road", "Telangana", "India", "50014");
		Student std2 = new Student(1, "Zayn", 9, "A");
		std2.setAddress(add2);
		client_1.insertData(std2, add2);
		
		try {
			client_1.displayRecords();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertData(Student stdObj, Address addObj) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(stdObj);
		session.save(addObj);
		
		tx.commit();
		System.out.println("Student and Address are inserted into the database");
		session.close();
	}
	
	public void displayRecords() throws InterruptedException {
		Session session = factory.openSession();
		
		List employees = session.createQuery("FROM Employee").list();
		
		for (Iterator iterator = employees.iterator(); iterator.hasNext(); ) {
			Student student = (Student) iterator.next();
			System.out.println("Roll no :"+student.getRollNo());
			System.out.println("Name :"+student.getName());
			System.out.println("Standard :"+student.getStandard());
			System.out.println("Section :"+student.getSection());
			
			Address add = student.getAddress();
			System.out.println("student");
			System.out.println("Street :"+add.getStreet());
			System.out.println("City :"+add.getCity());
			System.out.println("State :"+add.getState());
			System.out.println("Zip Code :"+add.getZipcode());
		}
	}

}
