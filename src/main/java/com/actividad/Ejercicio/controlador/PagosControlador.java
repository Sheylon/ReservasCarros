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

import com.actividad.Ejercicio.entidades.Pagos;
import com.actividad.Ejercicio.servicios.PagosServicio;

@RestController
@RequestMapping("/pagos")
public class PagosControlador {

    @Autowired
    PagosServicio pagosServicio;

    @GetMapping
    public ArrayList<Pagos> obtenerPagos() {
        return pagosServicio.obtenerPagos();
    }

    @PostMapping
    public Pagos guardarPago(@RequestBody Pagos pago) {
        return pagosServicio.guardarPago(pago);
    }

    @PutMapping("/{id}")
    public Pagos actualizarPago(@PathVariable Long id, @RequestBody Pagos pago) {
        return pagosServicio.actualizarPago(id, pago);
    }

    @DeleteMapping("/{id}")
    public void eliminarPago(@PathVariable Long id) {
        pagosServicio.eliminarPago(id);
    }
}
