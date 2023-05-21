package com.matheusproencaz.microserviceb.adapters.secondary.scoreCreditoDatabase;

import com.matheusproencaz.microserviceb.adapters.secondary.scoreCreditoDatabase.dto.ScoreCreditoResponseDatabase;
import com.matheusproencaz.microserviceb.application.domain.entity.ScoreCredito;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ScoreCreditoResponseMapper {
    @Mapping(target = "idScore", source = "scoreCreditoResponseDatabase.idScore")
    @Mapping(target = "idade", source = "scoreCreditoResponseDatabase.idade")
    @Mapping(target = "listaBens", source = "scoreCreditoResponseDatabase.listaBens")
    @Mapping(target = "enderecos", source = "scoreCreditoResponseDatabase.enderecos")
    @Mapping(target = "fontesDeRenda", source = "scoreCreditoResponseDatabase.fontesDeRenda")
    ScoreCredito mapResponse(ScoreCreditoResponseDatabase scoreCreditoResponseDatabase);
}
