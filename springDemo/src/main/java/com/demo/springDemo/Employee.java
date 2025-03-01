package com.demo.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // Marks this as a Spring-managed component
public class Employee {

    private String empName = "John Doe";

    @Autowired  // Injects the Department bean
    private Department department;

    public String getEmployeeDetails() {
        return "Employee Name: " + empName + ", Department: " + department.getDeptName();
    }
}
