
import Servicio.TiendaClassService;
import Servicio.TiendaService;
import java.util.Scanner;


/**
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        TiendaService serviceStore = new TiendaService();
        TiendaClassService serviceClassStore = new TiendaClassService();
        
        boolean exit = true;
        int opc;

        do {
            menu();
            opc = read.nextInt();
            
            switch (opc) {
                case 1:
                    //serviceStore.addProduct();
                    serviceClassStore.addStore();
                    serviceClassStore.addProduct();
                    break;
                case 2:
                    //serviceStore.searchProduct();
                    serviceClassStore.searchProduct();
                    break;
                case 3:
                    //serviceStore.changeProduct();
                    serviceClassStore.changeProduct();
                    break;
                case 4:
                    //serviceStore.showProducts();
                    serviceClassStore.showProducts();
                    break;
                case 5:
                    //serviceStore.deleteProduct();
                    serviceClassStore.deleteProduct();
                    break;
                case 0:
                    exit = false;
                    System.out.println("    ¡Hasta luego!");
                    break;
                default:
                    System.out.println("    -> La opcion ingresada es incorrecta, intentelo nuevamente.");
            }
        } while (exit);
        
    }
    
    private static void menu() {
        System.out.println("\n -> Ingrese la opcion que desea realizar: "
                + "\n   * 1: Agregar un nuevo producto a la tienda."
                + "\n   * 2: Buscar el precio de un producto."
                + "\n   * 3: Cambiar el precio de un producto."
                + "\n   * 4: Mostrar todos los productos disponibles."
                + "\n   * 5: Eliminar un producto."
                + "\n   * 0: Salir."
        );
    }
    
}
