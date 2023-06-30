/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import Entidad.Curso;
import Servicio.ServicioClase;
import java.util.Scanner;

/**
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioClase serviceClase = new ServicioClase();
        Curso course = new Curso();
        
        boolean exit = true;
        int opc;
        
        do {
            System.out.println("");
            System.out.println("Ingrese la opcion que desea realizar: ");
            System.out.println("    1: Crear un curso nuevo.");
            System.out.println("    2: Calcular la ganancia del curso.");
            System.out.println("    3: Mostrar la informacion del curso.");
            System.out.println("    4: Salir.");
            System.out.println("");
            opc = leer.nextInt();
            
            switch (opc){
                case 1:
                    course = serviceClase.crearCurso();
                    break;
                case 2:
                    System.out.print("    -> La ganancia del curso es $");
                    System.out.println(serviceClase.calcularGananciaSemanal(course));
                    break;
                case 3:
                    serviceClase.mostrarInfo(course);
                    break;
                case 4:
                    exit = false;
                    System.out.println("    -> ¡Hasta luego!");
                    break;
                default:
                    System.out.println("    -> La opcion ingresada e sincorrecta.");
                    break;
            } 
        } while (exit == true);
    }
}
