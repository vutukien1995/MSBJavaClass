package com.msb.lesson10.sample.exception;

public class InvalidFullNameException extends Exception{

    public InvalidFullNameException() {}

    public InvalidFullNameException(String message) {
        super(message);
    }

}
