/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inventario.principal;

import com.mycompany.inventario.descuento.Descuento;
import com.mycompany.inventario.producto.Producto;

/**
 *
 * @author Asus Tuf
 */

import java.util.List;

public class GestorDeDescuentos {
    private Descuento descuento;

    public GestorDeDescuentos(Descuento descuento) {
        this.descuento = descuento;
    }

    public void aplicarDescuento(List<Producto> productos) {
        for (Producto producto : productos) {
            double precioOriginal = producto.getPrecio();
            double precioConDescuento = precioOriginal - descuento.aplicarDescuento(precioOriginal);
            System.out.println("Producto: " + producto.getDetalles() + " - Precio Original: " + precioOriginal + " - Precio con Descuento: " + precioConDescuento);
        }
    }
}
