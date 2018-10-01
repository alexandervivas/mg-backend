package com.massglobal.employees.dto;

import com.massglobal.employees.model.Employee;

public abstract class EmployeeDTO extends Employee {

    protected Double annualSalary;

    public abstract Double getAnnualSalary();

}
