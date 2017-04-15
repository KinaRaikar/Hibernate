package com.kiran.app;

import com.kiran.model.UserDetailsM2M;
import com.kiran.model.VehicleM2M;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppManyToMany {

    public static void main(String args[]) {
        try {
            SessionFactory sf = new Configuration().configure().buildSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            UserDetailsM2M user = new UserDetailsM2M();
            user.setUserName("First User");

            VehicleM2M vehicle = new VehicleM2M();
            vehicle.setVehicleName("Bike");
            vehicle.getUserDetailsM2M().add(user);
            user.getVehicles().add(vehicle);

            VehicleM2M vehicle1 = new VehicleM2M();
            vehicle1.setVehicleName("Car");
            vehicle1.getUserDetailsM2M().add(user);
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
