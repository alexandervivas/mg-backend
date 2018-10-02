package com.massglobal.employees.factory;

import com.massglobal.employees.dto.EmployeeDTO;
import com.massglobal.employees.dto.HourlyEmployeeDTO;
import com.massglobal.employees.dto.MonthlyEmployeeDTO;
import com.massglobal.employees.model.Employee;

import java.util.NoSuchElementException;

public class EmployeeDTOFactory {

    private static final EmployeeDTOFactory instance = new EmployeeDTOFactory();

    private EmployeeDTOFactory() {}

    public static EmployeeDTOFactory getInstance() {
        return instance;
    }

    public EmployeeDTO create(Employee employee) {
        switch (employee.getContractTypeName()) {
            case "HourlySalaryEmployee": return createHourlyEmployee(employee);
            case "MonthlySalaryEmployee": return createMonthlyEmployee(employee);
            default: throw new NoSuchElementException("Invalid contract type");
        }
    }

    private HourlyEmployeeDTO createHourlyEmployee(Employee employee) {
        HourlyEmployeeDTO hourlyEmployeeDTO = new HourlyEmployeeDTO();
        hourlyEmployeeDTO.setContractTypeName(employee.getContractTypeName());
        hourlyEmployeeDTO.setHourlySalary(employee.getHourlySalary());
        hourlyEmployeeDTO.setId(employee.getId());
        hourlyEmployeeDTO.setMonthlySalary(employee.getMonthlySalary());
        hourlyEmployeeDTO.setName(employee.getName());
        hourlyEmployeeDTO.setRoleDescription(employee.getRoleDescription());
        hourlyEmployeeDTO.setRoleId(employee.getRoleId());
        hourlyEmployeeDTO.setRoleName(employee.getRoleName());
        return hourlyEmployeeDTO;
    }

    private MonthlyEmployeeDTO createMonthlyEmployee(Employee employee) {
        MonthlyEmployeeDTO monthlyEmployeeDTO = new MonthlyEmployeeDTO();
        monthlyEmployeeDTO.setContractTypeName(employee.getContractTypeName());
        monthlyEmployeeDTO.setHourlySalary(employee.getHourlySalary());
        monthlyEmployeeDTO.setId(employee.getId());
        monthlyEmployeeDTO.setMonthlySalary(employee.getMonthlySalary());
        monthlyEmployeeDTO.setName(employee.getName());
        monthlyEmployeeDTO.setRoleDescription(employee.getRoleDescription());
        monthlyEmployeeDTO.setRoleId(employee.getRoleId());
        monthlyEmployeeDTO.setRoleName(employee.getRoleName());
        return monthlyEmployeeDTO;
    }

}
