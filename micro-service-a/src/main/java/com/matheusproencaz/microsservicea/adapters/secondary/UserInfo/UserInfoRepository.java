package com.matheusproencaz.microsservicea.adapters.secondary.UserInfo;

import com.matheusproencaz.microsservicea.adapters.secondary.UserInfo.dto.UserInfoResponseDatabase;
import com.matheusproencaz.microsservicea.adapters.secondary.UserInfo.exceptions.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *  Está classe seria uma acesso a base de dados, como não irei fazer o acesso as mesmas irei retornar valores
 *  mockados simulando o acesso.
 */

@Repository
@RequiredArgsConstructor
public class UserInfoRepository {

    public Mono<UserInfoResponseDatabase> getUser(String id) {
        try {
            return Mono.just(usersDatabaseMock(id));
        } catch (NullPointerException e) {
            throw new UserNotFoundException();
        }
    }

    private UserInfoResponseDatabase usersDatabaseMock(String id) {
        Map<String, UserInfoResponseDatabase> databaseMock = new HashMap<>();
        databaseMock.put("id1", UserInfoResponseDatabase.builder()
                        .id("id1")
                        .nome("Nome Usuário 1")
                        .CPF("12345678901")
                        .enderecos(Arrays.asList(UserInfoResponseDatabase.EnderecoResponse.builder()
                                .logradouro("Rua dos louros")
                                .numero("10")
                                .tipo("CASA")
                                .build()))
                        .dividas(Arrays.asList(UserInfoResponseDatabase.DividasReponse.builder()
                                        .valor(BigDecimal.valueOf(15000))
                                        .descricao("Descrição da divida")
                                        .motivo("Algum Motivo")
                                .build()))
                .build());

        databaseMock.put("id2", UserInfoResponseDatabase.builder()
                .id("id1")
                .nome("Nome Usuário 2")
                .CPF("12345678901")
                .enderecos(Arrays.asList(UserInfoResponseDatabase.EnderecoResponse.builder()
                        .logradouro("Rua dos Bobos")
                        .numero("11")
                        .tipo("APARTAMENTO")
                        .build()))
                .dividas(Arrays.asList(UserInfoResponseDatabase.DividasReponse.builder()
                        .valor(BigDecimal.valueOf(16000))
                        .descricao("Descrição da divida")
                        .motivo("Algum Motivo")
                        .build()))
                .build());
            return databaseMock.get(id);
    }
}
