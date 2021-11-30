package com.curso.democurso.persistence.mapper;

import com.curso.democurso.domain.Purchase;
import com.curso.democurso.persistence.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * System:                 MarketProject
 * Name:                   PurchaseMapper
 * Description:            Class that represents a PurchaseMapper's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {

    @Mappings({
        @Mapping(source = "idCompra", target = "purchaseId"),
        @Mapping(source = "idCliente", target = "clientId"),
        @Mapping(source = "fecha", target = "date"),
        @Mapping(source = "medioPago", target = "paymentMethod"),
        @Mapping(source = "comentario", target = "comment"),
        @Mapping(source = "estado", target = "state"),
        @Mapping(source = "productos", target = "items")
    })
    Purchase toPurchase(Compra compra);
    List<Purchase> toPurchases(List<Compra> compras);

    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore = true)
    Compra toCompra(Purchase purchase);
}