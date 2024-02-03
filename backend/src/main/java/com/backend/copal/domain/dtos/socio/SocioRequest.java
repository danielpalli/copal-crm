package com.backend.copal.domain.dtos.socio;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SocioRequest {
    private String nombreSocio;
    private String cuit;
    private String telefono;
    private String correo;
    private String paginaWeb;
    //    private String tipoSocio;
//    private Dirrecion dirrecion;
}
