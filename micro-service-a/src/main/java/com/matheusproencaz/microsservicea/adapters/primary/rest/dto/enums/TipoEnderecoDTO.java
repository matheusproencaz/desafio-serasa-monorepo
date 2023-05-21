package com.matheusproencaz.microsservicea.adapters.primary.rest.dto.enums;

public enum TipoEnderecoDTO {

    CASA(1, "Casa"),
    APARTAMENTO(2, "Apartamento");

    private final int cod;
    private final String description;

    TipoEnderecoDTO(final int cod, final String description) {
        this.cod = cod;
        this.description = description;
    }

    public static TipoEnderecoDTO toEnum(Integer cod) {
        if(cod == null) {
            return null;
        }

        for(TipoEnderecoDTO x : TipoEnderecoDTO.values()) {
            if(cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Id Inválido: " + cod);
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }
}
