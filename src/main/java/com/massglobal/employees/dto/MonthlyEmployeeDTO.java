package com.massglobal.employees.dto;

public class MonthlyEmployeeDTO extends EmployeeDTO {
    @Override
    public Double getAnnualSalary() {
        return getMonthlySalary() * 12;
    }
}
