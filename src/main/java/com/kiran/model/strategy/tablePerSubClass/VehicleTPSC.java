package com.kiran.model.strategy.tablePerSubClass;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by kraikar on 4/17/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "VEHICLE_TABLE_PER_SUB_CLASS")
@Inheritance(strategy = InheritanceType.JOINED)
public class VehicleTPSC {
    @Id
    @GeneratedValue
    @Column(name = "VEHICLE_ID")
    private int vehicleId;

    @Column(name = "VEHICLE_NAME")
    private String vehicleName;
}
