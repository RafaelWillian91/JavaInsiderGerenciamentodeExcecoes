package com.excceptions.exercise.somaDeNumeros;

public class ImpossibleConversionException extends RuntimeException{

    public ImpossibleConversionException() {
    }

    public ImpossibleConversionException(String message) {
        super(message);
    }

    public ImpossibleConversionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImpossibleConversionException(Throwable cause) {
        super(cause);
    }
}
