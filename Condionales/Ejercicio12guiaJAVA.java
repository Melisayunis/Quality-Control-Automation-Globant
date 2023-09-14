/*
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicio12guiajava;
import java.util.Scanner;
public class Ejercicio12guiaJAVA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Boolean salir;
        String cadena;
        char principio, fin;
        principio = 'x';
        fin = 'o';
        int LargoCadena, correctas, incorrectas;
        correctas = 0;
        incorrectas = 0;
        salir = false;
        while (!salir) {
            System.out.println("Ingrese una palabra");
            cadena = leer.nextLine();
            System.out.println("cadena: " + cadena);
            LargoCadena = cadena.length();
            System.out.println("LargoCadena: " + LargoCadena);
            salir = cadena.equals("&&&&&");
            System.out.println("salir: " + salir);
            if (salir) {
                break;
            }
            if (LargoCadena == 5){  
                if (cadena.charAt(0) == principio){
                    if (cadena.charAt(LargoCadena - 1) == fin) {
                    correctas = correctas + 1; 
                    } else {
                        incorrectas = incorrectas + 1;
                    }
                } else {
                        incorrectas++;
                        }
            } else {
                incorrectas++;
            }
        }
        
        System.out.println("La cantidad de palabras correctas es " + correctas);
        System.out.println("y la cantidad de incorrectas es " + incorrectas);
    }
    
}
