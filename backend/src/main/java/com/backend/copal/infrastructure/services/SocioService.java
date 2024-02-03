package com.backend.copal.infrastructure.services;

import com.backend.copal.domain.dtos.socio.SocioRequest;
import com.backend.copal.domain.dtos.socio.SocioResponse;
import com.backend.copal.domain.entities.Socio;
import com.backend.copal.domain.repositories.SocioRepository;
import com.backend.copal.infrastructure.abstract_services.ISocioService;
import com.backend.copal.infrastructure.mappers.SocioMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional @AllArgsConstructor @Service
public class SocioService implements ISocioService {

    private final SocioRepository socioRepository;
    private final SocioMapper mapper;

    @Override
    public SocioResponse create(SocioRequest request) {
        return null;
    }

    @Override
    public SocioResponse read(Long aLong) {
        return null;
    }

    @Override @Transactional(readOnly = true)
    public Iterable<SocioResponse> readAll() {
        Iterable<Socio> socios = this.socioRepository.findAll();
        Iterable<SocioResponse> response = this.mapper.entitiesToResponses(socios);
        return response;
    }

    @Override
    public SocioResponse update(Long aLong, SocioRequest request) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
