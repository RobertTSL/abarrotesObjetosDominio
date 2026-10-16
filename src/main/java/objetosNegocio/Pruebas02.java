/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package objetosNegocio;

import java.util.Date;

/**
 *
 * @author rober
 */
public class Pruebas02 {

    public static void main(String[] args) {
        Producto producto1 = new Producto("EM001", "Atun en aceite", 'E', "PZ");
        Producto producto2 = new Producto("EM002", "Elotitos Amarillos", 'E', "PZ");
        Producto producto3 = new Producto("EM120", "Chiles Jalapenos", 'E', "PZ");
        Producto producto4 = new Producto("GR001", "Frijol azufrado", 'G', "KG");
        Producto producto5 = new Producto("GR013", "Arroz Grano Largo", 'G', "KG");
        Producto producto6 = new Producto("GR002", "Azucar Refinada", 'G', "KG");

        Producto[] objetos = {producto1, producto2, producto3, producto4, producto5, producto6};
        System.out.println("Lista de productos disponibles");
        for (Producto objeto : objetos) {
            System.out.println(objeto);
        }

        System.out.println(producto1.getNombreProducto());

        producto5.setNombreProducto("Arroz Grano Corto");
        System.out.println(producto5);

        if (producto1.equals(producto1)) {
            System.out.println("El producto 1 es el mismo que el producto 1");
        }
        if (producto4.equals(producto6)) {
            System.out.println("son iguales");
        } else {
            System.out.println("El producto 4 y el producto 5 no son iguales");
        }

        ProductoEmpacado productoEmpacado1 = new ProductoEmpacado(producto1, 10);
        ProductoEmpacado productoEmpacado2 = new ProductoEmpacado(producto2, 20);

        ProductoEmpacado[] empacados = {productoEmpacado1, productoEmpacado2};
        for (int i = 0; i < empacados.length; i++) {
            System.out.println(objetos[i]);
        }

        System.out.println("Cantidad disponible del producto empacado 2: " + productoEmpacado2.getCantidad() + "Unidades");

        if (productoEmpacado1.equals(productoEmpacado2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("El producto empacado 1 y el producto empacado 2 son diferentes");
        }

        ProductoGranel productoGranel1 = new ProductoGranel(producto4, 25.0f);
        ProductoGranel productoGranel2 = new ProductoGranel(producto5, 12.5f);

        ProductoGranel[] granel = {productoGranel1, productoGranel2};
        for (int i = 0; i < granel.length; i++) {
            System.out.println(objetos[i]);
        }

        System.out.println("Cantidad disponible del producto a granel 1: " + productoGranel1.getCantidad() + " Unidades");

        if (productoGranel1.equals(productoGranel2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("El producto a granel 1 y el producto a granel 2 son diferentes");
        }

        Date hoy = new Date();
        Date ayer = new Date(hoy.getTime() - (1000 * 60 * 60 * 24));

// Fecha de ayer
        MovimientoEmpacado movimientoEmpacado1 = new MovimientoEmpacado("MV");
        MovimientoEmpacado movimientoEmpacado2 = new MovimientoEmpacado("MV");

        movimientoEmpacado1.setFecha(hoy);
        movimientoEmpacado1.setProcesado(false);
        movimientoEmpacado1.setProductoEmpacado(productoEmpacado1);
        movimientoEmpacado2.setFecha(ayer);
        movimientoEmpacado2.setProcesado(false);
        movimientoEmpacado2.setProductoEmpacado(productoEmpacado2);

        System.out.println(movimientoEmpacado1);
        System.out.println(movimientoEmpacado2);

        System.out.println(movimientoEmpacado1.getProductoEmpacado().getCantidad());

        if (movimientoEmpacado1.equals(movimientoEmpacado2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("El movimiento empacado 1 y el movimiento empacado 2 son diferentes");
        }

        MovimientoGranel movimientoGranel1 = new MovimientoGranel("MV");
        MovimientoGranel movimientoGranel2 = new MovimientoGranel("MV");

        movimientoGranel1.setFecha(hoy);
        movimientoGranel1.setProcesado(false);
        movimientoGranel1.setProductoGranel(productoGranel1);
        movimientoGranel2.setFecha(ayer);
        movimientoGranel2.setProcesado(false);
        movimientoGranel2.setProductoGranel(productoGranel2);
        System.out.println(movimientoGranel1);
        System.out.println(movimientoGranel2);

        System.out.println("Fecha de movimiento: " + movimientoGranel1.getFecha());

        if (movimientoGranel1.equals(movimientoGranel2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("El movimiento Granel 1 y el movimiento Granel 2 son diferentes");
        }
    }
}
