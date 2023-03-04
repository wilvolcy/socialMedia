package com5.example.socialmedia.controller;

import com5.example.socialmedia.exeption.UserNotFountException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomizeResponseErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFountException.class)
    public final ResponseEntity<GlobalErrorHandler> handleException(UserNotFountException ex, WebRequest request){
        GlobalErrorHandler err = new GlobalErrorHandler();
        err.setMessage(ex.getMessage());
        err.setTimestamp(LocalDateTime.now());
        err.setStatusCode(HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<GlobalErrorHandler> handleException(RuntimeException ex, WebRequest request){
        GlobalErrorHandler err = new GlobalErrorHandler();
        err.setMessage(ex.getMessage());
        err.setTimestamp(LocalDateTime.now());
        err.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ResponseEntity<>(err, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
