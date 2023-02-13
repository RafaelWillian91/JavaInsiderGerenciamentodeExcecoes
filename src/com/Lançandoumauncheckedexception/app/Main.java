package com.Lançandoumauncheckedexception.app;

import com.Lançandoumauncheckedexception.Accounts;

public class Main {

    public static void main(String[] args)throws Exception {

        Accounts ac3 = new Accounts("321212-98");
        ac3.deposit(300);
        System.out.println(ac3);

        ac3.withdraw(-500);

        System.out.println("Sucess");

    }

}
