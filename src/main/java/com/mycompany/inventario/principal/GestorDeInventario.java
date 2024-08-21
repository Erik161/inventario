/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inventario.principal;

import com.mycompany.inventario.producto.Producto;
import com.mycompany.inventario.precio.CalculadorDePrecio;
import com.mycompany.inventario.categoria.Categoria;
import com.mycompany.inventario.proveedor.Proveedor;

import java.util.List;
/**
 *
 * @author Asus Tuf
 */
public class GestorDeInventario {
    private CalculadorDePrecio calculadorDePrecio;
    private List<Producto> productos;
    private List<Categoria> categorias;
    private List<Proveedor> proveedores;

    public GestorDeInventario(CalculadorDePrecio calculadorDePrecio, List<Producto> productos, List<Categoria> categorias, List<Proveedor> proveedores) {
        this.calculadorDePrecio = calculadorDePrecio;
        this.productos = productos;
        this.categorias = categorias;
        this.proveedores = proveedores;
    }

    public double calcularPrecioTotalInventario() {
        return calculadorDePrecio.calcularPrecioTotal(productos);
    }
}