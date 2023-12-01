package io.github.ecrdeveloper.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import io.github.ecrdeveloper.model.Employee;
import io.github.ecrdeveloper.LimitReadjustException;

public class ReadjustService {
    
    public void readjustSalaryEmployee(Employee employee, BigDecimal increase) {
        BigDecimal currentSalary = employee.getSalary();
        BigDecimal percentOfReadjust = increase.divide(currentSalary, RoundingMode.HALF_UP);
        if (percentOfReadjust.compareTo(new BigDecimal("0.4")) > 0) {
            throw new LimitReadjustException("The increase cannot exceed 40% of the salary!");
        }
        BigDecimal readjustedSalary = currentSalary.add(increase);
        employee.doUpdateSalary(readjustedSalary);
    }
}