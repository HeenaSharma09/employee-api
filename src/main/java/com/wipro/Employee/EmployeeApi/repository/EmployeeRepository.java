package com.wipro.Employee.EmployeeApi.repository;

import com.wipro.Employee.EmployeeApi.model.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HE360716 on 3/23/2018.
 */

public interface EmployeeRepository extends CrudRepository<Employee,String> {


}
