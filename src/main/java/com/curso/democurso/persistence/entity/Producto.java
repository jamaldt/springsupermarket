package com.curso.democurso.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * System:                 CleanBnB
 * Name:                   Producto
 * Description:            Class that represents a Producto's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
@Entity
@Table(name = "productos")
public class Producto
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;


    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    public Integer getIdProducto()
    {
        return idProducto;
    }

    public Producto setIdProducto(Integer idProducto)
    {
        this.idProducto = idProducto;
        return this;
    }

    public String getNombre()
    {
        return nombre;
    }

    public Producto setNombre(String nombre)
    {
        this.nombre = nombre;
        return this;
    }

    public Integer getIdCategoria()
    {
        return idCategoria;
    }

    public Producto setIdCategoria(Integer idCategoria)
    {
        this.idCategoria = idCategoria;
        return this;
    }

    public String getCodigoBarras()
    {
        return codigoBarras;
    }

    public Producto setCodigoBarras(String codigoBarras)
    {
        this.codigoBarras = codigoBarras;
        return this;
    }

    public Double getPrecioVenta()
    {
        return precioVenta;
    }

    public Producto setPrecioVenta(Double precioVenta)
    {
        this.precioVenta = precioVenta;
        return this;
    }

    public Integer getCantidadStock()
    {
        return cantidadStock;
    }

    public Producto setCantidadStock(Integer cantidadStock)
    {
        this.cantidadStock = cantidadStock;
        return this;
    }

    public Boolean getEstado()
    {
        return estado;
    }

    public Producto setEstado(Boolean estado)
    {
        this.estado = estado;
        return this;
    }
}
