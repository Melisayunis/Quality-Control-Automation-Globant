/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.service;

import Entidad.Persona;
import java.util.Scanner;

public class ServicioPersona {
    
    // Variable global
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {

        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        
        System.out.println("Ingrese el apellido: ");
        String apellido = leer.next();
        
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        
        return new Persona(nombre, apellido, edad);
    }
}
