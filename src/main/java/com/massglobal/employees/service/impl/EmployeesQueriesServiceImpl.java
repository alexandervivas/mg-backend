package com.massglobal.employees.service.impl;

import com.massglobal.employees.dto.EmployeeDTO;
import com.massglobal.employees.factory.EmployeeDTOFactory;
import com.massglobal.employees.repository.EmployeesRepository;
import com.massglobal.employees.service.EmployeesQueriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeesQueriesServiceImpl implements EmployeesQueriesService {

    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public List<EmployeeDTO> getEmployees() {

        return employeesRepository
                .findAll()
                .stream()
                .map(employee -> EmployeeDTOFactory.getInstance().create(employee))
                .collect(Collectors.toList());

    }

}
