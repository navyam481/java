/**
 * 
 */
package com.wipro.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class UncheckedException 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter a number");
			int number = sc.nextInt();
			System.out.println("Result : "+number);
			
		}
		catch (InputMismatchException e) {
			e.printStackTrace();
		}

		catch (Exception e) {
			System.out.println("Unknown exception!");
		}
		
		
		finally
		{
			sc.close();
			System.out.println("Resources closed");
		}
		
		System.out.println("Main method ended");
	}

}
