package io.github.ecrdeveloper.service;

import java.math.BigDecimal;
import java.util.List;

import io.github.ecrdeveloper.model.Employee;
import io.github.ecrdeveloper.rule.ReadjustValidation;

public class ReadjustService {

    private List<ReadjustValidation> rulesValidations;

    public ReadjustService(List<ReadjustValidation> rulesValidations) {
        this.rulesValidations = rulesValidations;
    }

    public void readjustSalaryEmployee(Employee employee, BigDecimal increase) {
        this.rulesValidations.forEach(rule -> rule.validate(employee, increase));

        BigDecimal readjustedSalary = employee.getSalary().add(increase);
        employee.doUpdateSalary(readjustedSalary);
    }
    
}
