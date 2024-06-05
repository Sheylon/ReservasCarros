package com.actividad.Ejercicio.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.actividad.Ejercicio.entidades.Pagos;

@Repository

public interface PagosRepositorio extends JpaRepository<Pagos,Long>{
    List<Pagos> findByReservaId(Long resevaId);
    List<Pagos> findByEstado(String estado);
}
