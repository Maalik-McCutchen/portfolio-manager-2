package com.pluralsight.finance;

import java.math.BigDecimal;

public class House extends FixedAsset{

    private int yearBuilt;
    private int squareFeet;
    private int bedRooms;

    public House(String name, int yearBuilt, int squareFeet, int bedRooms) {
        super(name);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }

    @Override
    public BigDecimal getValue() {
        return null;
    }
}
