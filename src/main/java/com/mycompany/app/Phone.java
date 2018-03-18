package com.mycompany.app;

import javax.persistence.Embeddable;

@Embeddable
public class Phone {

	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
