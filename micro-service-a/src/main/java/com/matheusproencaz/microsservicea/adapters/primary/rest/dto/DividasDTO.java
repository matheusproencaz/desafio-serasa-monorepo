package com.matheusproencaz.microsservicea.adapters.primary.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class DividasDTO {

    @JsonProperty
    private String descricao;

    @JsonProperty
    private BigDecimal valor;
}
