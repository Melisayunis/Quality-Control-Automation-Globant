/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
Métodos getters y setters.
 */
public class Cafetera {
    
    private int capacidadMax;
    private int cantidadActual;
    
    public Cafetera() {
        
    }
    
    public Cafetera(int capacidadMax, int cantidadActual) {
        this.cantidadActual = cantidadActual;
        this.capacidadMax = capacidadMax;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMax=" + capacidadMax + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
}
