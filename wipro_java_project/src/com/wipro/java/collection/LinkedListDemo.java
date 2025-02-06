package com.wipro.java.collection;
import java.util.*;
public class LinkedListDemo 
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(101);
		list1.add(104);
		list1.addFirst(100);
		list1.addLast(105);
		System.out.println("LinkedList Objects : "+list1);

		// Appending new Objects
		
		int n=3;
		
		for(int i=1; i<=n;i++)
		{
			list1.add(i);
		}
		
		System.out.println("LinkedList Objects : "+list1);
		
		
		/*
		 * Remove object
		 */
		System.out.println("Removed Object: "+list1.remove(3));
		
		
		/*
		 * List objects after deletion
		 */
		System.out.println(list1);
		
		
		/*
		 * Fetching the objects
		 */
		for(int i=0;i<list1.size();i++)
		{
			System.out.println("Object at"+ i +" index  : "+list1.get(i));
		}
	}

}
