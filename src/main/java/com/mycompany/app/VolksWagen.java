package com.mycompany.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class VolksWagen implements Auto {
	//private Beep beep;
	//private List<Driver> drivers;

	public VolksWagen() {
	}

	public void beep() {
		System.out.println("beeeep");
	//	beep.BeeepBeep();
	}

//	@Autowired
	//public void setBeep(Beep beep) {
//		this.beep = beep;
//	}

	//public void makeBeep(Beep beep) {
	//	this.beep = beep;
	//}
/*
	@Autowired(required = true)
	public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
	}

	public void people() {
		System.out.println("");
		for (Person p : drivers) {
			p.personInfo();
			System.out.println("Let's drive");
		}
		System.out.println("Reached final point");
	}
*/
}
