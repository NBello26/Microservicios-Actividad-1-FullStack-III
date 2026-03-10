package com.example.MicroserviciosActividad1.service;
import java.util.List;

import com.example.MicroserviciosActividad1.model.Producto;
import com.example.MicroserviciosActividad1.repository.ProductoRepository;

public class ProductService{
    public final ProductoRepository repo;
    public ProductService(ProductoRepository repo){
        this.repo=repo;
    }

    //Listar
    public List<Producto>  listar(){
        return repo.findAll();
    }

    //Guardar
    public Producto guardar(Producto producto){
        return repo.save(producto);
    }
    //Buscar
    public Producto bucarPorId(long id){
        return repo.findById(id).orElse(null);
    }
    //Eliminar
    public void eliminar(long id){
        repo.deleteById(id);
    }
}