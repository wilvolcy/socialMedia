package com5.example.socialmedia.controller;

import java.time.LocalDateTime;

public class GlobalErrorHandler {
    private String message;
    private LocalDateTime timestamp;
    private Integer statusCode;

    public GlobalErrorHandler(String message, LocalDateTime timestamp, Integer statusCode) {
        this.message = message;
        this.timestamp = timestamp;
        this.statusCode = statusCode;
    }

    public GlobalErrorHandler() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}
