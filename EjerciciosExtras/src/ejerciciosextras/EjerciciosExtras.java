/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextras;

import java.util.Scanner;
import java.lang.Math;

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
                ej6();
                break;
            case 7:
                ej7();
                break;
            case 8:
                ej8();
                break;
            case 9:
                ej9();
                break;
            case 10:
                ej10();
                break;
            case 11:
                ej11();
                break;
            case 12:
                ej12();
                break;
            case 13:
                ej13();
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
                horas -= (dias * 24);
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

    public static void ej3() {
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

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
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
                System.out.println("Usted tiene un 50% de descuento y debe pagar por el tratamiento: " + 50 * costo / 100);
                break;
            case "b":
                System.out.println("Usted tiene un 35% de descuento y debe pagar por el tratamiento: " + (costo - 35 * costo / 100));
                break;
            case "c":
                System.out.println("Usted no tiene descuento para el costo del tratamiento, deberá abonar: " + costo);
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta.");
                break;
        }
    }

    public static void ej6() {
        /*
        Leer la altura de N personas y determinar el promedio de estaturas que 
        se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
         */
        Scanner leer = new Scanner(System.in);
        float promedioMenor = 0, promedioTotal = 0, altura = 0, count = 0;

        System.out.println("Ingrese la cantiddad de estaturas que se van a ingresar: ");
        int cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el valor de la altura nro " + i);
            altura = leer.nextFloat();

            if (altura < 1.60) {
                promedioMenor += altura;
                count += 1;
            }
            promedioTotal += altura;
        }
        promedioMenor = promedioMenor / count;
        promedioTotal = promedioTotal / cantidad;

        System.out.println("El promedio de estaturas menor a 1.60 es: " + promedioMenor);
        System.out.println("El promedio total de las estaturas es: " + promedioTotal);
    }

    public static void ej7() {
        /*
        Realice un programa que calcule y visualice el valor máximo, el valor 
        mínimo y el promedio de n números (n>0). El valor de n se solicitará al 
        principio del programa y los números serán introducidos por el usuario. 
        Realice dos versiones del programa, una usando el bucle “while” y otra 
        con el bucle “do - while”.
         */

    }

    public static void ej8() {
        /*
        Escriba un programa que lea números enteros. Si el número es múltiplo de 
        cinco debe detener la lectura y mostrar la cantidad de números leídos, 
        la cantidad de números pares y la cantidad de números impares. 
        Al igual que en el ejercicio anterior los números negativos no deben sumarse.
         */
        int suma = 0, par = 0, impar = 0;
        Scanner leer = new Scanner(System.in);
        int num;
        boolean es = false;
        
        do {
            System.out.println("Ingrese un numero entero: ");
            num = leer.nextInt();
            
            if (num > 0) {
                suma += 1;
                
                if (num % 2 == 0) {
                    par += 1;
                } else {
                    impar += 1;
                }

                if (num % 5 == 0) {
                    System.out.println("es divisible por 5");
                    break;
                }
            }
        } while (es == false);

        System.out.println("La cantidad de numeros ingresados es: " + suma);
        System.out.println("La cantidad de numeros pares niigresados fue: " + par + " y los impares fueron: " + impar);
    }

    public static void ej9() {
        /*
        Simular la división usando solamente restas. Dados dos números enteros 
        mayores que uno, realizar un algoritmo que calcule el cociente y el 
        residuo usando sólo restas. Método: Restar el dividendo del divisor hasta 
        obtener un resultado menor que el divisor, este resultado es el residuo, 
        y el número de restas realizadas es el cociente.
            Por ejemplo: 50 / 13:
            50 – 13 = 37 una resta realizada
            37 – 13 = 24 dos restas realizadas
            24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        */

    }

    public static void ej10() {
        /*
        Realice un programa para que el usuario adivine el resultado de una 
        multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
        El programa debe indicar al usuario si su respuesta es o no correcta. 
        En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar 
        su respuesta nuevamente. Para realizar este ejercicio investigue 
        como utilizar la función Math.random() de Java.
         */
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int multi = num1 * num2, num;
        System.out.println("multi es :" + multi);
        boolean es = false;

        System.out.println("Ingrese un numero para adivinar el resultado entre la multiplicacion de dos numeros que van del 0 al 10:");
        num = leer.nextInt();
        do {
            if (num == multi) {
                es = true;
                System.out.println("Felicidades ha adivinado, el numero era: " + multi);
            } else {
                System.out.println("El numero ingresado no es igual, ingrese otro: ");
                num = leer.nextInt();
            }
        } while (es == false);
    }

    public static void ej11() {
        /*
        Escribir un programa que lea un número entero y devuelva el número de 
        dígitos que componen ese número. Por ejemplo, si introducimos el número 
        12345, el programa deberá devolver 5. Calcular la cantidad de dígitos 
        matemáticamente utilizando el operador de división. Nota: recordar que 
        las variables de tipo entero truncan los números o resultados.
        */

    }

    public static void ej12() {
        /*
        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los 
        números del 0-0-0 al 9-9-9, con la particularidad que cada vez que 
        aparezca un 3 lo sustituya por una E.
         */

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {

                    if (i == 3) {
                        System.out.println("E" + "-" + j + "-" + k);
                    } else if (j == 3) {
                        System.out.println(i + "-" + "E" + "-" + k);
                    } else if (k == 3) {
                        System.out.println(i + "-" + j + "-" + "E");
                    } else {
                        System.out.println(i + "-" + j + "-" + k);
                    }
                }
            }
        }

    }

    public static void ej13() {
        /*
        Crear un programa que dibuje una escalera de números, donde cada línea 
        de números comience en uno y termine en el número de la línea. 
        Solicitar la altura de la escalera al usuario al comenzar. 
        Ejemplo: si se ingresa el número 3:
            1
            12
            123
         */
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero de la escalera: ");
        int num = leer.nextInt();
        int aux;

        for (int i = 1; i <= num; i++) {
            aux = 1;
            do {
                System.out.print(aux);
                aux += 1;
            } while (aux <= i);
            System.out.println("");
        }
    }
    
    
    

    public static int[][] llenarMatriz(int[][] matriz, int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

            }
        }

        return matriz;
    }



    public static void main44(String[] args) {
        // Definimos las matrices M y P
        int[][] M = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
            {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
            {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
            {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
            {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
            {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };
        
        int[][] P = {
            {23, 24, 25},
            {33, 34, 35},
            {43, 44, 45}
        };
        
        // Llamamos a la función que busca la submatriz
        boolean found = findSubMatrix(M, P);
        
        // Imprimimos el resultado
        if (found) {
            System.out.println("La submatriz P está contenida en la matriz M.");
        } else {
            System.out.println("La submatriz P no está contenida en la matriz M.");
        }
    }
    
    public static boolean findSubMatrix(int[][] M, int[][] P) {
        int mRows = M.length;
        int mCols = M[0].length;
        int pRows = P.length;
        int pCols = P[0].length;
        
        // Iteramos sobre las submatrices de M
        for (int i = 0; i <= mRows - pRows; i++) {
            for (int j = 0; j <= mCols - pCols; j++) {
                // Comprobamos si la submatriz actual coincide con P
                if (isSubMatrix(M, P, i, j)) {
                    System.out.println("La submatriz P comienza en la fila " + i + ", columna " + j + ".");
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static boolean isSubMatrix(int[][] M, int[][] P, int startRow, int startCol) {
        int pRows = P.length;
        int pCols = P[0].length;
        
        // Iteramos sobre los elementos de la submatriz
        for (int i = 0; i < pRows; i++) {
            for (int j = 0; j < pCols; j++) {
                // Comprobamos si los elementos coinciden
                if (M[startRow + i][startCol + j] != P[i][j]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}