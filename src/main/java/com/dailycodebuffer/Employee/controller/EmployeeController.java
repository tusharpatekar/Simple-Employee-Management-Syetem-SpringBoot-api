package com.dailycodebuffer.Employee.controller;


import com.dailycodebuffer.Employee.model.Employee;
import com.dailycodebuffer.Employee.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")

    public  Employee createEmployee(@RequestBody Employee employee) {

        return employeeService.createEmployee(employee);

    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();

    }
}
