package com.Lançandoumauncheckedexception.exceptions;

public class SpeedLimitExercise extends RuntimeException{

    public SpeedLimitExercise(int speedLimit) {
        super("You overstepped!! Your speed is " + speedLimit);

    }


}
