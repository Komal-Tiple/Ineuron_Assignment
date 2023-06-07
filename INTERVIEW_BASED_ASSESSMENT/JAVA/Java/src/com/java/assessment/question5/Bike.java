package com.java.assessment.question5;

public abstract class Bike {
	public Bike() {
		System.out.println("bike is created");
	}

	public abstract void run();

   public void changeGear() {
		System.out.println("gear changed");
	}
}

