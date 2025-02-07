package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest 
{
	private final Calculator calculator = new Calculator();
	
	@Test
	public void textAdd()
	{
		int result = calculator.add(10, 20);
		assertEquals(50, result);
	}
	
	@Test
	public void textSubtract()
	{
		int result = calculator.add(30,10);
		assertEquals(20, result);
	}
	
	@Test
	public void textAddWithNegativeNumbers()
	{
		int result = calculator.add(-10, -20);
		assertEquals(-50, result);
	}
	
	@Test
	public void textSubstractWithNegativeNumbers()
	{
		int result = calculator.add(-10, -20);
		assertEquals(10, result);
	}
	
	
	@Test
	public void textMultiply()
	{
		int result = calculator.multiply(3,6);
		assertEquals(18, result);
	}
	
	@Test
	public void textMultiplyWithNegativeNumbers()
	{
		int result = calculator.add(-10, -20);
		assertEquals(-300, result);
	}
	
	
	@Test
	public void textDivision()
	{
		int result = calculator.multiply(18,6);
		assertEquals(3, result);
	}
	
	@Test
	public void textDivisionWithNegativeNumbers()
	{
		int result = calculator.add(-100, -2);
		assertEquals(-50, result);
	}
	

}
