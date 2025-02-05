/**
 * 
 */
package com.wipro.java.opps.polymorphism;


/**
 * Parent class = Product
 * child class = Laptop
 * Extends = is a keyword
 */
public class Laptop extends Product{

	public static void main(String[] args) 
	{
		
		/**
		 * here we are performing Dynamic Polymorphism
		 */
		Product laptop = new Laptop();
		laptop.setProductName("Laptop-Dell");
		laptop.setProductPrice(45000f);
		laptop.setProductQuantity(2);
		
		laptop.showProductDetails();
	}

}
