package io.github.ecrdeveloper.model.taxation;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Readjust {

    BigDecimal taxValue();
    LocalDate taxDate();
    
}
