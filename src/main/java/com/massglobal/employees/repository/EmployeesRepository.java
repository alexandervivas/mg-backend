package com.massglobal.employees.repository;

import com.massglobal.core.Repository;
import com.massglobal.employees.model.Employee;
import com.massglobal.employees.rest.EmployeesRESTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeesRepository implements Repository<Employee, Long> {

    @Autowired
    private EmployeesRESTService employeesRESTService;

    @Override
    public List<Employee> findAll() {
        return employeesRESTService.getEmployees();
    }

    @Override
    public Employee findById(Long id) {
        return employeesRESTService.getEmployees().stream().filter(employee -> employee.getId() == id).findFirst().get();
    }
}
