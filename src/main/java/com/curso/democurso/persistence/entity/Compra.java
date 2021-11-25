package com.curso.democurso.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

/**
 * System:                 CleanBnB
 * Name:                   Compra
 * Description:            Class that represents a Compra's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
@Entity
@Table(name = "compras")
public class Compra
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_cliente")
    private String idCliente;

    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_cliente" ,insertable = false,updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> productos;

    public Integer getIdCompra()
    {
        return idCompra;
    }

    public Compra setIdCompra(Integer idCompra)
    {
        this.idCompra = idCompra;
        return this;
    }

    public String getIdCliente()
    {
        return idCliente;
    }

    public Compra setIdCliente(String idCliente)
    {
        this.idCliente = idCliente;
        return this;
    }

    public LocalDateTime getFecha()
    {
        return fecha;
    }

    public Compra setFecha(LocalDateTime fecha)
    {
        this.fecha = fecha;
        return this;
    }

    public String getMedioPago()
    {
        return medioPago;
    }

    public Compra setMedioPago(String medioPago)
    {
        this.medioPago = medioPago;
        return this;
    }

    public String getComentario()
    {
        return comentario;
    }

    public Compra setComentario(String comentario)
    {
        this.comentario = comentario;
        return this;
    }

    public String getEstado()
    {
        return estado;
    }

    public Compra setEstado(String estado)
    {
        this.estado = estado;
        return this;
    }

}
