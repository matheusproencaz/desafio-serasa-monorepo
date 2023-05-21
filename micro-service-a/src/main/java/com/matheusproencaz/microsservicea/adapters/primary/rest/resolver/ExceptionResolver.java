package com.matheusproencaz.microsservicea.adapters.primary.rest.resolver;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.matheusproencaz.microsservicea.adapters.secondary.UserInfo.exceptions.UserNotFoundException;
import com.matheusproencaz.microsservicea.application.exceptions.InvalidTokenException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.Serializable;
import java.time.Instant;

@ControllerAdvice
public class ExceptionResolver {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<StandardError> handleUserNotFoundException(UserNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new StandardError("UserNotFoundException", ex.getMessage()));
    }

    @ExceptionHandler(InvalidTokenException.class)
    public ResponseEntity<StandardError> handleInvalidTokenException(InvalidTokenException ex) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new StandardError("InvalidTokenException", ex.getMessage()));
    }

    public static class StandardError implements Serializable {
        private static final long serialVersionUID = 1L;

        @JsonProperty
        private String messagem;
        @JsonProperty
        private String error;
        @JsonProperty
        private Instant instant;

        public StandardError(final String error, final String messagem) {
            this.error = error;
            this.messagem = messagem;
            instant = Instant.now();
        }
    }
}
