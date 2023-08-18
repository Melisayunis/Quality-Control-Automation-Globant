/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud.
 */
public class Cadena {
    private String frase;
    private int lenght;

    public Cadena() {
    }

    public Cadena(String frase, int lenght) {
        this.frase = frase;
        this.lenght = lenght;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", lenght=" + lenght + '}';
    }
    
    
}
