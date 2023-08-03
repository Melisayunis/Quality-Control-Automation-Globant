
import Entidad.Producto;
import Servicio.Tienda;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * En el main, se creará un ArrayList de tipo Producto que guardará todos los
 * productos creados. A continuación, tendrás que crear un bucle que solicite al
 * usuario los datos de cada producto y los setee en el objeto Producto
 * correspondiente, que se agregará al ArrayList.
 */
public class TiendaProductos {
    

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Producto> listaProductos = new ArrayList();
        
        boolean exit = true;
        int opc;
        
        Tienda tiendaProducto = new Tienda();

        do {
            menu();
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    // agregar nuevo
                    listaProductos.add(tiendaProducto.agregarProducto());
                    break;
                case 2:
                    // mostrar
                    tiendaProducto.mostrarProductos(listaProductos);
                    break;
                case 3:
                    // reponer
                    tiendaProducto.reposicion(listaProductos);
                    break;
                case 4: 
                    // vender
                    if (tiendaProducto.venta(listaProductos)) {
                        System.out.println("    -> Venta exitosa.");
                        break;
                    }
                    System.out.println("    -> La venta no se ha concretado.");
                    break;
                case 5:
                    // actualizar algun dato del producto
                    tiendaProducto.modificarProductos(listaProductos);
                    break;
                case 6: 
                    // eliminar un producto
                    tiendaProducto.eliminarProducto(listaProductos);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    exit = false;
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta, intentelo nuevamente.");
                    break;
            }

        } while (exit);

    }
    
    private static void menu(){
        System.out.println("\n Ingrese la opcion que desea realizar: ");
            System.out.println("    1: Agregar producto."
                             + "\n    2: Mostrar los productos."
                             + "\n    3: Reponer un producto."
                             + "\n    4: Vender un producto."
                             + "\n    5: Actualizar datos de un producto."
                             + "\n    6: Eliminar un producto."
                             + "\n    0: Salir.");
    }
    

}
