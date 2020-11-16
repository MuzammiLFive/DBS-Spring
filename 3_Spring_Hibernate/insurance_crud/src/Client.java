import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
		
		Insurance ins = new Insurance(101, "Muzammil", 10, 10000);
		client_1.insertData(ins);
		
		try {
			client_1.DisplayRecords();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertData(Insurance insObj) {
		Session session = factory.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		
		session.save(insObj);
		tx.commit();
		session.close();
	}
	
	public void DisplayRecords() throws InterruptedException {
		Session session = factory.openSession();
		List<Insurance> cus = session.createQuery("FROM Insurance").list();
		
		for (Iterator iterator = cus.iterator(); iterator.hasNext(); ) {
			Insurance i = (Insurance) iterator.next();
			System.out.println("Policy No :"+i.getPolicyNo());
			System.out.println("Name :"+i.getName());
			System.out.println("Tenure :"+i.getTenure());
			System.out.println("Due :"+i.getDue());
		}
	}

}
