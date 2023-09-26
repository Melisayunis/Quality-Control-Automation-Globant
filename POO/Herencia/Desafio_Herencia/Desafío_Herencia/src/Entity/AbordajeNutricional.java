/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/*
Clase Abordaje Nutricional (donde se registra la informacion si la persona tiene algun tratamiento por algun
problema de salud relacionado con la nutricion. Los datos que debe guardar esta clase son: N° de orden del
integrante familiar, edad, peso, Eutrofico (verdadero o falso de si tiene un peso normal), BajoPeso (verdadero o
falso si tiene menor peso al debido), SobrePeso (verdadero o falso de si tiene un peso por encima),
*/
public class AbordajeNutricional {

    protected Integer numOrden;
    protected Integer edad;
    protected Integer peso;
    protected boolean esEutrofico;
    protected boolean tieneBajoPeso;
    protected boolean tieneSobrePeso;

    public AbordajeNutricional() {
    }

    public AbordajeNutricional(Integer numOrden, Integer edad, Integer peso,
            boolean esEutrofico, boolean tieneBajoPeso, boolean tieneSobrePeso) {

        this.numOrden = numOrden;
        this.edad = edad;
        this.peso = peso;
        this.esEutrofico = esEutrofico;
        this.tieneBajoPeso = tieneBajoPeso;
        this.tieneSobrePeso = tieneSobrePeso;
    }

    public Integer getNroOrden() {
        return numOrden;
    }

    public void setNroOrden(Integer numOrden) {
        this.numOrden = numOrden;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public boolean isEutrofico() {
        return esEutrofico;
    }

    public void setEutrofico(boolean esEutrofico) {
        this.esEutrofico = esEutrofico;
    }

    public boolean isBajoPeso() {
        return tieneBajoPeso;
    }

    public void setBajoPeso(boolean tieneBajoPeso) {
        this.tieneBajoPeso = tieneBajoPeso;
    }

    public boolean isSobrePeso() {
        return tieneSobrePeso;
    }

    public void setSobrePeso(boolean tieneSobrePeso) {
        this.tieneSobrePeso = tieneSobrePeso;
    }

    @Override
    public String toString() {
        return "AbordajeNutricional{" + "numOrden=" + numOrden + ", edad=" + edad + ", peso=" + peso + ", esEutrofico=" + esEutrofico + ", tieneBajoPeso=" + tieneBajoPeso + ", tieneSobrePeso=" + tieneSobrePeso + '}';
    }

}
