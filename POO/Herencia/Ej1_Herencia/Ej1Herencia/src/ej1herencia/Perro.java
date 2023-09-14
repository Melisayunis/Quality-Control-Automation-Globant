/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1herencia;

public class Perro extends Animal {

    Perro(String nombre, String alimento, String edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    @Override
    public void Alimentarse() {
        
        System.out.println(" Información del Perro: "
        + "\n * Nombre: " + nombre
        + "\n * Alimento: " + alimento
        + "\n * Edad: " + edad
        + "\n * Raza: " + raza);
    }
}
