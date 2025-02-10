package com.wipro.java.usecase2;

import java.util.Scanner;

public class StudentManagement 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to the Student Management Application");
		System.out.println();
		
		/*
		 * Creating object for StudentService class
		 */
		StudentService stuService = new StudentService();
		
		stuService.addStudent(new Student("R111","Navyasree",22,"Hyderabad"));
		stuService.addStudent(new Student("R222","Sindhu",21,"Kadapa"));
		
		
		/*
		 * Taking input from user
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("____________Student Management System____________");
			System.out.println();
			System.out.println("1. Add student  ");
			System.out.println("2. delete student  ");
			System.out.println("3. display student  ");
			System.out.println("4. Search student  ");
			System.out.println("5. update student Name ");
			System.out.println("6. upadte student Address ");
			System.out.println("7. update student Age");
			System.out.println("8. sort the student deatails by address in Ascending order  ");
			System.out.println("9. sort the student deatails by Age in Descending order  ");
			System.out.println("10. Exit");
			
			
			/*
			 * Enter the choice based on user requirement
			 */
			System.out.println();
			System.out.print("Please enter your choice :");
			int choice = sc.nextInt();
			
			 switch (choice) {
             case 1:
                 System.out.println("______Add Student Details______");
                 System.out.print("Enter Student ID: ");
                 String id = sc.next();
                 sc.nextLine(); 
                 System.out.print("Enter Student Name: ");
                 String name = sc.nextLine();
                 System.out.print("Enter Student Age: ");
                 int age = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter Student Address: ");
                 String addr = sc.nextLine();
                 stuService.addStudent(id,name,age,addr);
                 break;

             case 2:
            	 System.out.println();
                 System.out.print("Enter Student ID to delete: ");
                 String idToDelete = sc.next();
                 stuService.deleteStudent(idToDelete);
                 break;

             case 3:
            	 System.out.println();
                 System.out.println("____Displaying all students________");
                 stuService.displayStudents();
                 break;

             case 4:
            	 System.out.println();
                 System.out.print("Enter Student ID to search: ");
                 String idToSearch = sc.next();
                 stuService.searchStudent(idToSearch);
                 break;

             case 5:
            	 System.out.println();
                 System.out.print("Enter Student ID to update name : ");
                 String idToUpdateName = sc.next();
                 sc.nextLine();
                 System.out.print("Enter new Name: ");
                 String newName = sc.nextLine();
                 stuService.updateName(idToUpdateName, newName);
                 break;

             case 6:
            	 System.out.println();
                 System.out.print("Enter Student ID to update address : ");
                 String idToUpdateAddress = sc.next();
                 sc.nextLine();
                 System.out.print("Enter new Address: ");
                 String newAddress = sc.nextLine();
                 stuService.updateAddress(idToUpdateAddress, newAddress);
                 break;

             case 7:
            	 System.out.println();
                 System.out.print("Enter Student ID to update age : ");
                 String idToUpdateAge = sc.next();
                 System.out.print("Enter new Age: ");
                 int newAge = sc.nextInt();
                 stuService.updateAge(idToUpdateAge, newAge);
                 break;

             case 8:
                 stuService.sortByAddress();
                 break;

             case 9:
                 stuService.sortByAge();
                 break;

             case 10:
                 System.out.println("______Exiting the application. Thank you!______");
                 sc.close();
                 return;

             default:
                 System.out.println("______Invalid choice! Please try again._________");
         }
			
		}
	}

}
