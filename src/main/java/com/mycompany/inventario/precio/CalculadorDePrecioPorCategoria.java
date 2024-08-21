/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inventario.precio;

import com.mycompany.inventario.producto.Producto;
import com.mycompany.inventario.categoria.Categoria;
/**
 *
 * @author Asus Tuf
 */
import java.util.List;

public class CalculadorDePrecioPorCategoria implements CalculadorDePrecio {
    private Categoria categoria;

    public CalculadorDePrecioPorCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : categoria.getProductos()) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
}
