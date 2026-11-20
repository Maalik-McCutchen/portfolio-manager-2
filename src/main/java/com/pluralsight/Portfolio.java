package com.pluralsight;

import com.pluralsight.finance.Valuable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Valuable {

    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable asset){
        assets.add(asset);
    }

    @Override
    public BigDecimal getValue() {
        BigDecimal baseValue = BigDecimal.ZERO;

        for ()
        return null;
    }

    public Valuable getMostValuable() {
        return null;
    }

    public Valuable getLeastValuable() {
        return null;
    }
}
