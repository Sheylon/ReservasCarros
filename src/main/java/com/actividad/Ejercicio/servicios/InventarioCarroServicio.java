package com.actividad.Ejercicio.servicios;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.actividad.Ejercicio.entidades.InventarioCarro;
import com.actividad.Ejercicio.repositorios.InventarioCarroRepositorio;

@Service
public class InventarioCarroServicio {

    @Autowired
    private InventarioCarroRepositorio inventarioCarroRepositorio;

    public ArrayList<InventarioCarro> obtenerInventarioCarro() {
        return (ArrayList<InventarioCarro>) inventarioCarroRepositorio.findAll();
    }

    public InventarioCarro guardarInventarioCarro(InventarioCarro inventarioCarro) {
        return inventarioCarroRepositorio.save(inventarioCarro);
    }

    public InventarioCarro actualizarInventarioCarro(Long id, InventarioCarro inventarioCarroActualizado) {
        java.util.Optional<InventarioCarro> optionalInventarioCarro = inventarioCarroRepositorio.findById(id);
        if (optionalInventarioCarro.isPresent()) {
            InventarioCarro inventarioCarroExistente = optionalInventarioCarro.get();
            inventarioCarroExistente.setModelo(inventarioCarroActualizado.getModelo());
            inventarioCarroExistente.setMarca(inventarioCarroActualizado.getMarca());
            inventarioCarroExistente.setDisponibilidad(inventarioCarroActualizado.getDisponibilidad());
            return inventarioCarroRepositorio.save(inventarioCarroExistente);
        } else {
            throw new RuntimeException("Inventario de carro no encontrado con ID: " + id);
        }
    }

    public void eliminarInventarioCarro(Long id) {
        inventarioCarroRepositorio.deleteById(id);
    }
}

