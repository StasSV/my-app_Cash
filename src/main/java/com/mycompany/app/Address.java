package com.mycompany.app;

import javax.persistence.*;

@Entity
@SecondaryTables({ @SecondaryTable(name = "country"), @SecondaryTable(name = "planet") })
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String homeAddress;

	public Address() {
	}

	public int getID() {
		return ID;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAdress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

}
