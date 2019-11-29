package in.cdac;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Sample {
	public static void main(String[] args) {
		// loading the configuration file of hibernate
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		Query<Student> query = session.createQuery("From Student", Student.class);
		List<Student> results = query.getResultList();
		System.out.println(results);
		
		session.close();
	}
}
