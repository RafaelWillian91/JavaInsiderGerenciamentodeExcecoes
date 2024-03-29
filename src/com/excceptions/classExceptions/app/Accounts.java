package com.excceptions.classExceptions.app;

import com.excceptions.classExceptions.InsuficientFundsException;

public class Accounts {

    private final String number;
    private double balance;

    public Accounts(String number){
        this.number = number;
    }

    public void deposit(double amount){
        this.balance = amount;
    }

    public void withdraw (double amount) throws InsuficientFundsException{
        if (amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative!" + balance);
        }
        if (balance - amount < 0){
            throw new InsuficientFundsException(balance);
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }

    public double getBalance() {
        return balance;
    }
}
