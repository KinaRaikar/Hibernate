package com.kiran.model.strategy.tablePerClass;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by kraikar on 4/17/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "VEHICLE_TABLE_PER_CLASS")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class VehicleTPC {

    @Id
    @GeneratedValue
    @Column(name = "VEHICLE_ID")
    private int vehicleId;

    @Column(name = "VEHICLE_NAME")
    private String vehicleName;
}
