package com.backend.copal.infrastructure.mappers;

import com.backend.copal.domain.dtos.socio.SocioRequest;
import com.backend.copal.domain.dtos.socio.SocioResponse;
import com.backend.copal.domain.entities.Socio;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface SocioMapper {
    @Mappings(
        {
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "fechaAlta", ignore = true),
            @Mapping(target = "fechaModificacion", ignore = true),
            @Mapping(target = "fechaBaja", ignore = true),
            @Mapping(target = "estaActivo", ignore = true)
        }
    )
    Socio requestToEntity(SocioRequest request);
    @Mappings(
        {
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "fechaAlta", ignore = true),
            @Mapping(target = "fechaModificacion", ignore = true),
            @Mapping(target = "fechaBaja", ignore = true),
            @Mapping(target = "estaActivo", ignore = true)
        }
    )
    SocioResponse entityToResponse(Socio entity);
    @Mappings(
        {
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "fechaAlta", ignore = true),
            @Mapping(target = "fechaModificacion", ignore = true),
            @Mapping(target = "fechaBaja", ignore = true),
            @Mapping(target = "estaActivo", ignore = true)
        }
    )
    Iterable<SocioResponse> entitiesToResponses(Iterable<Socio> entities);

}
