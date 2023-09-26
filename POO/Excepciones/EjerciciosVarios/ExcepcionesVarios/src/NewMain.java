
import Entity.Ejercicio2;
import Entity.Ejercicio3y4DivisionNumero;
import Entity.Ejercicio5AdivinarNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
        el ingreso por teclado puede causar una excepción de tipo InputMismatchException,
        */
public class NewMain {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Ejercicio2 arreglos = new Ejercicio2();
        arreglos.capturandoExcepcionesArreglos();
        
        /* ----------------------------------------------------------------- */
        
        Ejercicio3y4DivisionNumero division = new Ejercicio3y4DivisionNumero();
        
        try {
            System.out.println(" Ingrese un numero: ");
            String num1 = read.next();
            
            System.out.println(" Ingrese un segundo numero: ");
            String num2 = read.next();
            
            Double result = division.divisionDosNumeros(num1, num2);
            System.out.println("El resultado de la division de los 2 numeros es: " + result);
            
        } catch (InputMismatchException e) {
            System.out.println("Exception: " + e);
        }

        /* ----------------------------------------------------------------- */
        
        Ejercicio5AdivinarNumero adivinanza = new Ejercicio5AdivinarNumero();
        
        int cantidadIntentos = adivinanza.play();
        System.out.println(String.format(" Ha realizado %s intentos hasta adivinar el numero!", cantidadIntentos));
    
    
    
    
    }
    
}
