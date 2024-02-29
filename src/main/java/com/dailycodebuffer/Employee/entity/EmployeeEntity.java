package com.dailycodebuffer.Employee.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
