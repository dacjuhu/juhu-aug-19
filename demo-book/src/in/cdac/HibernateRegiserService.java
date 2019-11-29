package in.cdac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateRegiserService {

	public static void regiserUser(User user) throws Exception {
		
		SessionFactory sessionFactory =  HibernateUtil.sessionFactory();
		
		// get the connection 
		Session session =  sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(user);
		
		txn.commit();
		session.close();
	}
}
