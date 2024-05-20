package com.pluralsight.finance;

// Abstract class
public abstract class Asset implements Valuable {

    // name and market value of the asset
    private String name;
    private double marketValue;

    // Constructor method to initialize the asset
    public Asset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }
    public double getMarketValue() {
        return marketValue;
    }

    // Abstracting the method to get the value to be implemented by the
    // the other subclasses
    @Override
    public abstract double getValue();
}
