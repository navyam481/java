package com.wipro.java.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 
{
	public static void main(String[] args) 
	{
		 // Create a TreeMap of Strings (keys) and Integers (values)
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        
     /**
      *  Adding elements to the tree map
      */
        treeMap.put(1,"Apple");
        treeMap.put(2,"Orange");
        treeMap.put(3,"Pomogranate"); 
        treeMap.put(4,"Grapes"); 
        treeMap.put(5,"Banana"); 
        treeMap.put(6,"Mango"); 

        // Getting values from the tree map
        String valueA = treeMap.get(3); 
        System.out.println("Value of 3: " + valueA);

        // Removing elements from the tree map
        treeMap.remove("B"); // O(log n)

        // Iterating over the elements of the tree map
        for (Integer key : treeMap.keySet()) { 
            System.out.println(
                "Key: " + key + ", Value: "
                + treeMap.get(key)); 

        // Displaying the TreeMap
        System.out.println("TreeMap elements: " + treeMap);
        }
        
        /**
         * Changing Elements
         */
        
        // Inserting the element at specified corresponding
        // to specified key
        treeMap.put(2, "Guava"); 

        // Printing the updated elements of Map
        System.out.println(treeMap); 
        
        
        
        /**
         * Removing Element
         */
        
        treeMap.remove(5); 

        // Printing updated TreeMap
        System.out.println(treeMap); 
        
        
        /**
         * Iterating through the TreeMap
         */
        
        // For-each loop for traversal over Map via entrySet() Method
        for (Map.Entry mapElement : treeMap.entrySet()) {
            
        	int key = (int) mapElement.getKey(); 
            String value = (String)mapElement.getValue();
           
            // Printing the key and value
            System.out.println(key + " : " + value); 
        }
        
	}
}	
