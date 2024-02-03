package com.backend.copal.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "socios")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Socio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombreSocio;
    @Column
    private String cuit;
    @Column
    private String telefono;
    @Column
    private String correo;
    @Column
    private String paginaWeb;
    //    private String tipoSocio;
    @Column
    private Boolean estaActivo;
    @Column
    private LocalDateTime fechaAlta;
    @Column
    private LocalDateTime fechaBaja;
    @Column
    private LocalDateTime fechaModificacion;
//    private Dirrecion dirrecion;
}
