package com.actividad.Ejercicio.dto.pagos;

import lombok.Data;

@Data
public class PagosDto {
    private Long id;
    private Long reservaId;
    private Integer tarjetaCredito;
    private Integer cantidad;
    private String estado;
    private Long transaccionId;
}
