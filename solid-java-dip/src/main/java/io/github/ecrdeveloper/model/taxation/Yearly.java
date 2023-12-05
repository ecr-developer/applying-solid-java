package io.github.ecrdeveloper.model.taxation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Yearly implements Readjust {

    private BigDecimal taxValue;
    private LocalDate taxDate;

    public Yearly(BigDecimal taxValue) {
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
}
