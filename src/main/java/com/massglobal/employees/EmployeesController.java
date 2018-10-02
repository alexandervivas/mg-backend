package com.massglobal.employees;

import com.massglobal.employees.dto.EmployeeDTO;
import com.massglobal.employees.service.EmployeesQueriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/employees")
public class EmployeesController {

    @Autowired
    private EmployeesQueriesService employeesQueriesService;

    @GetMapping(value = "")
    public List<EmployeeDTO> getAll() {

        return employeesQueriesService.getEmployees();

    }

    @GetMapping(value = "/{id}")
    public EmployeeDTO getById(@PathVariable("id") final Long id) {

        return employeesQueriesService.getById(id);

    }
}
