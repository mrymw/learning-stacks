package com.mrymw.exception;

public class FullQueueException extends RuntimeException {
    public FullQueueException(String message) {
        super(message);
    }
}
