/**
 * 
 */
package com.wipro.java.opps.polymorphism;

/**
 * Parent class = Product
 * child class = Camera
 * Extends = is a keyword
 */
public class Camera extends Product{


	public static void main(String[] args)
	{
		
		/**
		 * here we are performing Dynamic Polymorphism
		 */
		Product cam = new Camera();
		cam.setProductName("Camera");
		cam.setProductPrice(67000f);
		cam.setProductQuantity(4);
		
		cam.showProductDetails();

	}

}
