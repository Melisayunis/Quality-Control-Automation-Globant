/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;

/**
 *
 */
public class Pais {

    private String name;

    public Pais() {
    }

    public Pais(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Comparator<Pais> compararPaises
            = (Pais country1, Pais country2)
            -> (country1.getName().compareTo(country2.getName()));


     @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pais other = (Pais) obj;
        return name != null && name.equals(other.name);
    }

    // Implementación del método hashCode para calcular el hashcode del objeto Pais
    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
