/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribir un programa en Java que juegue con el usuario a adivinar un número.
 * La computadora debe generar un número aleatorio entre 1 y 500, y el usuario
 * tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce
 * un valor, la computadora debe decirle al usuario si el número que tiene que
 * adivinar es mayor o menor que el que ha introducido el usuario. Cuando
 * consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de
 * veces que el usuario ha intentado adivinar el número. Si el usuario introduce
 * algo que no es un número, se debe controlar esa excepción e indicarlo por
 * pantalla. En este último caso también se debe contar el carácter fallido como
 * un intento.
 */
public class Ejercicio5AdivinarNumero {

    public Ejercicio5AdivinarNumero() {
    }

    private Scanner read = new Scanner(System.in);
    
    public int play() {
        int numAleatorio = (int) Math.floor(Math.random() * 500 + 1);
        int count = 0;
        int adivinar = 0;
        String adivinarString;
        
        System.out.println(" num aleatorio " + numAleatorio);
        do {
            try {
                System.out.println(" * Ingrese un numero entre 1 y 500");
                adivinarString = read.next();
                adivinar = Integer.parseInt(adivinarString);
                
                if (numAleatorio > adivinar) {
                    System.out.println(" El numero a adivinar es -mayor- a " + adivinar);
                    System.out.println(" ---> Intentelo nuevamente!! ");
                    
                } else if (numAleatorio < adivinar) {
                    System.out.println(" El numero a adivinar es -menor- a " + adivinar);
                    System.out.println(" ---> Intentelo nuevamente!! ");
                }
                
            } catch (InputMismatchException e) {
                System.out.println(" Exception al ingresar datos por teclado: " + e);
            } catch (NumberFormatException e) {
                System.out.println(" Exception por conversion de datos incorrecta: " + e);
            } finally {
                count += 1;
            }
            
        } while (numAleatorio != adivinar);
        
        System.out.println(String.format(" --- ¡¡¡Felicidades ha adivinado, el numero es %s!!! --- ", numAleatorio));
        
        return count;
    }
    
}
