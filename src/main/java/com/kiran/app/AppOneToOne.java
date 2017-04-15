package com.kiran.app;

import com.kiran.model.UserDetails;
import com.kiran.model.Vehicle;
import com.kiran.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppOneToOne {

	public static void main(String args[]) {
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();

			UserDetails user = new UserDetails();
			user.setUserName("First User");

			Vehicle vehicle = new Vehicle();
			vehicle.setVehicleName("Bike");
			user.setVehicle(vehicle);

			session.save(user);
			session.save(vehicle);

			tx.commit();
			session.close();

		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}
}
