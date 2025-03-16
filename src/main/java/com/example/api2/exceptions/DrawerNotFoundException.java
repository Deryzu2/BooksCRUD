package com.example.api2.exceptions;

public class DrawerNotFoundException extends RuntimeException {
    public DrawerNotFoundException(String message) {
        super(message);
    }
}
