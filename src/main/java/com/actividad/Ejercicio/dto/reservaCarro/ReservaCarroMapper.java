package com.actividad.Ejercicio.dto.reservaCarro;


import org.mapstruct.Mapper;
import com.actividad.Ejercicio.entidades.ReservaCarro;

@Mapper(componentModel = "spring")
public interface ReservaCarroMapper {
    ReservaCarroDto reservaCarroDto(ReservaCarro reservaCarro);
    ReservaCarro reservaCarroDtoToReservaCarro(ReservaCarroDto reservaCarroDto);

    @org.mapstruct.Mapping(target = "id", ignore = true)
    ReservaCarroDto createReservaCarroDtoWithoutId(ReservaCarro reservaCarro);
}
