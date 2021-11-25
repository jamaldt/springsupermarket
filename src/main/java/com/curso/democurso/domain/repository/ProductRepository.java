package com.curso.democurso.domain.repository;

import com.curso.democurso.domain.Product;

import java.util.List;
import java.util.Optional;

/**
 * System:                 CleanBnB
 * Name:                   ProductRepository
 * Description:            Class that represents a ProductRepository's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
public interface ProductRepository
{
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProduct(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
