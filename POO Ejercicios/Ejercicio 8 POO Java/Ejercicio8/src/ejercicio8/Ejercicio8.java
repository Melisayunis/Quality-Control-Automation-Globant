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
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo
 * de String) y su longitud.  *
 * En el main se creará el objeto y se le pedirá al usuario que ingrese una
 * frase que puede ser una palabra o varias palabras separadas por un espacio en
 * blanco y a través de los métodos set, se guardará la frase y la longitud de
 * manera automática según la longitud de la frase ingresada. Deberá además
 * implementar los siguientes métodos: a) Método mostrarVocales(), b) Método
 * invertirFrase(), c) Método vecesRepetido(String letra), e) Método
 * compararLongitud(String frase), f) Método unirFrases(String frase), g) Método
 * reemplazar(String letra), h) Método contiene(String letra),
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioCadena serviceChain = new ServicioCadena();
        // no creo el objeto con el servicio, lo creo con el constructor vacio, para poder setearlo como pide el ejercicio
        Cadena chain = new Cadena();

        System.out.println("Ingrese una palabra o frase: ");
        String word = leer.nextLine();

        chain.setFrase(word);
        chain.setLenght(word.length());

        boolean exit = true;
        int opc;

        do {
            System.out.println("");
            System.out.println("Ingrese la opcion que desea realizar: ");
            System.out.println("    -> 1: Mostrar las vocales.");
            System.out.println("    -> 2: Invertir frase.");
            System.out.println("    -> 3: Mostrar la cantidad de veces que se repite la letra: ");
            System.out.println("    -> 4: Comparar la longitud de la frase, con la siguiente longitud: ");
            System.out.println("    -> 5: Unir la frase original, con la siguiente a ingresar: ");
            System.out.println("    -> 6: Reemplazar la letra A, por la siguiente: ");
            System.out.println("    -> 7: Verificar si la frase contiene la siguiente letra ingresada: ");
            System.out.println("    -> 8: Salir.");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("La frase ingresda tiene " + serviceChain.mostrarVocales(chain) + " vocales.");
                    break;
                case 2:
                    serviceChain.invertirFrase(chain);
                    break;
                case 3:
                    serviceChain.vecesRepetido(chain);
                    break;
                case 4:
                    serviceChain.compararLongitud(chain);
                    break;
                case 5:
                    serviceChain.unirFrases(chain);
                    break;
                case 6:
                    serviceChain.reemplazar(chain);
                    break;
                case 7:
                    serviceChain.contiene(chain);
                    break;
                case 8:
                    exit = false;
                    System.out.println("Hasta luego!!");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta, intente nuevamente.");
                    break;
            }
        } while (exit == true);
    }
}
