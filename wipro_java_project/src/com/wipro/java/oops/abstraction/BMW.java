package com.wipro.java.oops.abstraction;

public class BMW extends Car{

	/**
	 * Implementing the abstract methods in child class
	 */
	
	@Override
	void carStart() {
	
		System.out.println("BMW car started");
	}

	@Override
	void carStop() {
		System.out.println("BMW car stopped");
	}

}
