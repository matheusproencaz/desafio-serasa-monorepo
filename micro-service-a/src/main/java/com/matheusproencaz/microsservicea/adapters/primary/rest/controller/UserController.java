package com.matheusproencaz.microsservicea.adapters.primary.rest.controller;


import com.matheusproencaz.microsservicea.adapters.primary.rest.UserMapper;
import com.matheusproencaz.microsservicea.adapters.primary.rest.dto.UserInfoOutputDTO;
import com.matheusproencaz.microsservicea.application.domain.entity.AuthenticationToken;
import com.matheusproencaz.microsservicea.application.port.UserPrimaryPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserPrimaryPort userPort;
    private final UserMapper userMapper;

    @GetMapping("/info")
    public Mono<UserInfoOutputDTO> getUser(@RequestParam(value = "id_user", defaultValue = "") String idUser,
            @RequestHeader("securityToken") final String token) {
        log.info("Request: id_user: {}, securityToken: {}", idUser, token);
        return userPort
                .getUser(AuthenticationToken.builder()
                        .token(token)
                        .build(),
                        idUser)
                .map(userMapper::mapResponse);
    }
}
