package com.excceptions.exercise.somaDeNumeros;

public class app {
    public static void main(String[] args) {

        Soma soma = new Soma();

        System.out.println("Informe primeiro numero");
        int a = soma.conversor();
        System.out.println("Informe Segundo numero");
        int b = soma.conversor();
        System.out.println(a + b);
    }

}
