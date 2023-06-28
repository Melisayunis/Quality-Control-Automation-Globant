/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import Entidad.Cadena;
import Servicio.ServicioCadena;
import java.util.Scanner;

/**
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. 

* En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioCadena serviceChain = new ServicioCadena();
        Cadena chain = serviceChain.crearCadena();
        
        
        
    }
    
}
