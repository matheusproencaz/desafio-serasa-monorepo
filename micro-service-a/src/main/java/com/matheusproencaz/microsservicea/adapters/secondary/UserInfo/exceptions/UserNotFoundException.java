package com.matheusproencaz.microsservicea.adapters.secondary.UserInfo.exceptions;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException() {
        super("Usuário não encontrado");
    }
}
