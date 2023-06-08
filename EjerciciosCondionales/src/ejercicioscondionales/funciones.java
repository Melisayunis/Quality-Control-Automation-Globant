
package ejercicioscondionales;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
//import static java.lang.Math.random;

public class funciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero del ejercicio del 15 al 21 que desea ejecutar: ");
        System.out.println("");
        int num = leer.nextInt();
        
        switch (num){
            case 15:
                rellenarVectorAleatorio100();
                break;
            case 16:
                rellenarAleatorioYBuscar();
                break;
            case 17:
                contarDigitos();
                break;
            case 18:
                matrizTraspuesta();
                break;
            case 19:
                matrizAntiSimetrica();
                break;
            case 20:
                cuadradoMagico();
                break;
            case 21:
                
                break;
            default:
                System.out.println("La opcion ingresa es incorrecta.");
        }
    }
    
    public static void rellenarVectorAleatorio100(){
        /*
        Realizar un algoritmo que rellene un vector con los 100 primeros números
        enteros y los muestre por pantalla en orden descendente.
        */
        int[] vector = new int[100];
        
        for (int i = 0; i <= 100; i++) {
            vector[i] = i;
            System.out.println("[" + vector[i] + "] ");
        }
    }

    public static void rellenarAleatorioYBuscar(){
        /*
        Realizar un algoritmo que rellene un vector de tamaño N con valores 
        aleatorios y le pida al usuario un numero a buscar en el vector. 
        El programa mostrará donde se encuentra el numero y si se encuentra repetido
        */
        Scanner leer = new Scanner(System.in);
        int count = 0, rand = 0;
        
        System.out.println("Ingrese el tamaño del vector: ");
        int num = leer.nextInt();
        int[] vector = new int[num];
        
        for (int i = 0; i < num; i++) {
            rand = (int) (Math.random()*10);
            vector[i] = rand;
        }
        
        System.out.println("Ingrese un numero para buscar en el vector: ");
        int buscar = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            if (vector[i] == buscar){
                count += 1;
                System.out.println("El numero se encuentra en la posición: " + i);
            }
        }
        
        if (count != 0) {
            System.out.println("El numero se encontro repetido " + count + " veces.");
        } else {
            System.out.println("El numero no se encuentra en el vector :( ");
        }

    }

    public static void contarDigitos() {
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son 
        de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        int unid=0, dec=0, cent=0, cuat=0, quint=0;

        System.out.println("Ingrese el tamaño del ventor: ");
        int num = leer.nextInt();
        
        int[] vector = new int[num];
        
        for (int i = 0; i < num; i++) {
            int numeroAleatorio = rand.nextInt(90000)+1;
            vector[i] = numeroAleatorio;
            System.out.println("vector " + vector[i]);
        }
        for (int i = 0; i < num; i++) {
            if (vector[i]/1 < 10){
                unid += 1;
            } else if (vector[i]/10 < 10) {
                dec +=1;
            } else if (vector[i]/100 < 10) {
                cent += 1;
            } else if (vector[i]/1000 < 10) {
                cuat += 1;
            } else if (vector[i]/10000 < 10) {
                quint += 1;
            }
        }
        System.out.println("Hay " + unid + " numeros de 1 digito.");
        System.out.println("Hay " + dec + " numeros de 2 digitos.");
        System.out.println("Hay " + cent + " numeros de 3 digitos.");
        System.out.println("Hay " + cuat + " numeros de 4 digitos.");
        System.out.println("Hay " + quint + " numeros de 5 digitos.");
    }

    public static void matrizTraspuesta () {
        /*
        Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
        y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
        se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
        */
        int[][] matriz = new int[4][4];
        
        System.out.println("Matriz original: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random()*10);
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz traspuesta: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                System.out.print("[" + matriz[j][i] + "] ");
            }
            System.out.println("");
        } 
    }

    public static void matrizAntiSimetrica() {
        /*
        Realice un programa que compruebe si una matriz dada es anti simétrica. 
       
        Se dice que una matriz A es anti simétrica cuando ésta es igual a su 
        propia traspuesta, pero cambiada de signo. Es decir, A es anti simétrica 
        si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
        obtiene cambiando sus filas por columnas (o viceversa).
        */
        
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matrizAS = new int[3][3];
        boolean es = true;
        
        // Ingreso valores random a la matriz.
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                matrizAS[j][i] = matriz[i][j];
            }
        }*/
        
        // Ingreso valor por pantalla a la matriz.
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor para la posición: [" + i + "," + j + "]");
                matriz[i][j] = leer.nextInt();
                matrizAS[j][i] = matriz[i][j];
            }
        }
       
       // Comprobamos si A = -AT . Siendo AT la matriz transpuesta de A.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (matriz[i][j] == - matrizAS[i][j]) {
                    es = es && true;
                } else {
                    es = false;
                }
            }
        }
        System.out.println("La matriz es: ");
        mostrarMatriz(matriz, 3, 3);
        System.out.println("Su matriz transpuesta es: ");
        mostrarMatriz(matrizAS, 3, 3);
        System.out.println("Es una matriz anti simetrica? " + es);
        
    }
    
    public static void mostrarMatriz(int[][] matriz, int n, int m){
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        } 
    }
    
    public static void cuadradoMagico(){
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números 
        del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
        
        Crear un programa que permita introducir un cuadrado por teclado y determine 
        si este cuadrado es mágico o no. El programa deberá comprobar que los números 
        introducidos son correctos, es decir, están entre el 1 y el 9.
        */
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num;
        boolean ingresoCorrecto = true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese el valor para la posición: [" + i + "," + j + "]");
                    num = leer.nextInt();
                    
                    if (num > 0 && num < 10) {
                        matriz[i][j] = num;
                        ingresoCorrecto = true;
                    } else {
                        // si el numero no esta en el rango se indica y se entra en el ciclo para pedir otro
                        System.out.println("El numero ingresado esta fuera del rango permitido.");
                        ingresoCorrecto = false;
                    }
                } while (ingresoCorrecto == false);
            }
        }
        
        // Se corrobora si el cuadrado es magico o no.
        // La suma de sus filas, sus columnas y sus diagonales son idénticas.
        int fila, colum, diag = 0, diagInv = 0;
        boolean esMagico = false;
        int count = 0; // como contador en el ciclo
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                // Se suman los valores de la diagonal principal
                if (i == j) {
                    diag += matriz[i][j];
                }  
            }
            // Se suman los valores de la diagonal invertida.
            diagInv += matriz[i][2-i];
        }

        if (diagInv == diag) {
            esMagico = true;
        }
        
        do {
            fila = 0;
            colum = 0;
            for (int i = 0; i < 3; i++) {
                fila += matriz[count][i];
                colum += matriz[i][count];
            }

            if (fila != diag || colum != diag) {
                esMagico = false;
            }
            count += 1;
        } while (count < 2 && esMagico == true);
        
        mostrarMatriz(matriz, 3, 3);        
        System.out.println("¿El cuadrado es magico? " + esMagico);
    }
    
    public static void ej21() {
        /*
        Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y 
        la matriz P de 3x3, se solicita escribir un programa en el cual se compruebe 
        si la matriz P está contenida dentro de la matriz M. 
        
        Para ello se debe 
        verificar si entre todas las submatrices de 3x3 que se pueden formar en la 
        matriz M, desplazándose por filas o columnas, existe al menos una que 
        coincida con la matriz P. 
        
        En ese caso, el programa debe indicar la fila 
        y la columna de la matriz M en la cual empieza el primer elemento de la 
        submatriz P.        
        */
        int[][] matriz = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10}, {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
        {56, 78, 87, 90, 9, 90, 17, 12, 87, 67}, {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
        {32, 76, 79, 1, 36, 5, 67, 96, 12, 11}, {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
        {67, 78, 87, 45, 14, 22, 26, 42, 56, 78}, {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
        {24, 67, 97, 46, 87, 13, 67, 89, 93, 24}, {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        int[][] mini = {{36,5,67},{89,90,75},{14,22,26}};
        
        String posicion = ""; // voy a guardar la primer posición donde empieza la matriz pequeña
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (matriz[i][j] == mini[i][j]) {
                    // seguir buscando matriz
                } else {
                    
                }
                
                
                
                
            }
        }
        
        
        int count = 0; // va a ser el j
        boolean es = true;
        for (int i = 0; i < 10; i++) {
            
            do {
                
                
            } while (count < 3 && es == true);
            
            
            
            
        }
        
        
    }
    
    
    
}
