package com.matheusproencaz.microsservicea.application.domain.entity;

import com.matheusproencaz.microsservicea.adapters.primary.rest.dto.enums.TipoEnderecoDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Endereco {

    private String logradouro;

    private String numero;

    private TipoEnderecoDTO tipo;

}
