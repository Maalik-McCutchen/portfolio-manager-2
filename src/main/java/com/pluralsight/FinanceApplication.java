package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

import java.math.BigDecimal;

public class FinanceApplication {
    public static void main(String[] args) {
        // Money amounts are BigDecimal objects built from a String, so the
        // amount is stored exactly as it is written
        BankAccount account1 = new BankAccount("Pam", "123", new BigDecimal("12500"));
        // A variable of the interface type can hold any object whose class
        // implements that interface
        Valuable account2 = new BankAccount("Gary", "456", new BigDecimal("1500"));

        // try to deposit money into both accounts
        account1.deposit(new BigDecimal("100"));
        // Remove the // to see the error:
        // Cannot resolve method 'deposit' in 'Valuable'
        //account2.deposit(new BigDecimal("100"));

        // getValue() is in the interface, so it can be called on both.
        // %.2f prints the amount with two decimal places, %n ends the line
        System.out.printf("Account 1 value: $%.2f%n", account1.getValue());
        System.out.printf("Account 2 value: $%.2f%n", account2.getValue());
    }
}