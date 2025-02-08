package com.wipro.java.java8.usecase;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class EmployeeServiceTest {

    private EmployeeService service;

    @BeforeEach
    void setUp() {
        // Initialize a new EmployeeService instance before each test case
        service = new EmployeeService();
        service.addEmployee(new Employee(1, "Prakhar", "IT", 60000, LocalDate.of(2022, 5, 10)));
        service.addEmployee(new Employee(2, "Hriday", "HR", 50000, LocalDate.of(2021, 3, 15)));
    }

    /**
     * Test 1: Adding an Employee and verifying it exists
     */
    @Test
    void testAddEmployee() {
        int initialSize = service.getEmployees().size();
        service.addEmployee(new Employee(3, "Alina", "Finance", 55000, LocalDate.of(2023, 6, 1)));
        assertEquals(initialSize + 1, service.getEmployees().size());
    }

    /**
     * Test 2: Removing an Employee and checking if it’s gone
     */
    @Test
    void testRemoveEmployee() {
        service.removeEmployee(1);
        assertEquals(1, service.getEmployees().size());
    }

    /**
     * Test 3: Searching for an Employee by ID
     */
    @Test
    void testSearchEmployee() {
        Optional<Employee> emp = service.searchEmployee(1);
        assertTrue(emp.isPresent());
        assertEquals("Prakhar", emp.get().getEmpName());
    }

    /**
     * Test 4: Updating Salary of an Employee
     */
    @Test
    void testUpdateSalary() {
        service.updateSalary(1, 70000);
        Optional<Employee> emp = service.searchEmployee(1);
        assertTrue(emp.isPresent());
        assertEquals(70000, emp.get().getSalary());
    }

    /**
     * Test 5: Retrieving Employees by Department
     */
    @Test
    void testFilterByDepartment() {
        List<Employee> hrEmployees = service.filterByDepartment("HR");
        assertEquals(1, hrEmployees.size());
        assertEquals("Hriday", hrEmployees.get(0).getEmpName());
    }

    /**
     * Test 6: Sorting Employees by Name
     */
    @Test
    void testSortByName() {
        List<Employee> sortedEmployees = service.sortByName();
        assertEquals("Hriday", sortedEmployees.get(0).getEmpName());
        assertEquals("Prakhar", sortedEmployees.get(1).getEmpName());
    }

    /**
     * Test 7: Calculating Average Salary
     */
    @Test
    void testGetAverageSalary() {
        double avgSalary = service.getAverageSalary();
        assertEquals(55000, avgSalary);
    }
}