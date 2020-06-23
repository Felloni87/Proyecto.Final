package com.ada.proyectoFinal.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn
    @ManyToOne
    private Producto producto;

    @JoinColumn
    @OneToOne
    private Usuario usuario;
    private String efectivo;


   // private MetodoDePago metodoDePago;

    public Venta (){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public Venta(Long id, Producto producto, Usuario usuario, String efectivo) {
        this.id = id;
        this.producto = producto;
        this.usuario = usuario;
        this.efectivo = efectivo;
    }

    /* public MetodoDePago getMetodoDePago() {
                return metodoDePago;
            }

            public void setMetodoDePago(MetodoDePago metodoDePago) {
                this.metodoDePago = metodoDePago;
            }



            public Venta(Long id, Producto producto, Usuario usuario, MetodoDePago metodoDePago) {
                this.id = id;
                this.producto = producto;
                this.usuario = usuario;
                this.metodoDePago = metodoDePago;
            }


            */
    public void save() {
    }
}


