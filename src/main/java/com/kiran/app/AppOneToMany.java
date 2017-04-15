package com.kiran.app;

import com.kiran.model.UserDetailsO2M;
import com.kiran.model.VehicleM2O;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppOneToMany {

	public static void main(String args[]) {
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();

			UserDetailsO2M user = new UserDetailsO2M();
			user.setUserName("First User");

			VehicleM2O vehicle = new VehicleM2O();
			vehicle.setVehicleName("Bike");
			vehicle.setUserDetailsO2M(user);
			user.getVehicles().add(vehicle);

            VehicleM2O vehicle1 = new VehicleM2O();
            vehicle1.setVehicleName("Car");
            vehicle1.setUserDetailsO2M(user);
            user.getVehicles().add(vehicle1);

			session.save(user);
			session.save(vehicle);
            session.save(vehicle1);

			tx.commit();
			session.close();

		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}
}
