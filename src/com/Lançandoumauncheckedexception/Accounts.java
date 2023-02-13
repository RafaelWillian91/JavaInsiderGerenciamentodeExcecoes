package com.Lançandoumauncheckedexception;

public class Accounts {

    private final String number;
    private double balance;

    public Accounts(String number){
        this.number = number;
    }

    public void deposit(double amount){
        this.balance = amount;
    }

    public void withdraw (double amount) throws Exception{
        if (amount < 0){
            throw new RuntimeException("Amount cannot be negative!");
        }
        if (balance - amount < 0){
            throw new Exception("insufficient funds");
        }
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
