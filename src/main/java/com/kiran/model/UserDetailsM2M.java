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
@Table (name = "user_details_m2m")
@Getter
@Setter
public class UserDetailsM2M {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    private String userName;

    @ManyToMany()
    @JoinTable(name = "userdetails_veshicle",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "vehicleId")
    )
    private Collection<VehicleM2M> vehicles = new ArrayList<>();

}
