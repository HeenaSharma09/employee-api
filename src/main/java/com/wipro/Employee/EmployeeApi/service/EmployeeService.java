package com.wipro.Employee.EmployeeApi.service;

import com.wipro.Employee.EmployeeApi.model.Employee;
import com.wipro.Employee.EmployeeApi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HE360716 on 3/23/2018.
 */

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    private List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("1","Rahul","Software Engineer")
    ));

    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll()
                .forEach(employees::add);
        return employees;
    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }


}
