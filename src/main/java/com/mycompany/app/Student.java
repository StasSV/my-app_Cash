package com.mycompany.app;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String name;

	@Embedded
	private Phone phoneNumber;
	@Embedded
	private Address homeAddress;

}
