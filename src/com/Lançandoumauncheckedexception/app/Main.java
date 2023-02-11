package com.Lançandoumauncheckedexception.app;

import com.Lançandoumauncheckedexception.Accounts;

public class Main {

    public static void main(String[] args) {

        Accounts ac3 = new Accounts("321212-98");
        ac3.deposit(300);
        System.out.println(ac3);

        int rc = ac3.withdraw(200);

        if (rc == -2){
            System.out.println("Error: not enought founds");
        }else if (rc == -1){
            System.out.println("Error: negative amount");
        }else if (rc == 1){
            System.out.println("SUCESS");
            System.out.println(ac3);
        }

    }

}
