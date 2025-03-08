package com.stockInfo.exception;

public class StorageLocationNotFoundException extends RuntimeException {
    public StorageLocationNotFoundException(String message) {
        super(message);
    }
}

