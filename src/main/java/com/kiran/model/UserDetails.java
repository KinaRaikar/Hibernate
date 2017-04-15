package com.kiran.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;

	@OneToOne
	@JoinColumn(name = "vehicle_id")
	private Vehicle vehicle;
}
