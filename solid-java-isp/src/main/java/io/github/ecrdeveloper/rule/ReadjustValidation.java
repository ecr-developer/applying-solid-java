package io.github.ecrdeveloper.rule;

import java.math.BigDecimal;

import io.github.ecrdeveloper.model.Employee;

public interface ReadjustValidation {

    void validate (Employee employee, BigDecimal increase);
    
}
