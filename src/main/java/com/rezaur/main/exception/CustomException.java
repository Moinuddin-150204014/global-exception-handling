package com.rezaur.main.exception;

public class CustomException extends Exception {

    private static final String MESSAGE = "Insufficient balance";

    public CustomException() {
        super(MESSAGE);
    }

}
