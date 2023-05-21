package com.matheusproencaz.microsservicea.adapters.secondary.UserInfo.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoResponseDatabase {

    private String id;
    private String CPF;
    private String nome;
    private List<EnderecoResponse> enderecos;

    private List<DividasReponse> dividas;

    @Getter
    @Setter
    @Builder
    public static class EnderecoResponse {
        private String logradouro;
        private String numero;
        private String tipo;
    }

    @Getter
    @Setter
    @Builder
    public static class DividasReponse {
        private String descricao;
        private BigDecimal valor;
        private String motivo;
    }
}
