package com.Lançandoumauncheckedexception.exercise;

import com.Lançandoumauncheckedexception.exceptions.SpeedLimitExercise;

public class Vehicle {

    public final static int speedLimit = 200;
    public int speedActual;

    public Vehicle(int speed){
        this.speedActual = speed;
    }
    public void accelerate(){
        speedActual *= 2;
        if(speedActual > speedLimit){
            throw new SpeedLimitExercise(speedActual);
        }
    }

}
