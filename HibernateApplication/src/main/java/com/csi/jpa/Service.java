package com.csi.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
	
	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
	
	public static void main(String[] args) {
		
	Session session = factory.openSession();
	
	Transaction transaction = session.beginTransaction();
	
	Customer customer = new Customer("Mohit", 21908L, 21);
	
	session.save(customer);
	
	transaction.commit();
		
	System.out.println("Data Saved Successfully.");
	
	}
	
	
	
	
	
	

}
