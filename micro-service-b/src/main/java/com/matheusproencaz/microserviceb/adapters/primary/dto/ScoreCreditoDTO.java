package com.matheusproencaz.microserviceb.adapters.primary.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
public class ScoreCreditoDTO implements Serializable {

    private Integer idade;

    private BigDecimal valorTotalBens;

    private List<String> fontesDeRenda;
}
