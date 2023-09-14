/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscondionales;
import java.util.Scanner;

public class EjerciciosCondionales {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leerString = new Scanner(System.in);
        String frase;
        
        System.out.println("Que ejercicio desea realizar: 6, 7, 8 o 9?");
        int ej = leer.nextInt();
        
        switch (ej) {
            case 6:
                System.out.println("Ingrese un numero para ver si es par o impar:");
                int num = leer.nextInt();
                parImpar(num);
                break;
            case 7:
                System.out.println("Ingrese un frase:");
                frase = leerString.nextLine();
                eureka(frase);
                break;
            case 8:
                System.out.println("Ingrese una frase: ");
                frase = leerString.nextLine();
                frase8letras(frase);
                break;
            case 9:
                System.out.println("Ingrese una frase: ");
                frase = leerString.nextLine();
                primeraA(frase);
                break;
            default:
                System.out.println("El numero ingresado no es un ejercicio válido.");
        }
    }
        
    public static void parImpar(int num){
        /*
        Crear un programa que dado un numero determine si es par o impar.
        */
        if (num%2 == 0){
            System.out.println("El numero ingresado es Par.");
        } else {
            System.out.println("El numero ingresa es Impar.");
        }
    }
    
    public static void eureka(String frase){
        /*
        Crear un programa que pida una frase y si esa frase es igual a “eureka”
        el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
        Incorrecto. Nota: investigar la función equals() en Java.
        */
        if (frase.equals("eureka")) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }
    }
    
    public static void frase8letras(String frase){
        /*
        Realizar un programa que solo permita introducir solo frases o palabras 
        de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo 
        se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
        en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
        la función Lenght() en Java.
        */
        if (frase.length() == 8 ){
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }
    }
    
    public static void primeraA(String frase) {
        /*
        Escriba un programa que pida una frase o palabra y valide si la primera 
        letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se 
        deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
        en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
        la función Substring y equals() de Java.
        */
        
        if (frase.charAt(0) == 'a'){
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }
    }
}
