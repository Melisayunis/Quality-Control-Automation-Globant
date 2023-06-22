/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**

 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        /**
        Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
        al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
        Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
        O. Si no es correcto se deberá mostrar un mensaje
        */
        System.out.println("Ingrese nombre:");
        String name = leer.next();
        
        System.out.println("Ingrese el sexo (M mujer, V varon, O otro)");
        String sex = leer.next();
        if (sex.equals('H') || sex.equals('M') || sex.equals('O')){
            System.out.println("La opcion ingresada es erronea.");
        }
        
        System.out.println("Ingrese la edad:");
        int age = leer.nextInt();
        
        System.out.println("Ingrese el peso: ");
        float weight = leer.nextFloat();
        
        System.out.println("Ingrese la altura: ");
        float height = leer.nextFloat();
        
        Persona person = new Persona();
        
        person.setNombre(name);
        person.setSexo(sex);
        person.setEdad(age);
        person.setPeso(weight);
        person.setAltura(height);
        
        return person;        
    }
    
    public int calcularIMC(Persona person) {
        /*
        Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
        kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
        significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
        Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
        persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
        de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
        función devuelve un 1.
        */
        int ideal = 0;
        
        float calc = person.getPeso() / (float)(Math.pow(person.getAltura(),2));
        
        if (calc < 20) {
            //System.out.println("Esta por debajo del peso ideal.");
            ideal = -1;
        } else if (calc >= 20 && calc <= 25) {
           // System.out.println("Esta en su peso ideal.");
            ideal = 0;
        } else if (calc > 25) {
           // System.out.println("Tiene sobrepeso");
            ideal = 1;
        }
        return ideal;
    }
    
    public boolean mayorEdad(Persona person) {
        /*
        Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
        devuelve un booleano.
        */
        boolean esMayor = false;
        if (person.getEdad() >= 18) {
            esMayor = true;
        }
        return esMayor;
    }
    
}
