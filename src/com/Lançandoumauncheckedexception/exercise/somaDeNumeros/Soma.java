package com.Lançandoumauncheckedexception.exercise.somaDeNumeros;

import com.Lançandoumauncheckedexception.exceptions.ImpossibleConversionException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma {
    public int conversor() {
        Scanner sc1 = new Scanner(System.in);
        try {
            return sc1.nextInt();
        }catch (RuntimeException e){
            System.out.println("Impossivel converter. O numero assumiu 10");
            return 10;
        }

    }

}
