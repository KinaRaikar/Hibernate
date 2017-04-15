package com.kiran.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by kraikar on 4/15/2017.
 */
@Entity
@Table(name = "vehicle_m2o")
@Getter
@Setter
public class VehicleM2O {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;

    private String vehicleName;
}
