package com.wipro.java.java8.usecase;

import java.time.LocalDate;
import java.util.*;

public class EmployeeManagement 
{
	public static void main(String[] args) 
	{
		
		/*
		 * Creating object for EmployeeService
		 */
		EmployeeService service = new EmployeeService();
		
		
		/*
		 * Taking input from the user
		 */
		Scanner scanner = new Scanner(System.in);
		
		
		// Add some employees for the reference
		service.addEmployee(new Employee(1, "Smith", "IT", 50000, LocalDate.of(2023, 5, 10))); 
	    service.addEmployee(new Employee(2, "Scott", "HR", 45000, LocalDate.of(2018, 3, 15)));
		
		while (true)
		{ 
			
			
	            System.out.println("Employee Management System "); 
	            System.out.println("");
	            
	            /*
	             * All operations 
	             */
	            System.out.println("1. Add Employee"); 
	            System.out.println("2. Remove Employee"); 
	            System.out.println("3. Search Employee"); 
	            System.out.println("4. Update Salary"); 
	            System.out.println("5. Display All Employees"); 
	            System.out.println("6. Filter by Department"); 
	            System.out.println("7. Sort by Name"); 
	            System.out.println("8. Get Average Salary"); 
	            System.out.println("9. Exit"); 
	            
	            
	            /*
	             * Taking choice from the user
	             */
	            System.out.print("Enter your choice: "); 
	            int choice = scanner.nextInt(); 
	 
	            
	            /*
	             * Using switch case for implementing the operations
	             */
	            switch (choice) 
	            { 
	            
	            	/*
	            	 * To add an Employee
	            	 */
	            case 1:
                    try {
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        
                        System.out.print("Enter Department: ");
                        String dept = scanner.nextLine();
                        
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();
                        
                        service.addEmployee(new Employee(id, name, dept, salary, LocalDate.now()));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter correct values.");
                        scanner.nextLine(); // Consume invalid input
                    }
                    break;
	                   
	                /*
	                 * To remove an employee based on ID   
	                 */
	                case 2: 
	                    System.out.print("Enter Employee ID to Remove: "); 
	                    int removeId = scanner.nextInt(); 
	                    service.removeEmployee(removeId); 
	                    break; 
	 
	                /*
	                 * To search employee based on ID     
	                 */
	                case 3: 
	                    System.out.print("Enter Employee ID to Search: "); 
	                    int searchId = scanner.nextInt(); 
	                    Optional<Employee> emp = service.searchEmployee(searchId); 
	                    System.out.println(emp); 
	                    break; 
	 
	                /*
	                 * To update salary based on ID    
	                 */
	                case 4: 
	                    System.out.print("Enter Employee ID to Update Salary: "); 
	                    int updateId = scanner.nextInt(); 
	                    System.out.print("Enter New Salary: "); 
	                    double newSalary = scanner.nextDouble(); 
	                    service.updateSalary(updateId, newSalary); 
	                    break; 
	 
	                /*
	                 * To display all employees    
	                 */
	                case 5: 
	                    service.displayEmployees(); 
	                    break; 
	 
	                /*
	                 * filter based on department    
	                 */
	                case 6: 
	                    System.out.print("Enter Department: "); 
	                    scanner.nextLine(); 
	                    String department = scanner.nextLine(); 
	                    List<Employee> filtered = service.filterByDepartment(department); 
	                    filtered.forEach(System.out::println); 
	                    break; 
	 
	                /*
	                 * Sorting based on Names    
	                 */
	                case 7: 
	                    List<Employee> sorted = service.sortByName(); 
	                    sorted.forEach(System.out::println); 
	                    break; 
	 
	                /*
	                 * Calculating average salary    
	                 */
	                case 8: 
	                    System.out.println("Average Salary: " + service.getAverageSalary()); 
	                    break; 
	 
	                 /*
	                  * To exit from application 
	                  */
	                case 9: 
	                    System.out.println("Exiting..."); 
	                    scanner.close(); 
	                    return; 
	 
	                /*
	                 * This is default, if we enter any invalid choice number    
	                 */
	                default: 
	                    System.out.println("Invalid choice! Try again."); 
	            } 
	        } 
	    }
}