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
@Table(name = "TWO_WHEELER_TABLE_PER_SUB_CLASS")
public class TwoWheelerTablePerSubClass extends VehicleTPSC {
    @Column(name = "STEERING_TYPE")
    private String steeringType;
}
