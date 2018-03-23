package com.wipro.Employee.EmployeeApi.controller;

import com.wipro.Employee.EmployeeApi.model.Employee;
import com.wipro.Employee.EmployeeApi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by HE360716 on 3/23/2018.
 */

@RestController
public class EmployeeApi {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);

    }

//    @RequestMapping("/employees/{id}")
//    public Employee getEmployee(@PathVariable String id){
//        return employeeService.ge
//    }


}
