package com.rezaur.main.controller;

import com.rezaur.main.exception.CustomException;
import com.rezaur.main.exception.lengthCustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class})
    public ResponseEntity<?> handleException() {
        return new ResponseEntity<>(new CustomException().getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<?> handleArithmeticException() {
        return new ResponseEntity<>(new CustomException().getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({NullPointerException.class})
    public ResponseEntity<?> handleNullPointerException() {
        return new ResponseEntity<>(new lengthCustomException().getMessage(), HttpStatus.BAD_REQUEST);
    }
}
