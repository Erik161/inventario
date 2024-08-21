/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inventario.principal;

import com.mycompany.inventario.producto.Producto;
import com.mycompany.inventario.proveedor.Proveedor;
import com.mycompany.inventario.producto.ProductoElectronico;

/**
 *
 * @author Asus Tuf
 */
public class Main {
    public static void main(String[] args) {
        // Aquí puedes inicializar tus objetos y probar la lógica
        Proveedor proveedor = new Proveedor("Proveedor 1", null);
        Producto producto = new ProductoElectronico("Televisor", 500.0, 10, proveedor, 24);
        
        System.out.println(producto.getDetalles());
    }
}
