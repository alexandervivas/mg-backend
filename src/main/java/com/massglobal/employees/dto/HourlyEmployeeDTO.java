package com.massglobal.employees.dto;

public class HourlyEmployeeDTO extends EmployeeDTO {
    @Override
    public Double getAnnualSalary() {
        return 120 * getHourlySalary() * 12;
    }
}
