package com.wipro.java.collection;

import java.util.*;
import java.util.Map.Entry;
public class MapImplementation 
{
	public static void main(String[] args) 
	{
		Map<String,String> map1 = new HashMap<String,String>();
		
		/**
		 * Inserting key : value in Map Object
		 *  Key unique , value can be duplicate
		 */
		
		map1.put("navya@gmail.com","123abc");
		map1.put("scott@gmail.com","sco123");
		map1.put("smith@gmail.com","smi456");
		map1.put("john@gmail.com","john989");
		
		/**
		 * If key exits in the map --> returns value
		 */
		
		System.out.println(map1.get("navya@gmail.com"));

		/**
		 *  If key exits in the map --> returns null
		 */
		System.out.println(map1.get("navy@gmail.com"));
		
		
		/**
		 * Trying to insert existing key
		 * Old value replaced with new value
		 */
		
		map1.put("navya@gmail.com", "nav123");
		System.out.println(map1.get("navya@gmail.com"));
		
		
		
		/**
		 * Fetching through map
		 */
		
		System.out.println();
		
		System.out.println("Fetching through Map");
		System.out.println("____________________________");
		for(Map.Entry<String,String> entry : map1.entrySet())
		{
			System.out.println("Key : "+entry.getKey()+" , "+"Value : "+entry.getValue());
		}
		
		
		
		/**
		 * Removing the object
		 */
		
		System.out.println("Removed object : "+ map1.remove("john@gmail.com"));
		
		/**
		 * Fetching through loop
		 */
		
		System.out.println("Fetching after removing one object");
		System.out.println("____________________________");
		Iterator<Entry<String, String>> ietrate = map1.entrySet().iterator();
		ietrate.forEachRemaining(s->System.out.println(s));
	}

}
