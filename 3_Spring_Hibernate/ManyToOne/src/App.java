import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App {
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
		try {
			getSessionFactory();
			
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			
			Set<Teacher> teachers = new HashSet<Teacher>();
			teachers.add(new Teacher("Radha"));
			teachers.add(new Teacher("Nariman"));
			
			Student student1 = new Student("Muzammil", teachers);
			Student student2 = new Student("Raghu", teachers);
			
			session.save(student1);
			session.save(student2);
			tx.commit();
			session.close();
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
		}
	}
}
