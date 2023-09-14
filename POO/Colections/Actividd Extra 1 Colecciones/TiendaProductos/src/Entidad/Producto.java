/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
Implementa un programa para una tienda de productos utilizando un ArrayList. 
* Para ello, se debe crear una clase llamada Producto que guarde la información 
* de cada uno de los productos de la tienda. La clase Producto debe guardar
*       el nombre del producto, la categoría, el precio y la cantidad en inventario.
* 
* Se debe realizar un CRUD para los productos (Crear, Leer, Modificar o Eliminar)
Podrás crear los métodos que sean necesarios para que el programa sea más completo.
Aclaración:
 */
public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int cantidadEnInventario;

    public Producto() {
    }

    public Producto(String nombre, String categoria, double precio, int cantidadEnInventario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadEnInventario = cantidadEnInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }
    
    
    
}
