package com.curso.democurso.persistence;

import com.curso.democurso.domain.Purchase;
import com.curso.democurso.domain.repository.PurchaseRepository;
import com.curso.democurso.persistence.crud.CompraCrudRepository;
import com.curso.democurso.persistence.entity.Compra;
import com.curso.democurso.persistence.mapper.PurchaseMapper;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

/**
 * System:                 CleanBnB
 * Name:                   CompraRepository
 * Description:            Class that represents a CompraRepository's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
@Repository
public class CompraRepository implements PurchaseRepository {
    @Autowired
    private CompraCrudRepository compraCrudRepository;

    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByIdCliente(clientId)
            .map(compras -> mapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        compra.getProductos().forEach(producto -> producto.setCompra(compra));

        return mapper.toPurchase(compraCrudRepository.save(compra));
    }
}