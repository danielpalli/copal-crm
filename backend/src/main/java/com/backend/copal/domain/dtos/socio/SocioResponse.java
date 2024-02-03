package com.backend.copal.domain.dtos.socio;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SocioResponse {
    private Long id;
    private String nombreSocio;
    private String cuit;
    private String telefono;
    private String correo;
    private String paginaWeb;
    //    private String tipoSocio;
    private Boolean estaActivo;
    private LocalDateTime fechaAlta;
    private LocalDateTime fechaBaja;
    private LocalDateTime fechaModificacion;
//    private Dirrecion dirrecion;
}
