package com.matheusproencaz.microsservicea.adapters.primary.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoOutputDTO {

    @JsonProperty
    private String nome;

    @JsonProperty
    private List<DividasDTO> dividas;

}
