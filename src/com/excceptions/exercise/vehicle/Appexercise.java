package com.excceptions.exercise.vehicle;

public class Appexercise {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(80);

        System.out.println(v1.speedActual);
        v1.accelerate();
        System.out.println(v1.speedActual);
        v1.accelerate();
        System.out.println(v1.speedActual);
        v1.accelerate();
        System.out.println(v1.speedActual);

    }
}
