package com.massglobal.employees.rest;

import com.massglobal.employees.model.Employee;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeesRESTService {

    private final RestTemplate restTemplate;

    public EmployeesRESTService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public List<Employee> getEmployees() {
        ResponseEntity<List<Employee>> response = this.restTemplate.exchange("http://masglobaltestapi.azurewebsites.net/api/employees", HttpMethod.GET, null, new ParameterizedTypeReference<List<Employee>>(){});
        return response.getBody();
    }

}
