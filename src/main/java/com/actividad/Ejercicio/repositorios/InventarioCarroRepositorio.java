package com.actividad.Ejercicio.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.actividad.Ejercicio.entidades.InventarioCarro;

import feign.Param;

@Repository

public interface InventarioCarroRepositorio extends JpaRepository<InventarioCarro, Long>{
    List<InventarioCarro> findByMarca(String marca);
    @Query("SELECT ic FROM InventarioCarro ic WHERE ic.disponibilidad = :disponibilidad")
    List<InventarioCarro> findByDisponibilidad(@Param("disponibilidad") String disponibilidad);

}
