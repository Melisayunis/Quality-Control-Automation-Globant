/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1herencia;

/**
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
public class Ej1Herencia {

    public static void main(String[] args) {
       
        Animal perro1 = new Perro("Negro", "Carnivoro", "12", "Oscurito");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("Bella", "Huesitos", "8", "Mestiza");
        perro2.Alimentarse();
        
        Animal gato = new Gato("Ninja", "Galletitas agua", "10", "Peludo");
        gato.Alimentarse();
        
        Animal caballo = new Caballo("Sobra Gris", "Pastito", "500", "Elfico");
        gato.Alimentarse();
        
    }
    
}
