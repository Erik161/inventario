/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inventario.precio;
import com.mycompany.inventario.producto.Producto;
import java.util.List;
/**
 *
 * @author Asus Tuf
 */
public interface CalculadorDePrecio {
    double calcularPrecioTotal(List<Producto> productos);
}
