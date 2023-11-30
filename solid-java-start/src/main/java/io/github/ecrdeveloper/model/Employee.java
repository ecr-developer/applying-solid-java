package io.github.ecrdeveloper.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import io.github.ecrdeveloper.LimitReadjustException;

public class Employee {
    
    private String name;
    private String identity;
    private Position position;
    private BigDecimal salary;
    private LocalDate dateOfLastAdjustment;

    public Employee(String name, String identity, Position position, BigDecimal salary) {
        this.name = name;
        this.identity = identity;
        this.position = position;
        this.salary = salary;
    }

    public void readjustSalary(BigDecimal increase) {
        BigDecimal percentageReadjust = increase.divide(salary, RoundingMode.HALF_UP);
        if (percentageReadjust.compareTo(new BigDecimal("0.4")) > 0) {
            throw new LimitReadjustException("The increase cannot exceed 40% of the salary!");
        }
        this.salary = this.salary.add(increase);
        this.dateOfLastAdjustment = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfLastAdjustment() {
        return dateOfLastAdjustment;
    }

    public void setDateOfLastAdjustment(LocalDate dateOfLastAdjustment) {
        this.dateOfLastAdjustment = dateOfLastAdjustment;
    }
}
