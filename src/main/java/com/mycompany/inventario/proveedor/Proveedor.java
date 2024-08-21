/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inventario.proveedor;

import com.mycompany.inventario.producto.Producto;

import java.util.List;
/**
 *
 * @author Asus Tuf
 */
public class Proveedor {
    private String nombre;
    private List<Producto> productos;

    public Proveedor(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}