package com.matheusproencaz.microserviceb.application.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Endereco {

    private String logradouro;

    private Integer numero;
}
