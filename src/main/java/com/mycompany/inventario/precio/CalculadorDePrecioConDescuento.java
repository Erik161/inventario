/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inventario.precio;

import com.mycompany.inventario.producto.Producto;
import com.mycompany.inventario.descuento.Descuento;

import java.util.List;
/**
 *
 * @author Asus Tuf
 */


public class CalculadorDePrecioConDescuento implements CalculadorDePrecio {
    private Descuento descuento;

    public CalculadorDePrecioConDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total - descuento.aplicarDescuento(total);
    }
}
