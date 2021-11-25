package com.curso.democurso.persistence.crud;

import com.curso.democurso.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * System:                 CleanBnB
 * Name:                   ProductoCrudRepository
 * Description:            Class that represents a ProductoCrudRepository's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer>
{
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ? ",nativeQuery = true)
    List<Producto> findByIdCategoria(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock,boolean
                                                                  estado);
}
