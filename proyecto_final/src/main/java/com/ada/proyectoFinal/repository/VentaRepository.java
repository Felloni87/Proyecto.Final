package com.ada.proyectoFinal.repository;


import com.ada.proyectoFinal.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
}
