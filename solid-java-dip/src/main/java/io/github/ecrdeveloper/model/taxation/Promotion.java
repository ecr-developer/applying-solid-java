package io.github.ecrdeveloper.model.taxation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promotion implements TaxableReadjustment {

    private BigDecimal taxValue;
    private LocalDate taxDate;

    public Promotion(BigDecimal taxValue) {
        this.taxValue = taxValue;
        this.taxDate = LocalDate.now();
    }

    @Override
    public BigDecimal taxValue() {
        return this.taxValue;
    }

    @Override
    public LocalDate taxDate() {
        return this.taxDate;
    }

    @Override
    public BigDecimal incomeTaxAmount() {
        return this.taxValue.multiply(new BigDecimal("0.1"));
    }
    
}
