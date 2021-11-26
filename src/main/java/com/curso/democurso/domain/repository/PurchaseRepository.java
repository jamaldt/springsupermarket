package com.curso.democurso.domain.repository;

import com.curso.democurso.domain.Purchase;

import java.util.List;
import java.util.Optional;

/**
 * System:                 CleanBnB
 * Name:                   PurchaseRepository
 * Description:            Class that represents a PurchaseRepository's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);
}