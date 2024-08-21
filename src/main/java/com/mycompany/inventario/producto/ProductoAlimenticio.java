/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inventario.producto;

import com.mycompany.inventario.proveedor.Proveedor;
import java.util.Date;
/**
 *
 * @author Asus Tuf
 */
public class ProductoAlimenticio extends Producto {
    private Date fechaDeCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidad, Proveedor proveedor, Date fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public String getDetalles() {
        return getNombre() + " - Alimenticio (Caduca: " + fechaDeCaducidad + ")";
    }
}
