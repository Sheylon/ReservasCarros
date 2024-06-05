package com.actividad.Ejercicio.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.actividad.Ejercicio.entidades.ReservaCarro;

@Repository

public interface ReservaCarroRepositorio extends JpaRepository<ReservaCarro,Long>{
    List<ReservaCarro> findByCarId(Long carId);
    List<ReservaCarro> findByClienteId(Long clienteId);
    List<ReservaCarro> findByEstado(String estado);
}
