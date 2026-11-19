package com.pluralsight.finance;

import java.math.BigDecimal;

public abstract class FixedAsset implements Valuable {
    private String name;

    // Nobody can call this constructor with "new FixedAsset(...)", but the
    // child classes call it with super(...)
    public FixedAsset(String name) {
        this.name = name;
    }

    // The method promised by Valuable. FixedAsset gives it no body: there
    // is no general way to work out the value of a fixed asset, so every
    // child class MUST supply its own version
    public abstract BigDecimal getValue();
}