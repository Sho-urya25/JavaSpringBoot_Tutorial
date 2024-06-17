package org.task.two.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.task.two.demo.model.Employee;

public class Employees { 

	private List<Employee> employeeList; 

	// Method to return the list 
	// of employees 
	public List<Employee> getEmployeeList() 
	{ 

		if (employeeList == null) { 

			employeeList 
				= new ArrayList<>(); 
		} 
		return employeeList; 
	} 

	public void
	setEmployeeList( 
		List<Employee> employeeList) 
	{ 
		this.employeeList 
			= employeeList; 
	} 
} 