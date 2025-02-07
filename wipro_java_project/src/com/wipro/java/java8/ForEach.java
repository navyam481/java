
package com.wipro.java.java8;

public class ForEach {

	public ForEach() {
		
	}

	public static void main(String[] args) 
	{

		int arr[] = { 1, 2, 3, 4, 5 };
		// Using for-each loop to
		// initialization not required , starts from 0 till end
		// condition and implementation not required
		
		for(int e : arr)
		{
			System.out.println(e);
		}
	}

}