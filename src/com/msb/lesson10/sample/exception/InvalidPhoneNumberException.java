package com.msb.lesson10.sample.exception;

public class InvalidPhoneNumberException extends Exception{

    public InvalidPhoneNumberException() {}

    public InvalidPhoneNumberException(String message) {
        super(message);
    }

}
