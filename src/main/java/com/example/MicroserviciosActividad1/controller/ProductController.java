package com.example.MicroserviciosActividad1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.MicroserviciosActividad1.model.Producto;
import com.example.MicroserviciosActividad1.service.ProductService;



public class ProductController {
    private final ProductService servicio;
    public ProductController(ProductService servicio){
        this.servicio = servicio;
    }

    //listar
    @GetMapping
    public List<Producto> listar(){
        return servicio.listar();
    }
    //guardar
    @PostMapping
    public Producto guardar(@RequestBody Producto producto){
        return servicio.guardar(producto);
    }
    //buscar x id
    @GetMapping("/{id}")
    public Producto buscar(@PathVariable long id){
        return servicio.bucarPorId(id);
    }
    //Eliminar
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id){
        servicio.eliminar(id);
    }
}
 