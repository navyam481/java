package com.wipro.usecase;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        // Displaying the HashMap
        System.out.println("Initial HashMap: " + map);

        // Retrieving a value using a key
        System.out.println("Value for key 2: " + map.get(2));

        // Checking if a key exists
        System.out.println("Contains key 3? " + map.containsKey(3));

        // Checking if a value exists
        System.out.println("Contains value 'Grapes'? " + map.containsValue("Grapes"));

        // Removing a key-value pair
        map.remove(4);
        System.out.println("After removing key 4: " + map);

        // Iterating through keys
        System.out.println("Keys:");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // Iterating through values
        System.out.println("Values:");
        for (String value : map.values()) {
            System.out.println(value);
        }

        // Iterating through key-value pairs
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Checking the size of the HashMap
        System.out.println("Size of HashMap: " + map.size());

        // Checking if HashMap is empty
        System.out.println("Is HashMap empty? " + map.isEmpty());

        // Clearing the HashMap
        map.clear();
        System.out.println("After clearing: " + map);
        System.out.println("Is HashMap empty now? " + map.isEmpty());
    }
}
