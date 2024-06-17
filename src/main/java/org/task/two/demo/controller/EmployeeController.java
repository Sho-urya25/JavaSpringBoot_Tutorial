package org.task.two.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.task.two.demo.model.Employee;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
    @Autowired
    private EmployeeManager employelistmanager;

    @GetMapping(path = "/", produces = "application/json")
    public ResponseEntity<Map<String,List<Employee>>> getAllEmployees() {
        Map<String,List<Employee>> response = new HashMap<>();
        response.put("Employees", employelistmanager.getEmployeeList());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/")
    public  void  createEmployeeDetail(@RequestBody Employee employee){
        employelistmanager.addEmployees(employee);
    }
}

