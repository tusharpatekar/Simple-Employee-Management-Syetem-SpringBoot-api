package com.dailycodebuffer.Employee.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
