/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;


/**
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
public class Ejercicio2 {

    int[] arreglo = new int[3];
    String[] arregloString = new String[5];
    Boolean[] arregloBool = new Boolean[8];

    public Ejercicio2() {
    }
    
    public void capturandoExcepcionesArreglos() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("La i es: " + i);
                arreglo[i] = i;
                arregloString[i] = ":D ";
                arregloBool[i] = (i/2 == 0);
            }
    
        } catch (ArrayIndexOutOfBoundsException e) {
            /*
            -- Mensajes que aparecen con el codigo anterior.
            En la 'e' se almacena el indice fuera de rango en donde se produce la excepcion.
            
            Exception: java.lang.ArrayIndexOutOfBoundsException: 3
            Exception message: 3
            Exception localized message: 3
            Exception to string: java.lang.ArrayIndexOutOfBoundsException: 3
            */
            
            System.out.println("Exception: " + e);
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Exception localized message: " + e.getLocalizedMessage());
            System.out.println("Exception to string: " + e.toString());
        }
    }
    
}
