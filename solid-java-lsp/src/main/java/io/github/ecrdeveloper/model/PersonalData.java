package io.github.ecrdeveloper.model;

import java.math.BigDecimal;

public class PersonalData {
    
    private String name;
    private String identity;
    private Position position;
    private BigDecimal salary;

    public PersonalData(String name, String identity, Position position, BigDecimal salary) {
        this.name = name;
        this.identity = identity;
        this.position = position;
        this.salary = salary;
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

}
