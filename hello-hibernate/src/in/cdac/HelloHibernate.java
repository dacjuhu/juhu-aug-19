package in.cdac;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HelloHibernate {

	public static void main(String[] args) {

		 readAll();
		// createRecord();
	}
	
	public static void readAll() {
		SessionFactory sessionFactory = HiberanateUtil.sessionFactory();
		Session session = sessionFactory.openSession();
		
		// named query :id
		Query query =  session.createQuery("FROM Student ORDER BY id DESC");
		// query.setParameter("id", 1);
		
		List<Student> list = query.getResultList();
		
		System.out.println(list);
		
	}
	
	
	
	public static void deleteRecord() {

		SessionFactory sessionFactory = HiberanateUtil.sessionFactory();;
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Student std = new Student();
		std.setId(2);

		// this delete the recod in db
		session.delete(std);
		tx.commit();

		session.close();
		System.out.println("Record Delete");

	}
	

	public static void createRecord() {

		SessionFactory sessionFactory = HiberanateUtil.sessionFactory();;

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Student std = new Student();
		std.setId(101);
		std.setEmail("test@Test.com");
		std.setName("test");
		std.setMobile("12345");

		// this saves the recod in db
		session.save(std);
		tx.commit();

		session.close();
		System.out.println("Record Adddeed");

	}

	public static void updateRecord() {

		SessionFactory sessionFactory = HiberanateUtil.sessionFactory();;
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Student std = new Student();
		std.setId(2);
		std.setEmail("test@testtest.com");
		std.setName("test");
		std.setMobile("12345");

		// this update the recod in db
		session.update(std);
		tx.commit();

		session.close();
		System.out.println("Record UPdated");

	}

	public static void main1(String[] args) {

		// loading the configuration file of hibernate
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();
		System.out.println(session);

		System.out.println("Connection Success!!!!");
		sessionFactory.close();
	}
}
