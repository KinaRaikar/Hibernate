package com.kiran.model.strategy.singleTable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by kraikar on 4/17/2017.
 */
@Getter
@Setter
@Entity
@Table(name = "FOUR_WHEELER_SINGLE_TABLE")
@DiscriminatorValue(value = "CAR")
public class FourWheeler extends Vehicle {
    @Column(name = "STEERING_TYPE")
    private String steeringType;
}
