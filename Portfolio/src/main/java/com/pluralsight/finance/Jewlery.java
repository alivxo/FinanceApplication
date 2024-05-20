package com.pluralsight.finance;

// Class declaration extending Asset
// this means Jewley is a type of asset and must implement the abstract method defined in Asset
public class Jewlery extends Asset {

    // Field for the carat of the jewelery
    // carat - represent the weight of the jewelry
    private double carat;

    // Constructor to initialize the jewelry: this construct initializes the fields of the jewelry class
    // it calls the constructor of the superclass (Asset) using super (name, maketValue) to initialize the inherited fields
    public Jewlery(String name, double marketValue, double carat) {
        super(name, marketValue); // call to the constructor of the asset class to initializes name and market value
        this.carat = carat; // Initializes the carat field specific to the Jewelry class
    }

    // this getter method returns the value of the carat
    public double getCarat() {
        return carat; // return he carat value
    }

    // the method override the abstract getVlaue method defined in the Asset class

    @Override
    public double getValue() {
        // we are returning the market value of the jewelry
        return getMarketValue();
    }
}

