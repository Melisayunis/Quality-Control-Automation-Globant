/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
* perimetro = 5 * lado
* area = (perimetro * apotema) / 2
 */
public class Pentagono {
    private float lado;
    private float apotema;

    public Pentagono() {
    }

    public Pentagono(float lado, float apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }

    @Override
    public String toString() {
        return "Pentagono{" + "lado=" + lado + ", apotema=" + apotema + '}';
    }
    
}
