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

import com.actividad.Ejercicio.entidades.InventarioCarro;
import com.actividad.Ejercicio.servicios.InventarioCarroServicio;


@RestController
@RequestMapping("/inventarioCarro")
public class InventarioCarroControlador {

    @Autowired
    InventarioCarroServicio inventarioCarroServicio;

    @GetMapping
    public ArrayList<InventarioCarro> obtenerInventarioCarro() {
        return inventarioCarroServicio.obtenerInventarioCarro();
    }

    @PostMapping
    public InventarioCarro guardarInventarioCarro(@RequestBody InventarioCarro inventarioCarro) {
        return inventarioCarroServicio.guardarInventarioCarro(inventarioCarro);
    }

    @PutMapping("/{id}")
    public InventarioCarro actualizarInventarioCarro(@PathVariable Long id, @RequestBody InventarioCarro inventarioCarro) {
        return inventarioCarroServicio.actualizarInventarioCarro(id, inventarioCarro);
    }

    @DeleteMapping("/{id}")
    public void eliminarInventarioCarro(@PathVariable Long id) {
        inventarioCarroServicio.eliminarInventarioCarro(id);
    }
}

