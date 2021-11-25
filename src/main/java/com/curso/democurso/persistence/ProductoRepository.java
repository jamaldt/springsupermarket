package com.curso.democurso.persistence;

import com.curso.democurso.persistence.crud.ProductoCrudRepository;
import com.curso.democurso.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

/**
 * System:                 CleanBnB
 * Name:                   ProductoRepository
 * Description:            Class that represents a ProductoRepository's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
public class ProductoRepository
{
    private ProductoCrudRepository productoCrudRepository;

    public Iterable<Producto> getAll(){
        return productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria){
        return  productoCrudRepository.findByIdCategoria(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }
}
