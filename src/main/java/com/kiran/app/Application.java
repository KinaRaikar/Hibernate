package com.kiran.app;

import com.kiran.model.UserDetails;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Application {
	private static final String URL = "jdbc:mysql://localhost:3306/hibernatedb";
	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String USERNAME = "hibernate";
	private static final String PASSWORD = "hibernate";
	public static void main(String args[]) {
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();

			UserDetails user = new UserDetails();
			user.setUserName("First User");

			session.save(user);

			tx.commit();
			session.close();

		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}
}
