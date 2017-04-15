package com.kiran.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by kraikar on 4/15/2017.
 */
@Entity
@Table(name = "vehicle_m2m")
@Getter
@Setter
public class VehicleM2M {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;

    private String vehicleName;

    @ManyToMany(mappedBy = "vehicles")
    private Collection<UserDetailsM2M> userDetailsM2M = new ArrayList<>();
}
