package com.Lançandoumauncheckedexception.exceptions;

public class InsuficientFundsException extends Exception{

    private final double currentBalance;


    public InsuficientFundsException(double currentBalance) {
        super("There is no sufficient funds to withdraw! Total balance: " + currentBalance);
        this.currentBalance= currentBalance;

    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void teste(){}
}
