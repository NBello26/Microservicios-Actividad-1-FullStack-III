package com.example.MicroserviciosActividad1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MicroserviciosActividad1.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
