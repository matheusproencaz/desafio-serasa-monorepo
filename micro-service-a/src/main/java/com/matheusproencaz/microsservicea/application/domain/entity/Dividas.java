package com.matheusproencaz.microsservicea.application.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class Dividas {

    private String descricao;

    private BigDecimal valor;

    private String motivo;

}
