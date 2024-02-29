package com.dailycodebuffer.Employee.model;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Employee {
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
