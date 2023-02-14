package com.excceptions.exercise.vehicle;

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
