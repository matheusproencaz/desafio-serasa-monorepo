package com.matheusproencaz.microsservicea.adapters.secondary.UserInfo;

import com.matheusproencaz.microsservicea.adapters.secondary.UserInfo.dto.UserInfoResponseDatabase;
import com.matheusproencaz.microsservicea.application.domain.entity.UserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserInfoResponseMapper {

    @Mapping(target = "id", source = "userInfoResponseDatabase.id")
    @Mapping(target = "CPF", source = "userInfoResponseDatabase.CPF")
    @Mapping(target = "nome", source = "userInfoResponseDatabase.nome")
    @Mapping(target = "enderecos", source = "userInfoResponseDatabase.enderecos")
    @Mapping(target = "dividas", source = "userInfoResponseDatabase.dividas")
    UserInfo mapResponse(UserInfoResponseDatabase userInfoResponseDatabase);
}
