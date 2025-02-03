package com.wipro.java.oops.abstraction;

/**
 * Main class for demonstrating the abstraction
 */

public class Test 
{

	public static void main(String[] args) {
		Car bmw = new BMW();
		bmw.carStart();
		bmw.carStop();
		
		System.out.println(".........................");

		Car Honda = new Honda();
		Honda.carStart();
		Honda.carStop();
		
	}

}
