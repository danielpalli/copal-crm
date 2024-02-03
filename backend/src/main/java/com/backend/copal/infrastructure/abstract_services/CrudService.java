package com.backend.copal.infrastructure.abstract_services;

public interface CrudService <REQUEST, RESPONSE, ID>{
    RESPONSE create(REQUEST request);
    RESPONSE read(ID id);
    Iterable<RESPONSE> readAll();
    RESPONSE update(ID id, REQUEST request);
    void delete(ID id);
}
