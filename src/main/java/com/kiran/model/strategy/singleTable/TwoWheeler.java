package com.kiran.model.strategy.singleTable;

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
@Table(name = "TWO_WHEELER_SINGLE_TABLE")
public class TwoWheeler extends Vehicle {
    @Column(name = "STEERING_TYPE")
    private String steeringType;
}
