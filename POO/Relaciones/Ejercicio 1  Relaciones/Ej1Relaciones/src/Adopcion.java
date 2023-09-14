
import Entidad.Perro;
import Entidad.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Perro: nombre, raza, edad y tamaño; 
Persona: nombre, apellido, edad, documento y Perro.
 * 
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class Adopcion {

    public static void main(String[] args) {
        
        Perro dog1 = new Perro("Bella", "Mestiza", 6, "Mediano");
        Perro dog2 = new Perro("Mora", "Mestiza", 12, "Chico");
        
        Persona person1 = new Persona("Melisa", "Yunis", 31, 36363363, dog1);
        Persona person2 = new Persona("Janet", "Brun", 31, 35353535, dog2);
        
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        
        
    }
    
}
