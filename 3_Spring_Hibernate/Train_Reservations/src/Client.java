import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Client {
	
	private static SessionFactory factory;
	
	//Obtain session factory
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
			ArrayList<Reservation> bookings = new ArrayList<Reservation>();
			
			bookings.add(new Reservation(1, "Muzammil", "Hyderabad", "Delhi", 21));
			bookings.add(new Reservation(2, "Raghu", "Hyderabad", "Delhi", 46));
			bookings.add(new Reservation(3, "Arjun", "Hyderabad", "Delhi", 30));
			bookings.add(new Reservation(4, "Nayeem", "Hyderabad", "Delhi", 27));
			bookings.add(new Reservation(5, "Abhi", "Hyderabad", "Delhi", 40));
			client_1.InsertRecordIntoDatabase(bookings);
			
			client_1.DisplayRecords();
			
		} catch(HibernateException e) {
			System.out.println("Exception is :"+e);
		}

	}
	
	public void InsertRecordIntoDatabase(ArrayList<Reservation> bookings) throws HibernateException{
		Session session = factory.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		
		for (Iterator iterator=bookings.iterator(); iterator.hasNext();) {
			Reservation booking = (Reservation) iterator.next();
			session.save(booking);
		}
		tx.commit();
		session.close();
	}
	
	public void DisplayRecords() throws HibernateException {
		Session session = factory.openSession();
		Criteria cr = session.createCriteria(Reservation.class);
		
		cr.add(Restrictions.gt("age", 25));
		cr.add(Restrictions.lt("age", 45));
		
		List<Reservation> bookingList = cr.list();
		
		for (Iterator iterator=bookingList.iterator(); iterator.hasNext(); ) {
			Reservation booking = (Reservation) iterator.next();
			System.out.println("Ticket No :"+booking.getTicketNo());
			System.out.println("Name :"+booking.getName());
			System.out.println("Departure :"+booking.getFrom());
			System.out.println("Destination :"+booking.getDest());
			System.out.println("Age :"+booking.getAge());
		}
		session.close();
	}
}
