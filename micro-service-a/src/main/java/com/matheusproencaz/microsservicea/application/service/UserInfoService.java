package com.matheusproencaz.microsservicea.application.service;

import com.matheusproencaz.microsservicea.application.domain.entity.AuthenticationToken;
import com.matheusproencaz.microsservicea.application.domain.entity.UserInfo;
import com.matheusproencaz.microsservicea.application.exceptions.InvalidTokenException;
import com.matheusproencaz.microsservicea.application.port.UserInfoSecondaryPort;
import com.matheusproencaz.microsservicea.application.port.UserPrimaryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserInfoService implements UserPrimaryPort {

    private final UserInfoSecondaryPort secondaryPort;

    @Override
    public Mono<UserInfo> getUser(final AuthenticationToken token, final String idUser) {
        if (!validateToken(token.getToken())) throw new InvalidTokenException("Token Inválido!");
        return secondaryPort.getUser(idUser);
    }

    private boolean validateToken(final String token) {
        return token.equals("validToken");
    }
}
