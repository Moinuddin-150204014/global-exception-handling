package com.rezaur.main.exception;

public class lengthCustomException extends Exception{
    private static final String LENGTHMESSAGE = "Length should be at least 5";

    public lengthCustomException() {
        super(LENGTHMESSAGE);
    }
}
