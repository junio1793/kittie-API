package com.kittyProject.restTemplate.exceptions;

public class EmptyPayload extends Exception {


    public EmptyPayload(String message) {
        super(message);
    }

    public EmptyPayload(String message, Throwable cause) {
        super(message, cause);
    }
}
