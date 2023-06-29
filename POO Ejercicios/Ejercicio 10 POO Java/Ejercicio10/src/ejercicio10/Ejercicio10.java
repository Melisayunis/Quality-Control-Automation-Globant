/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Arrays;

/**
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. 

* El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.

* Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. 

* Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        
        double A[] = new double[50];
        double B[] = new double[20];
        
        // Arrays.fill(arreglo, variable)
        // random()
        // round(double a)
        
        for (int i = 0; i < 50; i++) {
            A[i] = Math.round(Math.random()*10);
        }
        
        // Mostrar el arregle con: Arrays.toString(arreglo)
        System.out.println("Arreglo A original: ");
        System.out.println(" " + Arrays.toString(A));
        
        // Ordenar de menor a mayor Arrays.sort(arreglo)
        Arrays.sort(A);
        
        /* copiar los primeros 10 números ordenados al arreglo B de 20 elementos,
        y rellenar los 10 últimos elementos con el valor 0.5
         */

        System.arraycopy(A, 0, B, 0, 10);
        // Arrays.fill(arreglo, int desde, int hasta, variable)
        Arrays.fill(B, 10, 20, 0.5);
        
        System.out.println("Arreglo A ordenado: ");
        System.out.println(" " + Arrays.toString(A));

        System.out.println("Arreglo B: ");
        System.out.println(" " + Arrays.toString(B));
    }
    
}
