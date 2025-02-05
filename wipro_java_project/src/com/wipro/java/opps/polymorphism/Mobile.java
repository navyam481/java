/**
 * 
 */
package com.wipro.java.opps.polymorphism;

/**
 * Parent class = Product
 * child class = Mobile
 * Extends = is a keyword
 */
public class Mobile extends Product
{
	public static void main(String[] args)
	{
		/**
		 * here we are performing Dynamic Polymorphism
		 */
		Product mobile = new Mobile();
		mobile.setProductName("Mobile");
		mobile.setProductPrice(35000f);
		mobile.setProductQuantity(10);
		
		mobile.showProductDetails();

	}

}
