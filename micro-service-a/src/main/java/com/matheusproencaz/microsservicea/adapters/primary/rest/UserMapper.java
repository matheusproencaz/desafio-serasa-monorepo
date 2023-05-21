package com.matheusproencaz.microsservicea.adapters.primary.rest;

import com.matheusproencaz.microsservicea.adapters.primary.rest.dto.UserInfoOutputDTO;
import com.matheusproencaz.microsservicea.application.domain.entity.UserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {

    @Mapping(target = "nome", source = "userInfo.nome")
    @Mapping(target = "dividas", source = "userInfo.dividas")
    UserInfoOutputDTO mapResponse(UserInfo userInfo);

}
