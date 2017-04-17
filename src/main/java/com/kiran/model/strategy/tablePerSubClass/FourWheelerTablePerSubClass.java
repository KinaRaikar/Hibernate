package com.kiran.model.strategy.tablePerSubClass;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by kraikar on 4/17/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "FOUR_WHEELER_TABLE_PER_SUB_CLASS")
public class FourWheelerTablePerSubClass extends VehicleTPSC {
    @Column(name = "STEERING_TYPE")
    private String steeringType;
}
