/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscondionales;
import java.util.Scanner;

public class EjerciciosWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leerString = new Scanner(System.in);
        
        System.out.println("Ingrese el nro de ejercicio a ejecutar: ");
        int num = leer.nextInt();
        
        switch (num) {
            case 10:
                System.out.println("");
                limitesSuma();
                break;
            case 11:
                menu();
                break;
            case 12:
                dispositivoRS232();
                break;
            case 13:
                cuadradoEstrellita();
                break;
            default:
                System.out.println("El ejercicio ingresado no es correcto.");
        }     
    }
    
    public static void limitesSuma(){
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, 
        y a continuación solicite números al usuario hasta que la suma de los 
        números introducidos supere el límite inicial.
        */
        Scanner read = new Scanner(System.in);
        int suma = 0;
        
        System.out.println("Ingrese un numero limite positivo: ");
        int num = read.nextInt();
        
        if (num > 0) {
            while (suma < num){
                System.out.println("Ingrese un numero a sumar: ");
                suma += read.nextInt();
                System.out.println("La suma es: " + suma);
            }
        } else {
            System.out.println("El numero ingresado no es positivo.");
        } 
    }
    
    public static void menu(){
        /*
        Realizar un programa que pida dos números enteros positivos por teclado 
        y muestre por pantalla el siguiente menú:
        MENU
            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir
            5. Salir
            Elija opción:
        El usuario deberá elegir una opción y el programa deberá mostrar el 
        resultado por pantalla y luego volver al menú. El programa deberá 
        ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el 
        usuario selecciona la opción 5, en vez de salir del programa directamente, 
        se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
        desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ 
        se sale del programa, caso contrario se vuelve a mostrar el menú.
        */
        Scanner read = new Scanner(System.in);
        Scanner readString = new Scanner(System.in);
        String SN;
        boolean salir = true;
        
        System.out.println("Ingrese el primer numero entero positivo: ");
        int num1 = read.nextInt();
        System.out.println("Ingrese el segundo numero entero positivo: ");
        int num2 = read.nextInt();
        
        if (num1 > 0 && num2 > 0) {
            while (salir == true) {
                System.out.println("¿Que desea realizar? ");
                System.out.println("MENU");
                System.out.println("    1. Sumar");
                System.out.println("    2. Restar");
                System.out.println("    3. Multiplicar");
                System.out.println("    4. Dividir");
                System.out.println("    5. Salir");
                System.out.println("    Elija opción:");

                int num = read.nextInt();

                switch (num) {
                    case 1:
                        System.out.println("La suma de los dos numeros es: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("La resta de los numeros es: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("La multiplicacion entre los numeros es: " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("la division entre los numeros es: " + (num1 / num2));
                        break;
                    case 5:
                        System.out.println("Esta seguro que desea salir del programa? S/N");
                        SN = readString.nextLine();
                        if (SN.equals("s")) {
                            salir = false;
                        }
                        break;
                    default:
                        System.out.println("El valor ingresado es incorrecto");
                }
            }
        }
    }
    
    public static void dispositivoRS232() {
        /*
        Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
        este tipo de dispositivo lee cadenas enviadas por el usuario. 
        
        Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo 
        de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
        
        Las secuencias leídas que respeten el formato se consideran correctas, 
        la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
        y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de 
        lecturas correctas e incorrectas recibidas. 
        
        Para resolver el ejercicio deberá investigar cómo se utilizan las 
        siguientes funciones de Java Substring(), Length(), equals().
        */
        
        Scanner leer = new Scanner(System.in);
        boolean fin = true;
        String frase;
        int correcto = 0, incorrecto = 0, largo;
        
        do {
            System.out.println("Ingrese una cadena de 5 caracteres: ");
            frase = leer.nextLine();

            if (frase.equals("&&&&&")) {
                fin = false;
            } else {
                if (frase.length() <= 5) {
                    largo = frase.length() - 1;

                    if ((frase.charAt(0) == 'X') && (frase.charAt(largo) == 'O')) {
                        correcto += 1;
                    } else {
                        incorrecto += 1;
                    }
                } else {
                    System.out.println("La frrase no tiene el largo correcto.");
                    System.out.println("Intentelo nuevamente.");
                    System.out.println("");
                }
            }
        } while (fin == true);
        
        System.out.println("La cantidad de secuentas leidas correctas son: " + correcto);
        System.out.println("La cantidad de secuencias leidas incorrectas son: " + incorrecto);     
    }
    
    public static void cuadradoEstrellita() {
        /*
        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
        Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        */
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cuantos elementos tendra el cuadrado por lado: ");
        int num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num ; j++) {
                if (i == 0 || i == num-1 || j == 0 || j == num-1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
    
    
}
