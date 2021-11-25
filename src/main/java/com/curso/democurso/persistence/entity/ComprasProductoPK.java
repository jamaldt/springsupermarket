package com.curso.democurso.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * System:                 CleanBnB
 * Name:                   ComprasProductoPK
 * Description:            Class that represents a ComprasProductoPK's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
@Embeddable
public class ComprasProductoPK implements Serializable
{
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private Integer idProducto;

    public Integer getIdCompra()
    {
        return idCompra;
    }

    public ComprasProductoPK setIdCompra(Integer idCompra)
    {
        this.idCompra = idCompra;
        return this;
    }

    public Integer getIdProducto()
    {
        return idProducto;
    }

    public ComprasProductoPK setIdProducto(Integer idProducto)
    {
        this.idProducto = idProducto;
        return this;
    }
}
