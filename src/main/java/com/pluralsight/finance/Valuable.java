package com.pluralsight.finance;

import java.math.BigDecimal;   // BigDecimal lives in java.math, so it needs an import

public interface Valuable {
    // Only the signature and a semicolon, no { } body. A method in an
    // interface is public and abstract on its own, so neither word has to
    // be written
    BigDecimal getValue();
}