/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inventario.producto;


import com.mycompany.inventario.proveedor.Proveedor;
/**
 *
 * @author Asus Tuf
 */
public abstract class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private Proveedor proveedor;
    
    public Producto(String nombre, double precio, int cantidad, Proveedor proveedor){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public Proveedor getProveedor(){
        return proveedor;
    }
    
    public abstract String getDetalles();

}

