package com.wipro.java.collection;

import java.util.*;

public class CollectionClass 
{
	public static void main(String[] args) 
	{
		
		/**
		 * Example for ArrayList
		 */
		List<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("Grapes");
		list1.add("Orange");
		list1.add(2,"Guava");
		list1.add("Mango");
		list1.set(4,"Banana");
		
		System.out.println("ArrayList Objects ");
		System.out.println("______________________");
		
		/*
		 * Fetching objects using for each loop
		 */
		for(String l : list1)
		{
			System.out.println(l);
		}

		
		System.out.println();
		
		
		
		list1.remove(1);
		/*
		 * Fetching after removal
		 */
		System.out.println("ArrayList Objects after removal");
		for(String l : list1)
		{
			System.out.println(l);
		}
		
		System.out.println("______________________________________________________________________");
		
		
		/**
		 * Example for LinkedList
		 */
		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(101);
		list2.add(102);
		list2.add(103);
		list2.add(104);
		list2.add(105);
		
		System.out.println("LinkedList Objects ");
		System.out.println("______________________");
		
		
		/*
		 * Fetching objects using for each loop
		 */
		for(Integer l : list2)
		{
			System.out.println(l);
		}
		

		System.out.println();
		
		list2.remove(1);
		/*
		 * Fetching objects using for each loop after deletion
		 */
		System.out.println("ArrayList Objects after removal");
		for(Integer l : list2)
		{
			System.out.println(l);
		}
		
	
		
		System.out.println();
		System.out.println("______________________________________________________________________");
		
		
		/**
		 * Example for Map
		 */
		
		Map<Integer,String> studentdata = new HashMap<Integer,String>();
		studentdata.put(111, "Smith");
		studentdata.put(222, "Scott");
		studentdata.put(333, "John");
		studentdata.put(444, "King");
		studentdata.put(555, "David");
		
		
		/*
		 * Fetching objects through map
		 */
		System.out.println("Map Objects Fetching through Map");
		System.out.println("____________________________");
		for(Map.Entry<Integer,String> entry : studentdata.entrySet())
		{
			System.out.println("Key : "+entry.getKey()+" , "+"Value : "+entry.getValue());
		}
		
		System.out.println();
		
		/*
		 * If key exits in the map --> returns value
		 */
		
		System.out.println("If key exists , corresponding value : "+studentdata.get(111));

		
		System.out.println();
		/*
		 *  If key exits in the map --> returns null
		 *  or we can replace null with default message
		 */
		System.out.println(studentdata.getOrDefault(777,"Student with given id not exists"));
		
		
		System.out.println();
		/*
		 * Removing the object
		 */
		
		System.out.println("Removed object : "+ studentdata.remove(555));
		
		System.out.println();
		/*
		 * Fetching after deletion
		 */
		
		System.out.println("Map Objects Fetching through Map after deletion");
		System.out.println("____________________________");
		for(Map.Entry<Integer,String> entry : studentdata.entrySet())
		{
			System.out.println("Key : "+entry.getKey()+" , "+"Value : "+entry.getValue());
		}
		
		
	}

}
