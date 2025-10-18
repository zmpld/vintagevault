package com.mapalad.ecommerce.exceptions;

public class ValidationException extends RuntimeException{

    public ValidationException(String message){
        super(message);
    }
}
