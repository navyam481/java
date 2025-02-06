package com.wipro.java.collection;

import java.util.*;

public class ListOperations 
{

	public static void main(String[] args) 
	{
		
		/**
		 * List ->Interface
		 * ArrayList -> Implemented class of List(I)
		 */
		List<Integer> list1 = new ArrayList<Integer>();
		
		/*
		 * Add Object with index
		 */
		list1.add(0,10);
		
		/*
		 * Add objects 
		 */
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		/*
		 * 
		 */
		list1.set(2, 100);
		
		
		System.out.println("List1 Objects : "+list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		System.out.println("List2 Objects : "+list2);

		/*
		 * Merging  two lists
		 */
		list1.addAll(3,list2);
		
		
		System.out.println("List1 Objects after merging : "+list1);

		
		/*
		 * Removing the object by using index 
		 */
		System.out.println("Removed Object : "+list1.remove(1));
		
		System.out.println("After removing the Object at index 1 : "+list1);
	}

}
