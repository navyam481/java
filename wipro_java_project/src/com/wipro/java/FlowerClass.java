/**
 * 
 */
package com.wipro.java;

public class FlowerClass 
{
	/*
	 * Properties of Flower class
	 */
	String flowerName;
	String flowerColor;
	int noOfFlowers;
	
	/*
	 * Constructor 
	 */
	public FlowerClass(String flowerName, String flowerColor,int noOfFlowers)
	{
		this.flowerName = flowerName;
		this.flowerColor = flowerColor;
		this.noOfFlowers = noOfFlowers;
	}
	
	public void displayFlowers()
	{
		System.out.println("Flower Name : "+this.flowerName + " , "+" Flower Color : "+this.flowerColor);
		System.out.println("No of Flowers : "+this.noOfFlowers);
	}

	public static void main(String[] args) 
	{
		
		FlowerClass flower1 = new FlowerClass("Jasmine","White",4);
		FlowerClass flower2 = new FlowerClass("Rose","Red",5);
		FlowerClass flower3 = new FlowerClass("Sunflower","Yellow",10);
		
		flower1.displayFlowers();
		flower2.displayFlowers();
		flower3.displayFlowers();
	}

}
