
import Entidad.CantanteFamoso;
import Servicio.ServicioCantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos
 * y tendrá como atributos el nombre y discoConMasVentas. Se debe, además, en el
 * main, crear una lista de tipo CantanteFamoso y agregar 5 objetos de tipo
 * CantanteFamoso a la lista.
 *
 * Luego, se debe mostrar los nombres de cada cantante y su disco con más ventas
 * por pantalla. Una vez agregado los 5, en otro bucle, crear un menú que le de
 * la opción al usuario de agregar un cantante más, mostrar todos los cantantes,
 * eliminar un cantante que el usuario elija o de salir del programa. Al final
 * se deberá mostrar la lista con todos los cambios
 */
public class Ejercicio2Extra {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList<>();
        ServicioCantanteFamoso service = new ServicioCantanteFamoso();

        boolean exit = true;
        int opc;

        service.addCantantes(listaCantantes);
        service.showCantantes(listaCantantes);

        do {
            menu();
            opc = read.nextInt();
            
            switch(opc) {
                case 1:
                    service.addCantante(listaCantantes);
                    break;
                case 2:
                    service.deleteCantante(listaCantantes);
                    break;
                case 3:
                    service.searchCantante(listaCantantes);
                    break;
                case 4:
                    service.showCantantes(listaCantantes);
                    break;
                case 5: 
                    service.changeCantante(listaCantantes);
                    break;
                case 0: 
                    System.out.println("¡Hasta luego!");
                    exit = false;
                    break;
                default:
                    System.out.println(" * La opcion ingresada es incorrecta, intetelo nuevamente.");
                    break;
            }
        } while (exit);

    }
    
    private static void menu(){
        System.out.println("\n -> Ingrese la opcion que desea realizar: "
                + "\n   1: Agregar un nuevo cantante."
                + "\n   2: Eliminar un cantante."
                + "\n   3: Buscar un cantante."
                + "\n   4: Mostrar todos los cantantes."
                + "\n   5: Cambiar un cantante."
                + "\n   0: Salir."
        );
    }

}
