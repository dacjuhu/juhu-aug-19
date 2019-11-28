package in.cdac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HelloHibernate {
	public static void main(String[] args) {
		
		// loading the configuration file of hibernate
		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();
		System.out.println(session);
		
		

		System.out.println("Connection Success!!!!");
		sessionFactory.close();
	}
}
