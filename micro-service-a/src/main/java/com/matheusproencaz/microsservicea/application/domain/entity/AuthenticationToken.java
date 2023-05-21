package com.matheusproencaz.microsservicea.application.domain.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AuthenticationToken {
        private String token;
}
