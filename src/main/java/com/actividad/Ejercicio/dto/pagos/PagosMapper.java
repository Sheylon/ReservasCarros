package com.actividad.Ejercicio.dto.pagos;


import org.mapstruct.Mapper;

import com.actividad.Ejercicio.entidades.Pagos;

@Mapper(componentModel = "spring")
public interface PagosMapper {
    PagosDto pagosDto(Pagos pagos);
    Pagos pagosDtoToPagos(PagosDto pagosDto);

    @org.mapstruct.Mapping(target = "id", ignore = true)
    PagosDto createPagosDtoWithoutId(Pagos pagos);
}

