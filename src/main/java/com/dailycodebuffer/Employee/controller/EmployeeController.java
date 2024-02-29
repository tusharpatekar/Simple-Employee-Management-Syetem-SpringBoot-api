package com.dailycodebuffer.Employee.controller;


import com.dailycodebuffer.Employee.model.Employee;
import com.dailycodebuffer.Employee.services.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
