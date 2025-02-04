/**
 * 
 */
package com.wipro.java.opps.polymorphism;

/**
 * POJO for Product class
 * 
 * 	1. No constructor
 *  2. Getter have return value
 *  3. Setters have no return value
 *  4. Properties are determined using private fields 
 *	5. values are behaviors are determined through setters
 *  6. toString() will convert the entire animal class with properties and behaviors
 */
public class Product 
{
	/*
	 * private  Properties of Product = structure
	 */
	private String productName;
	private float productPrice;
	private int productQuantity;
	
	/*
	 * Setters and Getters for Product class
	 */
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	/**
	 * For printing the Product Class Properties and behaviors
	 */
	
	public void showProductDetails()
	{
		System.out.println("Product name : "+this.productName);
		System.out.println("Product price : "+this.productPrice);
		System.out.println("Product quantity : "+this.productQuantity);
	}
	
	
	
}
