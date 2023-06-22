/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import Entidad.Cafetera;
import Servicio.ServicioNespresso;
import java.util.Scanner;

/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 * capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de café que hay en la cafetera).
 * Implemente, al menos, los siguientes métodos:  Constructor predeterminado o
 * vacío  Constructor con la capacidad máxima y la cantidad actual Métodos
 * getters y setters.  Método llenarCafetera(): hace que la cantidad actual sea
 * igual a la capacidad máxima.  Método servirTaza(int): se pide el tamaño de
 * una taza vacía, el método recibe el tamaño de la taza y simula la acción de
 * servir la taza con la capacidad indicada. Si la cantidad actual de café “no
 * alcanza” para llenar la taza, se sirve lo que quede. El método le informará
 * al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó
 * la taza.  Método vaciarCafetera(): pone la cantidad de café actual en cero.
 *  Método agregarCafe(int): se le pide al usuario una cantidad de café, el
 * método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean seguir = true;
        int opc;
        ServicioNespresso ServicioCafet = new ServicioNespresso();

        Cafetera cafet = ServicioCafet.cargarCafetera();
        do {
            System.out.println("");
            System.out.println("Ingrese la opcion que desea hacer: ");
            System.out.println("* 1: Llenar la cafetera.");
            System.out.println("* 2: Servir una taza.");
            System.out.println("* 3: Vaciar la cafetera.");
            System.out.println("* 4: Agregar cafe.");
            System.out.println("* 5: Salir.");
            System.out.println("");

            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    ServicioCafet.llenarCafetera(cafet);
                    break;
                case 2:
                    ServicioCafet.servirTaza(cafet);
                    break;
                case 3:
                    ServicioCafet.vaciarCafetera(cafet);
                    break;
                case 4:
                    ServicioCafet.agregarCafe(cafet);
                    break;
                case 5:
                    seguir = false;
                    System.out.println("Gracias. Vuelva pronto!");
                    break;
                default:
                    System.out.println("La opcion ingresada es erronea.");
                    break;
            }
        } while (seguir == true);

    }

}
