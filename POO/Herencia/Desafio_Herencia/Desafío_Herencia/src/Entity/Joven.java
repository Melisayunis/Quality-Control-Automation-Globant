/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.time.LocalDate;

/*
El joven, debe guardar información básica de una persona y además de lo que estudia, si practica deporte, y si es
que tiene algun tipo de trabajo. Se consideran estudiantes de 15 años en adelante hasta los 18.
*/
public class Joven extends Integrante {
    
    protected String queEstudia;
    protected boolean practicaDeporte;
    protected boolean tieneTrabajo;

    public Joven() {
    }

    public Joven(String queEstudia, boolean practicaDeporte, boolean tieneTrabajo, String nombre, 
            String apellido, String sexo, String vinculo, Integer dni, Integer numOrden, 
            LocalDate fechaNacimiento, ProblemaSalud problemaSalud, AbordajeNutricional abordajeNutricional) {
        
        super(nombre, apellido, sexo, vinculo, dni, numOrden, fechaNacimiento, problemaSalud, abordajeNutricional);
        this.queEstudia = queEstudia;
        this.practicaDeporte = practicaDeporte;
        this.tieneTrabajo = tieneTrabajo;
    }

    public String getEstudio() {
        return queEstudia;
    }

    public void setEstudio(String queEstudia) {
        this.queEstudia = queEstudia;
    }

    public boolean isDeporte() {
        return practicaDeporte;
    }

    public void setDeporte(boolean practicaDeporte) {
        this.practicaDeporte = practicaDeporte;
    }

    public boolean isTrabajo() {
        return tieneTrabajo;
    }

    public void setTrabajo(boolean tieneTrabajo) {
        this.tieneTrabajo = tieneTrabajo;
    }

    @Override
    public String toString() {
        return  "Joven{" + super.toString() + "estudio=" + queEstudia + ", deporte=" + practicaDeporte + ", trabajo=" + tieneTrabajo + '}';
    }
    
}
