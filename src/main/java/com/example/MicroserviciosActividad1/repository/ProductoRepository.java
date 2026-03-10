package com.example.MicroserviciosActividad1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MicroserviciosActividad1.model.Producto;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
