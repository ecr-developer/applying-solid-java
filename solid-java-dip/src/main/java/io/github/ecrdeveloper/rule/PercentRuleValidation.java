package io.github.ecrdeveloper.rule;

import java.math.BigDecimal;
import java.math.RoundingMode;

import io.github.ecrdeveloper.ValidationException;
import io.github.ecrdeveloper.model.Employee;

public class PercentRuleValidation implements ReadjustValidation {

    @Override
    public void validate(Employee employee, BigDecimal increase) {
        BigDecimal currentSalary = employee.getSalary();
        BigDecimal percentOfReadjust = increase.divide(currentSalary, RoundingMode.HALF_UP);
        if (percentOfReadjust.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidationException("The increase cannot exceed 40% of the salary!");
        }        
    }
    
}
