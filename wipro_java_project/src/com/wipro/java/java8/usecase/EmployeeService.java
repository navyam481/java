package com.wipro.java.java8.usecase;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService 
{
    private List<Employee> employees = new ArrayList<Employee>();
    
    /*
     * Add an employee
     */
   
    public void addEmployee(Employee emp) { 
        employees.add(emp); 
        System.out.println("Employee added: " + emp); 
    } 
    
    /*
     * Remove an Employee by ID
     */
    public void removeEmployee(int id)
    {
        try {
            if (employees.isEmpty()) {
                throw new NoSuchElementException("Employee list is empty");
            }
            boolean removed = employees.removeIf(e -> e.getEmpId() == id);
            if (!removed) {
                throw new NoSuchElementException("Employee with ID " + id + " not found");
            }
            System.out.println("Employee with id : " + id + " removed successfully");
        } catch (NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: Unsupported operation while removing employee");
        }
    }
    
    /*
     * Search an Employee using ID
     */
    public Optional<Employee> searchEmployee(int id) {
        Optional<Employee> employee = employees.stream()
                                               .filter(e -> e.getEmpId() == id)
                                               .findFirst();
        employee.ifPresentOrElse(
            e -> System.out.println("Employee found: " + e),
            () -> System.out.println("Error: Employee with ID " + id + " not found"));
        return employee;
    
}

    /*
     * Update Employee Salary
     */
    public void updateSalary(int id, double newSalary)
    {
        try {
            if (newSalary < 0) {
                throw new IllegalArgumentException("Salary cannot be negative");
            }
            employees.stream().filter(e -> e.getEmpId() == id).findFirst().ifPresentOrElse(
                e -> e.setSalary(newSalary),
                () -> System.out.println("Error: Employee with ID " + id + " not found")
            );
        } catch (NoSuchElementException e) {
            System.out.println("Error: Employee with ID " + id + " not found");
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: Unable to update salary");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    /*
     * Display all the employees
     */
    public void displayEmployees()
    {
        try {
            if (employees.isEmpty()) {
                throw new NoSuchElementException("No employees found");
            }
            employees.forEach(System.out::println);
        } catch (NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: Unable to display employees");
        }
    }
    
    /*
     * Filter employees by Department
     */
    public List<Employee> filterByDepartment(String dept)
    {
        try {
            if (dept == null || dept.isEmpty()) {
                throw new IllegalArgumentException("Department name cannot be null or empty");
            }
            return employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase(dept))
                .collect(Collectors.toList());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return Collections.emptyList();
        }
    }
    
    /*
     * Sort employees by names
     */
    public List<Employee> sortByName()
    {
        try {
            if (employees.isEmpty()) {
                throw new NoSuchElementException("No employees available to sort");
            }
            return employees.stream()
                .sorted(Comparator.comparing(Employee::getEmpName))
                .collect(Collectors.toList());
        } catch (NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());
            return Collections.emptyList();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: Unable to sort employees");
            return Collections.emptyList();
        }
    }
    
    /*
     * Get average salary
     */
    public double getAverageSalary()
    {
        try {
            if (employees.isEmpty()) {
                throw new ArithmeticException("Error: Cannot calculate average salary, no employees available");
            }
            return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }
    
    /*
     * Method for testing purposes (used in JUnit)
     */
    public List<Employee> getEmployees() {
        return Collections.unmodifiableList(employees);
    }
}