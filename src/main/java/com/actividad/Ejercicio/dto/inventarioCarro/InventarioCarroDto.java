package com.actividad.Ejercicio.dto.inventarioCarro;

import lombok.Data;

@Data
public class InventarioCarroDto {
    private Long id;
    private String modelo;
    private String marca;
    private String disponibilidad;
}
