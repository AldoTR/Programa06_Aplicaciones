/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa06;

import java.time.Instant;

/**
 *
 * @author aldo
 */
import java.util.Date;

public class Programa06{

    public static void main(String[] args) {
         DAOVenta dao = new DAOVenta();
        Venta venta = new Venta();
        
        DetalleVenta d1 = new DetalleVenta();
        DetalleVenta d2 = new DetalleVenta();
        
        Date fecha = Date.from(Instant.now());
        venta.setFecha(new java.sql.Date(fecha.getTime()));
        
        venta.setMonto(1000.00);
        
        d1.setDescripcion("Primera descripción");
        d1.setCantidad(3);
        d1.setPrecio(34);
        d1.setSubtotal(342);
        d1.setVenta(venta);
        venta.getDetalle().add(d1);
        
        d2.setDescripcion("Segunda descripción");
        d2.setCantidad(4);
        d2.setPrecio(32);
        d2.setSubtotal(3421);
        d2.setVenta(venta);
        venta.getDetalle().add(d2);
        
        dao.create(venta);
        System.out.println("Hello World!");
    }
}

/*

Campos de la base de datos:
Venta: Clave, Fecha, Monto.
DetalleVenta: Clase producto, Cantidad, Precio, Subtotal, ID venta (FK).

*/

