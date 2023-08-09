/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Entidad.Tienda;

public class TiendaClassService {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    // <Producto, precio> -- <(nombre, stock, seccion), precio>
    HashMap<Tienda, Integer> store = new HashMap<>();

    public void addStore() {
        Tienda t1 = new Tienda("Lavandina", 5, "Limpieza");
        Tienda t2 = new Tienda("Detergente", 43, "Limpieza");
        Tienda t3 = new Tienda("Pelota", 21, "Deportes");
        Tienda t4 = new Tienda("Harina 000", 67, "Alimento");
        Tienda t5 = new Tienda("Yerba", 31, "Alimento");

        store.put(t1, 300);
        store.put(t2, 700);
        store.put(t3, 6000);
        store.put(t4, 350);
        store.put(t5, 550);
    }

    public void addProduct() {
        Tienda product = new Tienda();
        System.out.println("    -> Ingrese el nombre del producto: ");
        product.setProduct(read.next());
        System.out.println("    -> Ingrese la sección del producto: ");
        product.setSection(read.next());
        System.out.println("    -> Ingrese el stock del producto: ");
        int stock = read.nextInt();
        Integer stockProduct = stock;
        product.setStock(stockProduct);

        System.out.println("    -> Ingrese el precio del producto por unidad: ");
        int price = read.nextInt();

        store.put(product, price);
        System.out.println(" * Producto agregado exitosamente.");
    }

    public void showProducts() {
        System.out.println(" * Los productos de la tienda son: ");
        for (Map.Entry<Tienda, Integer> product : store.entrySet()) {
            Tienda newProduct = product.getKey();
            System.out.println("\n - Nombre: " + newProduct.getProduct()
                    + "\n - Seccion: " + newProduct.getSection()
                    + "\n - Stock: " + newProduct.getStock()
                    + "\n - Precio: " + product.getValue());
        }
    }

    public void changeProduct() {
        System.out.println("    -> Ingrese el nombre del pruducto que desea modificar: ");
        String name = read.next();
        boolean isHere = false;
                
        for (Map.Entry<Tienda, Integer> storeAux : store.entrySet()) {
            Tienda productAux = storeAux.getKey();
            if (productAux.getProduct().equals(name)) {
                isHere = true;
                
                System.out.println("    -> Ingrese el nuevo stock: ");
                int newStock = read.nextInt();
                storeAux.getKey().setStock(newStock);
                
                System.out.println("    -> Ingese el nuevo precio: ");
                int newPrice = read.nextInt();
                storeAux.setValue(newPrice);
                
                System.out.println(" * Datos actualizados correctamente.");
            }
        }
        if(!isHere){ 
            System.out.println(" * El producto no se encuentra en la tienda, intentelo nuevamente.");
        }
    }

    public void searchProduct() {
        System.out.println("    -> Ingrese el nombre del producto que desea buscar: ");
        String name = read.next();
        boolean isHere = false;

        for (Map.Entry<Tienda, Integer> newStore : store.entrySet()) {
            Tienda storeAux = newStore.getKey();
            if (storeAux.getProduct().equals(name)) {
                System.out.println(" - Nombre: " + storeAux.getProduct()
                        + "\n - Seccion: " + storeAux.getSection()
                        + "\n - Stock: " + storeAux.getStock()
                        + "\n - Precio: " + newStore.getValue()
                );
                isHere = true;
                break;
            }
        }
        if (!isHere) {
            System.out.println(" * El producto indicado no se encuentra en la tienda.");
        }
    }

    public void deleteProduct() {
        System.out.println("    -> Ingrese el nombre del producto a eliminar: ");
        String name = read.next();
        boolean isHere = false;
        
        for (Map.Entry<Tienda, Integer> newStore : store.entrySet()) {
            Tienda storeAux = newStore.getKey();
            
            if(storeAux.getProduct().equals(name)) {
                isHere = true;
                store.remove(storeAux);

                System.out.println(" * Producto eliminado exitosamente.");
                break;
            }
        }
        if (!isHere) {
            System.out.println(" * No se ha encontrado el producto, intentelo nuevamente.");
        }

    }
}
