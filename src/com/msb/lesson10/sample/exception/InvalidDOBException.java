package com.msb.lesson10.sample.exception;

public class InvalidDOBException extends Exception{

    public InvalidDOBException() {}

    public InvalidDOBException(String message) {
        super(message);
    }

}
