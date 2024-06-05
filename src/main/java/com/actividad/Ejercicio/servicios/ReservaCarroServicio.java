package com.actividad.Ejercicio.servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.actividad.Ejercicio.entidades.ReservaCarro;
import com.actividad.Ejercicio.repositorios.ReservaCarroRepositorio;

@Service
public class ReservaCarroServicio {

    @Autowired
    private ReservaCarroRepositorio reservaCarroRepositorio;

    public ArrayList<ReservaCarro> obtenerReservasCarro() {
        return (ArrayList<ReservaCarro>) reservaCarroRepositorio.findAll();
    }

    public ReservaCarro guardarReservaCarro(ReservaCarro reservaCarro) {
        return reservaCarroRepositorio.save(reservaCarro);
    }

    public ReservaCarro actualizarReservaCarro(Long id, ReservaCarro reservaCarroActualizado) {
        java.util.Optional<ReservaCarro> optionalReservaCarro = reservaCarroRepositorio.findById(id);
        if (optionalReservaCarro.isPresent()) {
            ReservaCarro reservaCarroExistente = optionalReservaCarro.get();
            reservaCarroExistente.setCarId(reservaCarroActualizado.getCarId());
            reservaCarroExistente.setClienteId(reservaCarroActualizado.getClienteId());
            reservaCarroExistente.setEstado(reservaCarroActualizado.getEstado());
            reservaCarroExistente.setFechaInicio(reservaCarroActualizado.getFechaInicio());
            reservaCarroExistente.setFechaFin(reservaCarroActualizado.getFechaFin());
            return reservaCarroRepositorio.save(reservaCarroExistente);
        } else {
            throw new RuntimeException("Reserva de carro no encontrada con ID: " + id);
        }
    }

    public void eliminarReservaCarro(Long id) {
        reservaCarroRepositorio.deleteById(id);
    }
}

