package com.wipro.java.treemap;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

public class TreeMapConstructor4 
{
	// To show TreeMap(SortedMap) constructor
    static void Example4thConstructor()
    {
        // Creating a SortedMap
        SortedMap<Integer, String> sorted_map
            = new ConcurrentSkipListMap<Integer,
                                        String>(); // O(1)

        // Mapping string values to int keys using put()
        // method
        sorted_map.put(1,"Apple");
        sorted_map.put(4,"Grapes"); 
        sorted_map.put(2,"Orange");
        sorted_map.put(6,"Mango"); 
        sorted_map.put(5,"Banana"); 
        sorted_map.put(3,"Pomogranate"); 

        // Creating the TreeMap using the SortedMap
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(sorted_map); 

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map); // O(n)
    }
    
    public static void main(String[] args)
    {
        System.out.println("TreeMap using TreeMap(SortedMap) constructor:\n");
        Example4thConstructor(); 
    }
}
