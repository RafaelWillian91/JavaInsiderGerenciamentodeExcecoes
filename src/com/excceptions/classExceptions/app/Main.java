package com.excceptions.classExceptions.app;

import com.excceptions.classExceptions.InsuficientFundsException;

public class Main {

    public static void main(String[] args) {

        Accounts ac3 = new Accounts("321212-98");
        ac3.deposit(300);
        System.out.println(ac3);

        try {
            ac3.withdraw(-500);

        } catch (InsuficientFundsException  | IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Stacktrace: ");
            e.printStackTrace();

        }finally {
            System.out.println("The END");
        }



    }

}
