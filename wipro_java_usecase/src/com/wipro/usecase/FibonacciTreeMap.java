package com.wipro.usecase;

import java.util.*;

public class FibonacciTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();
        
        TreeMap<Integer, Integer> fibonacciMap = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            fibonacciMap.put(i, fibonacci(i));
        }
        
        System.out.println("Fibonacci Series stored in TreeMap:");
        for (Map.Entry<Integer, Integer> entry : fibonacciMap.entrySet()) {
            System.out.println("Term " + entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

