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
@Table (name = "user_details_o2m")
@Getter
@Setter
public class UserDetailsO2M {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    private String userName;

    @OneToMany
    private Collection<VehicleM2O> vehicles = new ArrayList<>();

}
