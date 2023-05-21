package com.matheusproencaz.microsservicea.application.port;

import com.matheusproencaz.microsservicea.application.domain.entity.AuthenticationToken;
import com.matheusproencaz.microsservicea.application.domain.entity.UserInfo;
import reactor.core.publisher.Mono;

public interface UserPrimaryPort {

    Mono<UserInfo> getUser(AuthenticationToken token, String idUser);

}
