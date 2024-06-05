package com.actividad.Ejercicio.entidades;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ReservaCarro {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long carId;
    private Long clienteId;
    private String estado;
    private Date fechaInicio;
    private Date fechaFin;
}
