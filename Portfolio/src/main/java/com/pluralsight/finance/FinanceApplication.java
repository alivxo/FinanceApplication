package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        // Create a BankAccount object named account1
        BankAccount account1 = new BankAccount("123", "Pam", 12500);

        // Create a BankAccount object and reference it using the Valuable interface
        Valuable account2 = new BankAccount("456", "Gary", 1500);

        // Try to deposit money into both accounts
        account1.deposit(100);

        // account2.deposit(amount: 100)
        /*
        Did the deposit work for both accounts? why or why not ?
        - the deposit only worked for account 1. It didn't work on the second account
        because account2 is declared as a Valuable and the valuable interface does not have a deposit method.

        What methods are available for account1?
        - the methods available for account1 are:
            deposit(double amount)
            withdraw (double amount)
            getValue()
            plus any methods inherited from the 'object' class

         What methods are available for account2?
         - the methods available for account2
            getValue()
            Also any methods inherited from the object class

        Why?
        - account1 is declared as a BankAccount , so it has all the access to the
        methods defined in the BankAccount class
        - account2 is declared as a Valuable , so it only has access to methods defined in the Value interface,
        which includes the getValue(); method. The deposit method is not a part of the Valuable interface, hence it
        is not available for account2
        */
    }
}
