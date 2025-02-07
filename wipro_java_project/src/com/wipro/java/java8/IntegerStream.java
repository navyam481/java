package com.wipro.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class IntegerStream {

	public static void main(String[] args) 
	{
		/*
		 * List of numbers using Arrays.asList()
		 */
		
		List<Integer> list = Arrays.asList(10,30,7,15,40,12);
		
		/**
		 * Converting list into stream and 
		 * each integer object multiply * 2 using map() method
		 */
		List<Integer> stream1 = list.stream().map(num->num*2).collect(Collectors.toList());
		System.out.println(stream1);
		
		
		/**
		 * Converting list into stream and 
		 * getting even numbers using filter()
		 */
		List<Integer> stream2 = list.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(stream2);
		
		
		/**
		 * Finding minimum number using min()
		 */
		Optional<Integer> min = list.stream().min((num1,num2)->num1.compareTo(num2));
		System.out.println("Min number : "+min);
	
		
		/**
		 * Finding minimum number using max()
		 */
		Optional<Integer> max = list.stream().max((num1,num2)->num1.compareTo(num2));
		System.out.println("Max number : "+max);
	
		/**
		 * Sorting the numbers 
		 */
		List<Integer> numbers = Arrays.asList(100,0,19,0,5,-10,5,32);
		Set<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toSet());
		System.out.println("Numbers after sorting : "+sortedNumbers);
	}

}