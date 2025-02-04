/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class CheckedException
{
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("About checked exception");

		//Thread.sleep(2000);
		try
		{
			System.out.println("Thread is sleeping for 2 secs");
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			System.out.println("Thread is interuppted");
		}
		
		finally {
			System.out.println("Resources closed");
		}
	}

}
