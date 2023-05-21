package com.matheusproencaz.microsservicea.application.domain.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    private String id;

    private String CPF;

    private String nome;

    private List<Endereco> enderecos;

    private List<Dividas> dividas;

}
