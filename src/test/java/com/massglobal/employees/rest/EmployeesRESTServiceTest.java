package com.massglobal.employees.rest;

import org.junit.Test;
import org.springframework.boot.web.client.RestTemplateBuilder;

public class EmployeesRESTServiceTest {

    @Test
    public void testService() {
        EmployeesRESTService employeesRESTService = new EmployeesRESTService(new RestTemplateBuilder());

        assert(employeesRESTService.getEmployees().size() > 0);
    }
}
