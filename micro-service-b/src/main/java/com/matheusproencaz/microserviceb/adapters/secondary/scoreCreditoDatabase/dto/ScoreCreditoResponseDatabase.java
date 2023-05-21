package com.matheusproencaz.microserviceb.adapters.secondary.scoreCreditoDatabase.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Builder
public class ScoreCreditoResponseDatabase {

    private String idScore;

    private Integer idade;

    private List<BensResponse> listaBens;

    private List<EnderecoResponse> enderecos;

    private List<String> fontesDeRenda;

    @Getter
    @Setter
    @Builder
    public static class BensResponse {
        private String tipoDeBem;
        private BigDecimal valorDoBem;
    }

    @Getter
    @Setter
    @Builder
    public static class EnderecoResponse {
        private String logradouro;
        private Integer numero;
    }
}
