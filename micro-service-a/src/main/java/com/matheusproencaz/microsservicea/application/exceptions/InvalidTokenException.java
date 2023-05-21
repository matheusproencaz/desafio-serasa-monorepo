package com.matheusproencaz.microsservicea.application.exceptions;

public class InvalidTokenException extends RuntimeException{
    public InvalidTokenException(final String mensagem) {
        super(mensagem);
    }
}
