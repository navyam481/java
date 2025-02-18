package com.wipro.usecase;

import java.util.*;

class Student {
    private String id;
    private String name;
    private String grade;

    // Constructor
    public Student(String id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getters and toString() method
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', grade='" + grade + "'}";
    }
}



public class Usecase 
{
 public static void main(String[] args) 
 {
     // Creating a TreeMap to store student data
     TreeMap<String, Student> treeMap = new TreeMap<String,Student>();

     // Adding Student records to the TreeMap
     treeMap.put("S001", new Student("S001", "Alice", "A"));
     treeMap.put("S002", new Student("S002", "Bob", "B"));
     treeMap.put("S003", new Student("S003", "Charlie", "A"));
     treeMap.put("S004", new Student("S004", "David", "C"));

     // Printing the TreeMap
     System.out.println("TreeMap: " + treeMap);

     // Fetching data from the TreeMap and storing it in a HashMap
     HashMap<String, Student> hashMap = new HashMap<>(treeMap);

     // Printing the HashMap
     System.out.println("HashMap: " + hashMap);
 }
}
