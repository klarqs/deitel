package com.serializable;
// Serializable Account class for storing records as objects.
import java.io.Serializable;

public class Account {

    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    // initializes an Account with default values
    public Account() {
        this(0, "", "", 0.0); // call other constructor
    }

    public Account(int account, String firstName, String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // get account number
    public int getAccount() {
        return account;
    }

    // set account number
    public void setAccount(int account) {
        this.account = account;
    }

    // get first name
    public String getFirstName() {
        return firstName;
    }

    // set first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // get last name
    public String getLastName() {
        return lastName;
    }

    // set last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // get balance
    public double getBalance() {
        return balance;
    }

    // set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
} // end class Account
