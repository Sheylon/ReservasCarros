package com.actividad.Ejercicio.servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.actividad.Ejercicio.entidades.Pagos;
import com.actividad.Ejercicio.repositorios.PagosRepositorio;

@Service
public class PagosServicio {

    @Autowired
    private PagosRepositorio pagosRepositorio;

    public ArrayList<Pagos> obtenerPagos() {
        return (ArrayList<Pagos>) pagosRepositorio.findAll();
    }

    public Pagos guardarPago(Pagos pago) {
        return pagosRepositorio.save(pago);
    }

    public Pagos actualizarPago(Long id, Pagos pagoActualizado) {
        java.util.Optional<Pagos> optionalPago = pagosRepositorio.findById(id);
        if (optionalPago.isPresent()) {
            Pagos pagoExistente = optionalPago.get();
            pagoExistente.setReservaId(pagoActualizado.getReservaId());
            pagoExistente.setTarjetaCredito(pagoActualizado.getTarjetaCredito());
            pagoExistente.setCantidad(pagoActualizado.getCantidad());
            pagoExistente.setEstado(pagoActualizado.getEstado());
            pagoExistente.setTransaccionId(pagoActualizado.getTransaccionId());
            return pagosRepositorio.save(pagoExistente);
        } else {
            throw new RuntimeException("Pago no encontrado con ID: " + id);
        }
    }

    public void eliminarPago(Long id) {
        pagosRepositorio.deleteById(id);
    }
}

