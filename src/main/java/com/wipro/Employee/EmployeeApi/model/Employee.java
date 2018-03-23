package com.wipro.Employee.EmployeeApi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by HE360716 on 3/23/2018.
 */

@Entity
public class Employee {

    @Id
    private String employeeId;
    private String empName;
    private String empDesignation;

    public Employee(){

    }

    public Employee(String employeeId, String empName, String empDesignation) {
        super();
        this.employeeId = employeeId;
        this.empName = empName;
        this.empDesignation = empDesignation;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }
}
