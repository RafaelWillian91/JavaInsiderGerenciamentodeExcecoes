package com.Lançandoumauncheckedexception;

public class accounts {

    private final String number;
    private double balance;

    public accounts(String number){
        this.number = number;
    }

    public void deposit(double amount){
        this.balance = amount;
    }

    public int withdraw (double amount){
        if (amount < 1){
            return -1;
        }
        if (balance - amount >= 0){
            this.balance -= amount;
            return 1;
        }
        return -2;
    }

    @Override
    public String toString() {
        return "accounts{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
