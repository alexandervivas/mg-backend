package com.massglobal.employees.repository;

import com.massglobal.core.Repository;
import com.massglobal.employees.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeesRepository implements Repository<Employee, Long> {
    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findById(Long aLong) {
        return null;
    }
}
