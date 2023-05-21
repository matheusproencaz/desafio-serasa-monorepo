package com.matheusproencaz.microserviceb.application.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class Bens {
    private String tipoDeBem;

    private BigDecimal valorDoBem;

}
