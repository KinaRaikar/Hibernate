package com.kiran.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistense.*;

@Entity
@Getter
@Setter
public class UserDetails {
	@Id
	@GeneraterValue(strategy=GeneraterType.AUTO)
	private int userId;
	private String userName;
}
