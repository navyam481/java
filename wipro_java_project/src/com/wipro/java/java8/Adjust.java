package com.wipro.java.java8;

import java.time.*;
import java.time.temporal.TemporalAdjusters;


public class Adjust 
{
	
	/*
	 * Checking date and time
	 */

	public static void checkingAdjusters()
	{
		/*
		 * Display the current date
		 */
		LocalDate date = LocalDate.now();
		System.out.println("The current date is : "+date);
		
		/*
		 * to get first day of this month
		 */
		LocalDate firstDayOfMonth = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of this month : "+firstDayOfMonth );
		
		
		/*
		 * to get the next Thursday 
		 */
		
		LocalDate nextThursday = date.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println("The next Thursday from now : "+nextThursday);
		
		/*
		 * First day of next month
		 */
		
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First day of next month : "+firstDay);
		
		/*
		 * Last day of the year
		 */
		LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last day of the year : "+lastDay);
		
		
		/*
		 * First day of the year
		 */
		LocalDate firstDayInYear = date.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("Last day of the year : "+firstDayInYear);
		
		
	}
	
	// Driver Code
	public static void main(String[] args) 
	{
		checkingAdjusters();
	}

}
