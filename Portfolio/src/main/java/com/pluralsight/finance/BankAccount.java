package com.pluralsight.finance;

public class BankAccount implements Valuable {

    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        // this method is going to increase the balance by the specified amount
        balance += amount; // add the specified amount to the balance
    }

    public void withdraw(double amount) {
        balance -= amount; // subtract the specified amount from the balace

    }

    public double getValue() {
        return balance; // returning the balance of the bank account
    }



}
