/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;
import java.time.LocalDate;

/**
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. 
* 
* Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Piense una fecha e ingrese el día: ");
        int dia = leer.nextInt();
        
        System.out.println("Ahora ingrese el numero del mes: ");
        int mes = leer.nextInt();
        
        System.out.println("Por ultimo ingrese los 4 numeros del año: ");
        int anio = leer.nextInt();
        
        LocalDate fechaActual = LocalDate.now();
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        
        System.out.println("La fecha ingresada es: ");
        System.out.println("Dia: " + fecha.getDayOfMonth());
        System.out.println("Mes: " + fecha.getMonthValue());
        System.out.println("Año: " + fecha.getYear());
        
        System.out.println(" " + fechaActual.getYear());
        // Años entre esa fecha y la actual
        System.out.println("Entre la fecha ingresada y la actual han pasado: ");
        System.out.println(" " +  (fechaActual.getYear() - fecha.getYear()) + " años.");
    }
    
}
