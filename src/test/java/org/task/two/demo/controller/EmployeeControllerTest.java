package org.task.two.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.task.two.demo.model.Employee;

public class EmployeeControllerTest {
     @InjectMocks
    private EmployeeController employeeController;

    @Mock
    private EmployeeManager employeeManager;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testGetAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Doe", "john.doe@example.com", "Software Engineer"));
        employees.add(new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Product Manager"));

        when(employeeManager.getEmployeeList()).thenReturn(employees);

        ResponseEntity<Map<String, List<Employee>>> response = employeeController.getAllEmployees();

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(2, response.getBody().get("Employees").size());
    }

    @Test
    public void testCreateEmployeeDetail() {
        Employee employee = new Employee(3, "Alice", "Johnson", "alice.johnson@example.com", "Data Analyst");

        employeeManager.addEmployees(employee);

        verify(employeeManager, times(1)).addEmployees(employee);
    }
}
