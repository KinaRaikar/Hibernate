package com.kiran.model.strategy.singleTable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by kraikar on 4/17/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "VEHICLE_SINGLE_TABLE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VEHICLE_ID")
    private int vehicleId;

    @Column(name = "VEHICLE_NAME")
    private String vehicleName;
}
