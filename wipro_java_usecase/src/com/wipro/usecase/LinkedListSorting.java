package com.wipro.usecase;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", salary=" + salary +
               '}';
    }
}

// Comparator to sort employees by salary
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary()); // Ascending order
    }
}

public class LinkedListSorting {
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();

        employeeList.add(new Employee(101, "Alice", 55000));
        employeeList.add(new Employee(102, "Bob", 45000));
        employeeList.add(new Employee(103, "Charlie", 75000));
        employeeList.add(new Employee(104, "David", 65000));

        System.out.println("Before Sorting:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        // Sorting using Comparator
        Collections.sort(employeeList, new SalaryComparator());

        System.out.println("\nAfter Sorting by Salary:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}

