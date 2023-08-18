/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
* perimetro = lado + lado + lado + lado
* area = (diagMenor * diagMayor ) / 2
 */
public class Rombo {
    private float diagMenor;
    private float diagMayor;
    private float lado;
    // cuantos lados????

    public Rombo() {
    }

    public float getDiagMenor() {
        return diagMenor;
    }

    public void setDiagMenor(float diagMenor) {
        this.diagMenor = diagMenor;
    }

    public float getDiagMayor() {
        return diagMayor;
    }

    public void setDiagMayor(float diagMayor) {
        this.diagMayor = diagMayor;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    
    
}
