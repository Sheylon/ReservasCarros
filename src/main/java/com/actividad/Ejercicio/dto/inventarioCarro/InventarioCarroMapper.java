package com.actividad.Ejercicio.dto.inventarioCarro;

import org.mapstruct.Mapper;

import com.actividad.Ejercicio.entidades.InventarioCarro;


@Mapper(componentModel = "spring")
public interface InventarioCarroMapper {
    InventarioCarroDto inventarioCarroDto(InventarioCarro inventarioCarro);
    InventarioCarro inventarioCarroDtoToInventarioCarro(InventarioCarroDto inventarioCarroDto);

    @org.mapstruct.Mapping(target = "id", ignore = true)
    InventarioCarroDto createInventarioCarroDtoWithoutId(InventarioCarro inventarioCarro);
}

