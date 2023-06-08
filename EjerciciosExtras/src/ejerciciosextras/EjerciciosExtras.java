/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextras;
import java.util.Scanner;

public class EjerciciosExtras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de ejercicio que desea realizar: ");
        int num = leer.nextInt();
        
        switch (num) {
            case 1:
                MinutosADiasHoras();
                break;
            case 2:
                ej2();
                break;
            case 3:
                ej3();
                break;
            case 4:
                ej4();
                break;
            case 5:
                ej5();
                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            default:
                System.out.println("La opcion ingresa es incorrecta!");
        }
        
        
    }
    
    public static void MinutosADiasHoras() {
        /*
        Dado un tiempo en minutos, calcular su equivalente en días y horas. 
        Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
        su equivalente: 1 día, 2 horas.
        */
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos a calcular: ");
        int minutos = leer.nextInt();
        int dias = 0, horas = 0;
        
            if (minutos / 60 > 0) {
                horas = minutos / 60;
                if (horas / 24 > 0) {
                    dias = horas / 24;
                    horas -= (dias*24);
                }
            }
        System.out.println("Minutos: " + minutos + " son: " + dias + " dias con " + horas + " horas.");
    }
    
    public static void ej2() {
        /*
        Declarar cuatro variables de tipo entero A, B, C y D y asignarle un 
        valor diferente a cada una. 
        A continuación, realizar las instrucciones 
        necesarias para que: B tome el valor de C, C tome el valor de A, A tome
        el valor de D y D tome el valor de B. Mostrar los valores iniciales y 
        los valores finales de cada variable. Utilizar sólo una variable auxiliar.
        */
        int aux;
        int A = 1, B = 8, C = 6, D = 4;
        System.out.println("los valores de A, B, C, D son: " + A + B + C + D);
        
        // B tome el valor de C
        aux = B;
        B = C;
        
        // C tome el valor de A
        C = A;
        
        // A tome el valor de D
        A = D;
        
        // D tome el valor de B
        D = aux;
        System.out.println("los valores de A, B, C, D son: " + A + B + C + D);
    }
    
    public static void ej3(){
        /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si 
        se trata de una vocal. Caso contrario mostrar un mensaje. 
        Nota: investigar la función equals() de la clase String.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        String letra = leer.nextLine();
        
        // Otra forma usando equals()
        letra = letra.toLowerCase();
        
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada es una consonante.");
        }
    }
    
    public static void ej4() {
        /*
        Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
        y se muestre su equivalente en romano.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10: ");
        int num = leer.nextInt();
        
        if (num > 0 && num < 11) {
            switch (num) {
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
                case 10:
                    System.out.println("X");
                    break;
                default:
                    System.out.println("El numero ingresado no es valido.");
                    break;
            }
        } else {
            System.out.println("El numero ingresa esta fuera de rango.");
        }
    }
    
    public static void ej5() {
        /*
        Una obra social tiene tres clases de socios:
            o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
        descuento en todos los tipos de tratamientos.
            o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
        descuento para los mismos tratamientos que los socios del tipo A.
            o Los socios que menos aportan, los de tipo ‘C’, no reciben 
        descuentos sobre dichos tratamientos.
            o Solicite una letra (carácter) que representa la clase de un socio, 
        y luego un valor real que represente el costo del tratamiento (previo al descuento) 
        y determine el importe en efectivo a pagar por dicho socio.
        */
        Scanner leer = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese que tipo de socio es: A, B, C");
        String letra = leer.nextLine();
        System.out.println("Ingrese el costo del tratamiento: ");
        float costo = read.nextFloat();
        
        switch (letra.toLowerCase()) {
            case "a":
                System.out.println("Usted tiene un 50% de descuento y debe pagar por el tratamiento: " + 50*costo/100);
                break;
            case "b":
                System.out.println("Usted tiene un 35% de descuento y debe pagar por el tratamiento: " + (costo - 35*costo/100));
                break;
            case "c":
                System.out.println("Usted no tiene descuento para el costo del tratamiento, deberá abonar: " + costo);
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta.");
                break;
        }  
    }
    
    
    
    
    
    
    public static int[][] llenarMatriz(int[][] matriz, int n, int m) {
        

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                
                
            }
        }
        
        
        
        return matriz;
    }
    
}
