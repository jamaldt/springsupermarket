package com.curso.democurso.persistence.crud;

import com.curso.democurso.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * System:                 CleanBnB
 * Name:                   CompraCrudRepository
 * Description:            Class that represents a CompraCrudRepository's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    Optional<List<Compra>> findByIdCliente(String idCliente);
}