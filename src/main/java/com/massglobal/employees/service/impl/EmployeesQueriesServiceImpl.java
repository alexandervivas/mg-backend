package com.massglobal.employees.service.impl;

import com.massglobal.employees.repository.EmployeesRepository;
import com.massglobal.employees.service.EmployeesQueriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeesQueriesServiceImpl implements EmployeesQueriesService {

    @Autowired
    private EmployeesRepository employeesRepository;


}
