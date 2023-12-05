package io.github.ecrdeveloper.model;

import java.math.BigDecimal;

public class ThirdParty {
    
    private PersonalData personalData;
    private String company;

    public ThirdParty (String name, String identity, Position position, BigDecimal salary, String company) {
        this.personalData = new PersonalData(name, identity, position, salary);
        this.company = company;
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
    
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
