package com.kiran.app.strategy;

import com.kiran.model.strategy.tablePerSubClass.FourWheelerTablePerSubClass;
import com.kiran.model.strategy.tablePerSubClass.TwoWheelerTablePerSubClass;
import com.kiran.model.strategy.tablePerSubClass.VehicleTPSC;
import com.kiran.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by kraikar on 4/17/2017.
 * Inheritence Type = JOINED
 */
public class AppTablePerSubClass {
    public static void main(String[] args) {
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            VehicleTPSC vehicleTPSC = new VehicleTPSC();
            vehicleTPSC.setVehicleName("Car");

            TwoWheelerTablePerSubClass twoWheelerTablePerSubClass = new TwoWheelerTablePerSubClass();
            twoWheelerTablePerSubClass.setVehicleName("Pulsar");
            twoWheelerTablePerSubClass.setSteeringType("Handle");

            FourWheelerTablePerSubClass fourWheelerTablePerSubClass = new FourWheelerTablePerSubClass();
            fourWheelerTablePerSubClass.setVehicleName("Honda City");
            fourWheelerTablePerSubClass.setSteeringType("Wheel");

            session.save(vehicleTPSC);
            session.save(twoWheelerTablePerSubClass);
            session.save(fourWheelerTablePerSubClass);

            tx.commit();
            session.close();
        }catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
