package io.github.ecrdeveloper.model.taxation;

import java.math.BigDecimal;

public interface TaxableReadjustment extends Readjust {

    BigDecimal incomeTaxAmount();
    
}
