/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;
import java.lang.String;

/**
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
         Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
public class ServicioCadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena() {
        System.out.println("Ingrese una frase: ");
        String frase = leer.next();
        
        Cadena chain = new Cadena(frase, frase.length());
        return chain;
    }
    
    public int mostrarVocales(Cadena chain){
        /*
        a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
            frase ingresada.
        */
        int cant = 0;
        char letter;
        // Agarro la frase de la clase, la paso a minusculas y la guardo, para
        //no repetir este proceso en cada paso del ciclo
        String minuscula = (chain.getFrase().toLowerCase());
        
        for (int i = 0; i < chain.getLenght(); i++) {
            // tomo el elemento de la posicion i de la cadena y comparo a ver si es o no una vocal
            letter = minuscula.charAt(i);
            
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                cant += 1;
            }
        }
        
        return cant;
    }
    
    public void invertirFrase(Cadena chain) {
        /*
        b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
            ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
        */
        String reverse = "";
        
        for (int i = chain.getLenght()-1; i == 0; i--){
            reverse = reverse.concat(chain.getFrase().substring(i, i));
        }
        System.out.println("La frase es: ");
        System.out.println("    -> " + chain.getFrase());
        System.out.println("La frase invertida es: ");
        System.out.println("    -> " + reverse);
    }
    
    public void vecesRepetido(Cadena chain) {
        /*
        c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
           contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
                Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
        */
        System.out.println("Ingrese un caracter para contabilizr su repeticion: ");
        char letra = leer.next().charAt(0);
        int repeat = 0;
        
        for (int i = 0; i < chain.getLenght(); i++) {
            if (chain.getFrase().charAt(i) == letra) {
                repeat += 1;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + repeat + " veces.");
    }
    
    public boolean compararLongitud(Cadena chain){
        /*
        e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
            compone la clase con otra nueva frase ingresada por el usuario.
        */
        boolean equal = false;
        System.out.println("Ingrese una frase para comparar la longitud: ");
        String frase = leer.next();
        
        if (chain.getLenght() == frase.length()) {
            equal = true;
        }
        
        return equal;
    }
    
    public void unirFrases(Cadena chain) {
        /*
        f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
            con una nueva frase ingresada por el usuario y mostrar la frase resultante.
        */
        System.out.println("Ingrese una frase nueva: ");
        String frase = leer.next();

        System.out.println("    -> Las frases unidas son: " + chain.getFrase().concat(frase));  
    }
    
    public String reemplazar(Cadena chain) {
        /*
        g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
            encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
            la frase resultante.
        */
        // usar:   replace(char oldChar, char newChar)
        
        System.out.println("Ingrese la letra que desea que sea reemplazada por 'a': ");
        char letra = leer.next().charAt(0);
        
        String newChain = chain.getFrase().replace(letra, 'a');
        
        return newChain;
    }
    
    public boolean contiene(Cadena chain) {
        /*
        h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
            ingresa el usuario y devuelve verdadero si la contiene y falso si no.
        */
         boolean isHere = false;
        
        System.out.println("Ingrese una letra, para verificar si se encuentra en la frase: ");
        char letra = leer.next().charAt(0);
        
        // --------------------------------------
            // se peude hacer solamente con la funcion ya predeterminada de string??
            // contains(CharSequence s)
            // isHere = chain.getFrase().contains(letra);
        // --------------------------------------
       
        
        for (int i = 0; i < chain.getLenght(); i++) {
            if (chain.getFrase().charAt(i) == letra) {
                isHere = true;
                break;
            }
        }
        
        return isHere;
    }
    
    
    
}
