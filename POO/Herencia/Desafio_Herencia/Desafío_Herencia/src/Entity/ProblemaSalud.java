/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/*
Clase Problema de salud (donde se debe guardar información si la persona tiene alguna enfermad. Los datos
para esta clase son los siguientes: N° de orden del integrante, IDE de familia, HTA (verdadero o falso, si tiene
hipertension), DBT (verdadero o falso si tiene diabetes)).
*/
public class ProblemaSalud {

    protected Integer numOrden;
    protected Integer ide;
    protected boolean tieneHTA;
    protected boolean tieneDBT;

    public ProblemaSalud() {
    }

    public ProblemaSalud(Integer numOrden, Integer ide, boolean tieneHTA, boolean tieneDBT) {

        this.numOrden = numOrden;
        this.ide = ide;
        this.tieneHTA = tieneHTA;
        this.tieneDBT = tieneDBT;
    }

    public Integer getNroOrden() {
        return numOrden;
    }

    public void setNroOrden(Integer numOrden) {
        this.numOrden = numOrden;
    }

    public Integer getIDE() {
        return ide;
    }

    public void setIDE(Integer ide) {
        this.ide = ide;
    }

    public boolean isHTA() {
        return tieneHTA;
    }

    public void setHTA(boolean tieneHTA) {
        this.tieneHTA = tieneHTA;
    }

    public boolean isDBT() {
        return tieneDBT;
    }

    public void setDBT(boolean tieneDBT) {
        this.tieneDBT = tieneDBT;
    }

    @Override
    public String toString() {
        return "ProblemaSalud{" + "numOrden=" + numOrden + ", IDE=" + ide + ", tieneHTA=" + tieneHTA + ", tieneDBT=" + tieneDBT + '}';
    }

}
