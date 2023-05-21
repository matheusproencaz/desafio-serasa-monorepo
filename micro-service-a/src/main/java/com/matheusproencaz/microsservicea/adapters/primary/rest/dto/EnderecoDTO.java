package com.matheusproencaz.microsservicea.adapters.primary.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.matheusproencaz.microsservicea.adapters.primary.rest.dto.enums.TipoEnderecoDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EnderecoDTO {

    @JsonProperty
    private String logradouro;

    @JsonProperty
    private TipoEnderecoDTO tipo;
}
