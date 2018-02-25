package com.mycompany.app;

import org.aspectj.lang.annotation.*;

@Aspect
public class DrivProcess {
	@Pointcut("execution(* com.mycompany.app.VolksWagen.beep(..))")
	public void beeping() {
	}

	@Before("beeping()")
	public void takeSeats() { // Перед біп-біп
		System.out.println("The driver starts the engine.");
	}

	@Before("beeping()")
	public void turnOffCellPhones() { // Перед біп-біп
		System.out.println("The driver starts driving throuth the highway");
	}

	@AfterReturning("beeping()")
	public void applaud() { // Після біп-біп
		System.out.println("Hurrey, the driver now can continue driving, noone is irritating him");
	}

	@AfterThrowing("beeping()")
	public void demandRefund() { // Після невдалого біп-біп
		System.out.println("UUUUUFFFF that *** doesn't allow me to drive as fast as I want!!!");
	}
}

/*
 * public class Audience { public void takeSeats() { // Перед виступом
 * System.out.println("The audience is taking their seats."); }
 * 
 * public void turnOffCellPhones() { // Перед виступом
 * System.out.println("The audience is turning off their cellphones"); }
 * 
 * public void applaud() { // Після виступу
 * System.out.println("CLAP CLAP CLAP CLAP CLAP"); }
 * 
 * public void demandRefund() { // Після невдалого виступу
 * System.out.println("Boo! We want our money back!"); } }
 */
