package com.curso.democurso.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * System:                 CleanBnB
 * Name:                   ComprasProducto
 * Description:            Class that represents a ComprasProducto's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
@Entity
@Table(name = " compras_productos")
public class ComprasProducto
{
    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;

    private Double total;

    private Boolean estado;

    public ComprasProductoPK getId()
    {
        return id;
    }

    public ComprasProducto setId(ComprasProductoPK id)
    {
        this.id = id;
        return this;
    }

    public Integer getCantidad()
    {
        return cantidad;
    }

    public ComprasProducto setCantidad(Integer cantidad)
    {
        this.cantidad = cantidad;
        return this;
    }

    public Double getTotal()
    {
        return total;
    }

    public ComprasProducto setTotal(Double total)
    {
        this.total = total;
        return this;
    }

    public Boolean getEstado()
    {
        return estado;
    }

    public ComprasProducto setEstado(Boolean estado)
    {
        this.estado = estado;
        return this;
    }
}
