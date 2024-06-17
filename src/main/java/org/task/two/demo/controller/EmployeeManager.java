package org.task.two.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.task.two.demo.model.Employee;

@Repository
public class EmployeeManager {
    private static List<Employee> list = new ArrayList<>();
    static {
        list
        .add(new Employee(1234, 
        "String", "String", "String", "SDE"));
        list
        .add(new Employee(2345, "String", "String"
        , "String", "CEO"));
        list.add(new Employee(3456, "String", "String", 
        "String", "DIR"));        
    }
    public List<Employee> getEmployeeList(){
        return list;
    }
    public void addEmployees(Employee employees){
        list.add(employees);
    }
}