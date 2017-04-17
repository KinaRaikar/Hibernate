package com.kiran.app.strategy;

import com.kiran.model.strategy.singleTable.FourWheeler;
import com.kiran.model.strategy.singleTable.TwoWheeler;
import com.kiran.model.strategy.singleTable.Vehicle;
import com.kiran.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 * Created by kraikar on 4/17/2017.
 */
public class AppSingleTable {
    public static void main(String[] args) {
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleName("Car");

            TwoWheeler twoWheeler = new TwoWheeler();
            twoWheeler.setVehicleName("Pulsar");
            twoWheeler.setSteeringType("Steering Handle");

            FourWheeler fourWheeler = new FourWheeler();
            fourWheeler.setVehicleName("Alto");
            fourWheeler.setSteeringType("Steering Wheel");

            session.save(vehicle);
            session.save(twoWheeler);
            session.save(fourWheeler);

            tx.commit();
            session.close();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
