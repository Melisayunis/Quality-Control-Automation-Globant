/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición
 * actual (posición del tambor que se dispara, puede que esté el agua o no) y
 * posición agua (la posición del tambor donde se encuentra el agua). Estas dos
 * posiciones, se generarán aleatoriamente. Métodos: • llenarRevolver(): le pone
 * los valores de posición actual y de posición del agua. Los valores deben ser
 * aleatorios. • mojar(): devuelve true si la posición del agua coincide con la
 * posición actual • siguienteChorro(): cambia a la siguiente posición del
 * tambor • toString(): muestra información del revolver (posición actual y
 * donde está el agua)
 */
public class WaterStirrer {

    private int actualPosition;
    private int waterPosition;

    public WaterStirrer() {
    }

    public WaterStirrer(int actualPosition, int waterPosition) {
        this.actualPosition = actualPosition;
        this.waterPosition = waterPosition;
    }

    public int getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(int actualPosition) {
        this.actualPosition = actualPosition;
    }

    public int getWaterPosition() {
        return waterPosition;
    }

    public void setWaterPosition(int waterPosition) {
        this.waterPosition = waterPosition;
    }

    // Metodos:
    public WaterStirrer llenarRevolver() {
        int posicionActual = (int) (Math.random() * 6) + 1;
        int posicionAgua = (int) (Math.random() * 6) + 1;

        WaterStirrer pistola = new WaterStirrer(posicionActual, posicionAgua);
        
        return pistola;
    }

    public boolean mojar(WaterStirrer pistola) {
        return (pistola.getActualPosition() == pistola.getWaterPosition());
    }

    public void siguienteChorro(WaterStirrer pistola) {
        pistola.setActualPosition(pistola.getActualPosition() + 1);
    }

    public void showStrirrer() {
        System.out.println("    * Posición actual: " + this.actualPosition + " *");
        System.out.println("    * Posición agua: " + this.waterPosition + " *");
    }

}
