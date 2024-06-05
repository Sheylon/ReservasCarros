package com.actividad.Ejercicio.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actividad.Ejercicio.entidades.ReservaCarro;
import com.actividad.Ejercicio.servicios.ReservaCarroServicio;

@RestController
@RequestMapping("/reservaCarro")
public class ReservaCarroControlador {

    @Autowired
    ReservaCarroServicio reservaCarroServicio;

    @GetMapping
    public ArrayList<ReservaCarro> obtenerReservasCarro() {
        return reservaCarroServicio.obtenerReservasCarro();
    }

    @PostMapping
    public ReservaCarro guardarReservaCarro(@RequestBody ReservaCarro reservaCarro) {
        return reservaCarroServicio.guardarReservaCarro(reservaCarro);
    }

    @PutMapping("/{id}")
    public ReservaCarro actualizarReservaCarro(@PathVariable Long id, @RequestBody ReservaCarro reservaCarro) {
        return reservaCarroServicio.actualizarReservaCarro(id, reservaCarro);
    }

    @DeleteMapping("/{id}")
    public void eliminarReservaCarro(@PathVariable Long id) {
        reservaCarroServicio.eliminarReservaCarro(id);
    }
}
