/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

import java.util.Scanner;

/**
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
* 
Ejercicio4:
* Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, 
* 
* el método Integer.parseInt() si la cadena no puede convertirse a entero, 
* arroja una NumberFormatException y además, 
* al dividir un número por cero surge una ArithmeticException. 
* Manipule todas las posibles excepciones utilizando bloques try/catch para las distintas excepciones
 */
public class Ejercicio3y4DivisionNumero {

    public int numero1;
    public int numero2;

    public Ejercicio3y4DivisionNumero() {
    }
    
    public double divisionDosNumeros(String num1, String num2){
        
        try {
            numero1 = Integer.parseInt(num1);
            numero2 = Integer.parseInt(num2);
        } catch (NumberFormatException e) {
            /*
            Si ingreso una letra en vez de un numero en la variable, por ejemplo 'j'
            la excepcion que se muestra ene ste ejemplo es:
            
            Exception: java.lang.NumberFormatException: For input string: "j"
            */
            System.out.println("Exception: " + e);
        }
        
        try {
            return (numero1 / numero2);
            
        } catch (ArithmeticException e) {
            /*
            Al intentar dividir por 0, la excepcion que aparece es:
            
            Exception: java.lang.ArithmeticException: / by zero            
            */
            System.out.println("Exception: " + e);
        }
        
        return 0;
    }
    
    
    
}
