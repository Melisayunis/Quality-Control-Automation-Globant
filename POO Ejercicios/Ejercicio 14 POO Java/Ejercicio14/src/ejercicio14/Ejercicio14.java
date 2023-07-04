/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import Entidad.Movil;
import Servicio.serviceMovil;
import java.util.Scanner;

/**
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. 
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean exit = true;
        int opc;        
        
        serviceMovil service = new serviceMovil();
        Movil movil = new Movil();
        
        do {
            System.out.println("");
            System.out.println("Ingrese la opcion que desea realizar:");
            System.out.println("    1: Cargar datos al movil.");
            System.out.println("    2: Mostrar los datos.");
            System.out.println("    3: Salir.");
            opc = read.nextInt();
            
            switch (opc) {
                case 1:
                    movil = service.cargarCelular();
                    break;
                case 2:
                    service.mostrarInfo(movil);
                    break;
                case 3:
                    exit = false;
                    System.out.println("Hasta luego!!");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta. Intente nuevamente.");
                    break;
            }
            
        } while(exit == true);
        
        
        
        
        
    }
    
}
