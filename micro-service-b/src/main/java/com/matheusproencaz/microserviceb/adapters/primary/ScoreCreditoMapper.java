package com.matheusproencaz.microserviceb.adapters.primary;

import com.matheusproencaz.microserviceb.adapters.primary.dto.ScoreCreditoDTO;
import com.matheusproencaz.microserviceb.application.domain.entity.ScoreCredito;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ScoreCreditoMapper {

    @Mapping(target = "idade", source = "scoreResponse.idade")
    @Mapping(target = "valorTotalBens", expression = "java( scoreResponse.getValorTotalDosBens() )")
    @Mapping(target = "fontesDeRenda", source = "scoreResponse.fontesDeRenda")
    ScoreCreditoDTO mapResponse(ScoreCredito scoreResponse);
}
