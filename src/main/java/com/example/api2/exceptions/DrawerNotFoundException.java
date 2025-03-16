package com.example.api2.exceptions;

import lombok.Getter;

@Getter
public class DrawerNotFoundException extends RuntimeException {
    public DrawerNotFoundException(String message) {
        super(message);
    }
}
