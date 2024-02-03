package com.backend.copal.application.controllers;

import com.backend.copal.domain.dtos.socio.SocioResponse;
import com.backend.copal.infrastructure.abstract_services.ISocioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @AllArgsConstructor
@RequestMapping("/socios")
public class SocioController {
    private final ISocioService socioService;
    @GetMapping
    public ResponseEntity<Iterable<SocioResponse>> readAll() {
        return ResponseEntity.ok(this.socioService.readAll());
    }
}
