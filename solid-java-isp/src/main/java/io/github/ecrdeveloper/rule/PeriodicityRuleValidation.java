package io.github.ecrdeveloper.rule;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import io.github.ecrdeveloper.ValidationException;
import io.github.ecrdeveloper.model.Employee;

public class PeriodicityRuleValidation implements ReadjustValidation {

   @Override
    public void validate(Employee employee, BigDecimal increase) {
        LocalDate dateOfLastReadjust = employee.getDateOfLastAdjustment();
        LocalDate currenDate = LocalDate.now();
        long monthsOfLastReadjust = ChronoUnit.MONTHS.between(dateOfLastReadjust, currenDate);
        if (monthsOfLastReadjust < 6) {
            throw new ValidationException("Interval between readjustments must be at least 6 months!");
        }
    }
    
}
