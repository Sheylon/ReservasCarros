package com.actividad.Ejercicio.dto.reservaCarro;

import lombok.Data;
import java.sql.Date;

@Data
public class ReservaCarroDto {
    private Long id;
    private Long carId;
    private Long clienteId;
    private String estado;
    private Date fechaInicio;
    private Date fechaFin;
}
