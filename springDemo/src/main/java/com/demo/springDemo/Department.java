package com.demo.springDemo;

import org.springframework.stereotype.Component;

@Component  // Marks this class as a Spring-managed component
public class Department {
    private String deptName = "Software Development";

    public String getDeptName() {
        return deptName;
    }
}

