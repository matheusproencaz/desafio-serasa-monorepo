package com.matheusproencaz.microsservicea.adapters.secondary.UserInfo;

import com.matheusproencaz.microsservicea.application.domain.entity.UserInfo;
import com.matheusproencaz.microsservicea.application.port.UserInfoSecondaryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class UserInfoAdapter implements UserInfoSecondaryPort {

    private final UserInfoRepository repository;

    private final UserInfoResponseMapper mapper;

    @Override
    public Mono<UserInfo> getUser(String id) {
        return repository.getUser(id).map(mapper::mapResponse);
    }
}
