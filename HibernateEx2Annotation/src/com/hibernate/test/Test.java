package com.hibernate.test;

import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * 
 * @author Ravi
 *
 */

public class Test {
	public static void main(String[] args) {
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();

		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setId(1001);
		e1.setFirstName("Ravi");
		e1.setLastName("Kumar");

		Employee e2 = new Employee();
		e2.setId(1002);
		e2.setFirstName("Ashok Kumar");
		e2.setLastName("jaiswal");

		session.persist(e1);
		session.persist(e2);

		t.commit();
		session.close();
		System.out.println("Two records saved Successfully.");
	}
}
