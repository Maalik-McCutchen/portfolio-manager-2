package com.pluralsight.finance;

import java.math.BigDecimal;


public class BankAccount implements Valuable {
    private String name;            // the owner of the account
    private String accountNumber;   // a String: it is an identifier, nobody calculates with it
    private BigDecimal balance;     // money, so a BigDecimal

    public BankAccount(String name, String accountNumber, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // BigDecimal has no - or + operator: subtract() and add() do the work.
    // Both return a NEW BigDecimal, so the result has to be assigned back
    // to balance
    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    // The method promised by Valuable: a bank account is worth its balance
    @Override
    public BigDecimal getValue() {
        return balance;
    }
}