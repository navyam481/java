package com.wipro.java.collection;

public class ArrayProgram 
{
	public static void main(String[] args) 
	{
		/**
		 * Integer Array with array size : 5
		 */
		int [] arr = new int[5];
		arr[0] = 101;
		arr[1] = 102;
		arr[2] = 103;
		arr[3] = 104;
		arr[4] = 105;
		
		/**
		 * Fetching an array using for loop
		 */
		
		System.out.println("Array elements are : ");
		for(int i=0; i<arr.length ; i++)
		{
			System.out.println("Element at "+ i +" index  is : "+arr[i]);
		}

	}
}
