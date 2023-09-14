/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Crear una superclase llamada Edificio con los siguientes atributos: 
* ancho, alto y largo. 
* La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
 */
public abstract class Edificio {
    private final double ancho;
    private final double alto;
    private final double largo;
    
    public abstract double calcularSuperficie();
    
    public abstract double calcularVolumen();

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }

}
