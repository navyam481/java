package com.wipro.java.exception;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		
		String s = null;
		
		/**
		 * Unchecked Exception
		 */
		try
		{
			System.out.println(s.length());
		}
		catch (NullPointerException e) 
		{
			System.out.println("Given string is null , Please check it");
		}
		

		/**
		 * Checked Exception
		 */
		try 
		{
			Class.forName("abc.txt");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		finally {
			System.out.println("All resources closed");
		}

	}

}
