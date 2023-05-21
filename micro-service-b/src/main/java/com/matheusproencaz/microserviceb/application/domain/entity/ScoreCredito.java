package com.matheusproencaz.microserviceb.application.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class ScoreCredito {

    private String idScore;

    private Integer idade;

    private List<Bens> listaBens;

    private List<Endereco> enderecos;

    private List<String> fontesDeRenda;

    public BigDecimal getValorTotalDosBens() {
        return listaBens.stream()
                .map(Bens::getValorDoBem)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
