package com.wipro.java.java8;

public class StringAPI {

	public StringAPI() {
		
	}

	public static void main(String[] args) 
	{
		/**
		 * Creating String Object
		 */
		String str = "Navyasree Maniginti";
		
		System.out.println(str.length()); // length of the string
		System.out.println(str.charAt(2)); // printing the character at index 2
		System.out.println(str.substring(1,3)); // printing the characters in range of index
		System.out.println(str.concat(" Hello")); //Concatenating the string with another
		
		String[] s = str.split(" "); // splitting the string with "  " (space)
		
		// fetching the splitted string array 
		for(String string : s)
		{
			System.out.println(string);
		}
	}

}

















