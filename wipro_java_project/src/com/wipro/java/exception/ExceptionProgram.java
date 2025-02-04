/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class ExceptionProgram 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to the Application...");
		
		int num1=10;
		int num2=2;
		
		int a[] = null;
		

		
		try
		{
			int result = num1/num2;
			System.out.println("Output : "+result);
			
			a = new int[-3];
			System.out.println("Size of the Array : "+a.length);
		}
		
		/**
		 * To handle ArithmeticException 
		 */
		catch (ArithmeticException e) 
		{
			System.out.println("Please don't enter zero...");
		}
		
		
		/**
		 * to handle the negative array size
		 */
		catch (NegativeArraySizeException e) {
			System.out.println("Please enter positive array size..");
		}
		
		
		
		/**
		 * To handle any kind of exceptions
		 */
		catch (Exception e) {
			System.out.print(e);
		}
		
		
		
		/**
		 * Always it will execute whether the exception raised or not  / whether it is handled or not
		 */
		finally
		{
			System.out.println("Application closed!! Thank you..");
		}
	}

}
