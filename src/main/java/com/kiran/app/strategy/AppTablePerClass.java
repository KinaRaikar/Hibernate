package com.kiran.app.strategy;

import com.kiran.model.strategy.tablePerClass.FourWheelerTPC;
import com.kiran.model.strategy.tablePerClass.TwoWheelerTPC;
import com.kiran.model.strategy.tablePerClass.VehicleTPC;
import com.kiran.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by kraikar on 4/17/2017.
 */
public class AppTablePerClass {
    public static void main(String[] args) {
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            VehicleTPC vehicleTPC = new VehicleTPC();
            vehicleTPC.setVehicleName("Car");

            TwoWheelerTPC twoWheelerTPC = new TwoWheelerTPC();
            twoWheelerTPC.setVehicleName("Pulsar");
            twoWheelerTPC.setSteeringType("Handle");

            FourWheelerTPC fourWheelerTPC = new FourWheelerTPC();
            fourWheelerTPC.setVehicleName("W-RV");
            fourWheelerTPC.setSteeringType("Wheel");

            session.save(vehicleTPC);
            session.save(twoWheelerTPC);
            session.save(fourWheelerTPC);

            tx.commit();
            session.close();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
