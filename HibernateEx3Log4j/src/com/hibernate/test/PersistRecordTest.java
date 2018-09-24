package com.hibernate.test;

import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * 
 * @author Ravi
 *
 */
public class PersistRecordTest {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(new Employee("Ravi", 4000));
		session.save(new Employee("Rajkumar", 6000));

		tx.commit();
		session.close();
		System.out.println("Two record persisted successfully.");

	}
}
