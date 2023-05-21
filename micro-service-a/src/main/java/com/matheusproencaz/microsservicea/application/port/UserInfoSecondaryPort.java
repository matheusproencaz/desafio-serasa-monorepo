package com.matheusproencaz.microsservicea.application.port;

import com.matheusproencaz.microsservicea.application.domain.entity.UserInfo;
import reactor.core.publisher.Mono;

public interface UserInfoSecondaryPort {

    Mono<UserInfo> getUser(final String id);

}
