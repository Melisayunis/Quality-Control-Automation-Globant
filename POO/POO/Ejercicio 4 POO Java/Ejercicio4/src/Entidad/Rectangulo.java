/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
 */
public class Rectangulo {
    
    private float base;
    private float altura;
    
    public Rectangulo() {
    }
    
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
