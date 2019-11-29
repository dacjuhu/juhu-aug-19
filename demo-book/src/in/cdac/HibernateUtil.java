package in.cdac;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory() {
		SessionFactory sessionFactory = null;
		
		if (sessionFactory == null) {
			sessionFactory =  new Configuration().configure().buildSessionFactory();	
		}
		
		return sessionFactory;
	}
	
}
