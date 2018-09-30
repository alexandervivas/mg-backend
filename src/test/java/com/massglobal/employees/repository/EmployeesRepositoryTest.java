package com.massglobal.employees.repository;

import com.massglobal.employees.model.Employee;
import com.massglobal.employees.rest.EmployeesRESTService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmployeesRepositoryTest {

    @Mock
    private EmployeesRESTService employeesRESTServiceMock;

    @InjectMocks
    private EmployeesRepository employeesRepository;

    @Test
    public void testRepo() {
        List<Employee> employeesTest = new ArrayList<>();
        employeesTest.add(new Employee());
        employeesTest.add(new Employee());

        when(employeesRESTServiceMock.getEmployees()).thenReturn(employeesTest);

        List<Employee> employees = employeesRepository.findAll();

        assert employees.size() == 2;
    }
}
