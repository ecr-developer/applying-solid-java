package io.github.ecrdeveloper.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    
    private PersonalData personalData;
    private LocalDate dateOfLastAdjustment;

    public Employee(String name, String identity, Position position, BigDecimal salary) {
        this.personalData = new PersonalData(name, identity, position, salary);
    }

    public void doUpdateSalary(BigDecimal newSalary) {
        this.personalData.setSalary(newSalary);
        this.dateOfLastAdjustment = LocalDate.now();
    }

    public void promote(Position position) {
        this.personalData.setPosition(position);
    }

    public String getName() {
        return this.personalData.getName();
    }

    public void setName(String name) {
        this.personalData.setName(name);
    }

    public String getIdentity() {
        return this.personalData.getIdentity();
    }

    public void setIdentity(String identity) {
        this.personalData.setIdentity(identity);
    }

    public Position getPosition() {
        return this.personalData.getPosition();
    }

    public BigDecimal getSalary() {
        return this.personalData.getSalary();
    }

    public void setSalary(BigDecimal salary) {
        this.personalData.setSalary(salary);
    }

    public LocalDate getDateOfLastAdjustment() {
        return dateOfLastAdjustment;
    }

    public void setDateOfLastAdjustment(LocalDate dateOfLastAdjustment) {
        this.dateOfLastAdjustment = dateOfLastAdjustment;
    }
}
