/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 */
public class TiendaService {

    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    // <nombreProducto, precio>
    HashMap<String, Integer> store = new HashMap<>();

    public void addProduct() {
        System.out.println("    -> Ingrese el nombre del nuevo producto: ");
        String name = read.next();
        System.out.println("    -> Ingrese el precio: ");
        int price = read.nextInt();

        store.put(name, price);
        System.out.println(" * Producto agregado exitosamente.");
    }

    public void showProducts() {
        System.out.println("    -> Los productos en la tienda son: ");
        for (Map.Entry<String, Integer> products : store.entrySet()) {
            System.out.println(" * Nombre: " + products.getKey()
                    + " * Precio: " + products.getValue());
        }
        /* store.entrySet().forEach((products) -> {
            System.out.println(" * Nombre: " + products.getKey()
                    + " * Precio: " + products.getValue());
        });*/
    }

    public void changeProduct() {
        System.out.println("    -> Ingrese el nombre del producto que desea cambiarle el precio: ");
        String name = read.next();
        
        if (store.containsKey(name)) {
            System.out.println("    -> Ingrese el nuevo precio: ");
            int price = read.nextInt();
            
            store.put(name, price);
            System.out.println(" * Precio actualizado exitosamente.");
            
        } else System.out.println(" * El producto ingresado no existe, intente nuevamente.");
    }

    public void searchProduct() {
        System.out.println("    -> Ingrese el nombre del producto que desea buscar: ");
        String name = read.next();
        
        if (store.containsKey(name)) {
            System.out.println(" * El precio del producto es: " + store.get(name));
            
        } else System.out.println(" * El producto no se ha encontrado, intentelo nuevamente.");
    }

    public void deleteProduct() {
        System.out.println("    -> Ingrese el nombre del producto a eliminar: ");
        String name = read.next();
        
        if (store.containsKey(name)) {
            store.remove(name);
            System.out.println(" * Producto eliminado correctamente.");
        } else System.out.println(" * El producto no se ha encontrado, intentelo nuevamente");
    }

}
