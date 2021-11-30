package com.curso.democurso.domain.service;

import com.curso.democurso.domain.Product;
import com.curso.democurso.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * System:                 MarketProject
 * Name:                   ProductService
 * Description:            Class that represents a ProductService's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return  productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId){
        return productRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId){
        return productRepository.getByCategory(categoryId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int productId) {
        return getProduct(productId).map(product -> {
            productRepository.delete(productId);
            return true;
        }).orElse(false);
        /*other way
        if(getProduct(productId).ifPresent()){
            productRepository.delete(productId);
            return true;
        }else {
            return false;
        }

         */
    }

}
