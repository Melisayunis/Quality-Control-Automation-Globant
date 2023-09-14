/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * La clase Tienda contendrá además los siguientes métodos: 
 * Método venta(): El
 * usuario ingresa el nombre del producto que quiere comprar y se lo busca en el
 * ArrayList. Si está en el ArrayList, se llama con ese objeto Producto al
 * método. El método se decrementa de a uno, como un carrito de compras, el
 * atributo cantidad en inventario, del producto que ingresó el usuario. Esto
 * sucederá cada vez que se realice una venta del producto. No se podrán vender
 * productos de los que no queden inventario disponible para vender. Devuelve
 * true si se ha podido realizar la operación y false en caso contrario.
 *
 * Método reposición(): El usuario ingresa el nombre del producto que quiere
 * reponer y se lo busca en el ArrayList. Si está en el ArrayList, se llama con
 * ese objeto al método. El método incrementa de a uno, como un carrito de
 * compras, el atributo cantidad en inventario, del producto seleccionado por el
 * usuario. Esto sucederá cada vez que se produzca una reposición de un
 * producto.
 *
 * Método toString para mostrar los datos de los productos.
 */
public class Tienda {

    private static final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Producto agregarProducto() {
        Producto newProduct = new Producto();

        // ingresar y cargar
        // el nombre del producto, la categoría, el precio y la cantidad en inventario.
        System.out.println("Ingrese el nombre del nuevo producto: ");
        newProduct.setNombre(read.next());
        System.out.println("Ingrese la categoria del producto: ");
        newProduct.setCategoria(read.next());
        System.out.println("Ingrese el precio del producto: ");
        newProduct.setPrecio(read.nextDouble());
        System.out.println("Ingrese la cantidad de productos en el inventario: ");
        newProduct.setCantidadEnInventario(read.nextInt());
        
        System.out.println("    -> Producto agregado exitosamente.");
        return newProduct;
    }

    public void mostrarProductos(ArrayList<Producto> listaProductos) {
        
        System.out.println("Los productos disponibles en la tienda son: ");
        for(Producto product: listaProductos) {
            System.out.println("    -> Nombre: " + product.getNombre());
            System.out.println("    -> Categoria: " + product.getCategoria());
            System.out.println("    -> Precio: " + product.getPrecio());
            System.out.println("    -> Cantidad en inventario: " + product.getCantidadEnInventario() + "\n");
        }
        
        /*   Functional operations
        
        listaProductos.stream().map((product) -> {
            System.out.println("    -> Nombre: " + product.getNombre());
            return product;
        }).map((product) -> {
            System.out.println("    -> Categoria: " + product.getCategoria());
            return product;
        }).map((product) -> {
            System.out.println("    -> Precio: " + product.getPrecio());
            return product;
        }).forEachOrdered((product) -> {
            System.out.println("    -> Cantidad en inventario: " + product.getCantidadEnInventario() + "\n");
        });        */
    }

    public void modificarProductos(ArrayList<Producto> listaProductos) {
        boolean isHere = false;
        System.out.println("Ingrese el nombre del producto que desea modificar: ");
        String name = read.next();
        
        for (Producto product: listaProductos) {
            if (product.getNombre().equals(name)) {
                System.out.println("Ingrese el nuevo nombre del producto: ");
                product.setNombre(read.next());
                System.out.println("Ingrese la nueva categoria del producto: ");
                product.setCategoria(read.next());
                System.out.println("Ingrese el nuevo precio del producto: ");
                product.setPrecio(read.nextDouble());
                System.out.println("Ingrese la nueva cantidad de inventario del producto: ");
                product.setCantidadEnInventario(read.nextInt());
                
                System.out.println("    -> Producto actualizado correctamente.");
                isHere = true;
                break;
            }
        }
        if (!isHere) {
             System.out.println("    -> El producto no se pudo actualizar, no se encontró en la tienda." 
                + " Intentelo nuevamente.");
        }
       
    }
    
    public void reposicion(ArrayList<Producto> listaProductos){
        /* Método reposición(): El usuario ingresa el nombre del producto que quiere
        * reponer y se lo busca en el ArrayList. 
        Si está en el ArrayList, se llama con ese objeto al método. 
        El método incrementa de a uno, como un carrito de compras, el atributo 
        cantidad en inventario, del producto seleccionado por el usuario. 
        Esto sucederá cada vez que se produzca una reposición de un producto. */
        boolean isHere = false;
        System.out.println("Ingrese el nombre del producto que desea reponer: ");
        String name = read.next();
        
        for (Producto product: listaProductos) {
            if (product.getNombre().equals(name)) {
                product.setCantidadEnInventario(product.getCantidadEnInventario()+1);
                System.out.println("    -> Reposición exitosa.");
                isHere = true;
                break;
            }
        }
        if (!isHere) {
            System.out.println("    -> No se ha encontrado el producto para reponer. Intentelo nuevamente.");
        }
        
    }
    
    public boolean venta(ArrayList<Producto> listaProductos) {
        /* Método venta(): El usuario ingresa el nombre del producto que quiere comprar 
        y se lo busca en el ArrayList. 
        Si está en el ArrayList, se llama con ese objeto Producto al método. 
        El método se decrementa de a uno, como un carrito de compras, el atributo 
        cantidad en inventario, del producto que ingresó el usuario. 
        Esto sucederá cada vez que se realice una venta del producto. No se podrán vender
        productos de los que no queden inventario disponible para vender. 
        Devuelve true si se ha podido realizar la operación y false en caso contrario. */
        System.out.println("Ingrese el nombre del producto que desea vender: ");
        String name = read.next();
        
        for (Producto product: listaProductos) {
            if (product.getNombre().equals(name)) {
                if (product.getCantidadEnInventario() > 0) {
                    // me fijo que queden productos en el inventario
                    product.setCantidadEnInventario(product.getCantidadEnInventario()-1);
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void eliminarProducto(ArrayList<Producto> listaProductos) {
        boolean isHere = false;
        Iterator<Producto> iterador = listaProductos.iterator();
        System.out.println("Ingrese el nombre del producto que desea eliminar: ");
        String name = read.next();
        
        while (iterador.hasNext()) {
            if (iterador.next().getNombre().equals(name)) {
                iterador.remove();
                System.out.println("    -> Producto eliminado exitosamente.");
                isHere = true;
                break;
            }
        }
        
        if (!isHere) {
            System.out.println("    -> No se encontro el producto a eliminar. Intentelo nuevamente."); 
        }
    }

}
