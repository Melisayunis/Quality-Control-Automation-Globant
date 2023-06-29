/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import Entidad.Person;
import Servicio.ServicePerson;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicePerson servPeople = new ServicePerson();
        Person people = servPeople.crearPersona();
        
        boolean exit = true;
        int opc, edad;
        
        do {
            System.out.println("");
            System.out.println("Ingrese la opcion que desea realizar: ");
            System.out.println("    1: Calcular edad de la persona.");
            System.out.println("    2: Ver si es menor.");
            System.out.println("    3: Mostrar los datos de la persona.");
            System.out.println("    4: Salir.");
            System.out.println("");
            opc = leer.nextInt();
            
            switch (opc){
                case 1:
                    System.out.println("   -> La edad es: " + servPeople.calcularEdad(people) );
                    break;
                case 2:
                    System.out.println("Ingrese una edad para comparar: ");
                    edad = leer.nextInt();
                    System.out.println("    -> " + edad + " es menor que " + servPeople.calcularEdad(people) + "? " + servPeople.menorQue( servPeople.calcularEdad(people) , edad));
                    break;
                case 3:
                    servPeople.mostrarPersona(people);
                    break;
                case 4:
                    System.out.println("    ¡¡Hasta luego!!");
                    exit = false;
                    break;
                default:
                    System.out.println("    -> La opcion ingresada es incorrecta. ");
                    break; 
            } 
        } while (exit == true);
    }
}
