package com.backend.copal.infrastructure.abstract_services;

import com.backend.copal.domain.dtos.socio.SocioRequest;
import com.backend.copal.domain.dtos.socio.SocioResponse;

public interface ISocioService extends CrudService<SocioRequest, SocioResponse, Long> {
}
