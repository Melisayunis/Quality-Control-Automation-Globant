/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.time.LocalDate;

/*
El Adulto debe guardar información básica de una persona y además acerca de si estudia o no, si realiza deporte,
si es que tiene algun empleo formal, y de si tiene obra social.
*/
public class Adulto extends Integrante{
    
    protected boolean estaEstudiando;
    protected boolean tieneTrabajoFormal;
    protected boolean tieneObraSocial;
    protected boolean practicaDeporte;

    public Adulto() {
    }

    public Adulto(boolean estaEstudiando, boolean tieneTrabajoFormal, 
            boolean tieneObraSocial, boolean practicaDeporte, String nombre, 
            String apellido, String sexo, String vinculo, Integer dni, Integer numOrden, 
            LocalDate fechaNacimiento, ProblemaSalud problemaSalud, AbordajeNutricional abordajeNutricional) {
        
        super(nombre, apellido, sexo, vinculo, dni, numOrden, fechaNacimiento, problemaSalud, abordajeNutricional);
        this.estaEstudiando = estaEstudiando;
        this.tieneTrabajoFormal = tieneTrabajoFormal;
        this.tieneObraSocial = tieneObraSocial;
        this.practicaDeporte = practicaDeporte;
    }

    public boolean isEstudio() {
        return estaEstudiando;
    }

    public void setEstudio(boolean estaEstudiando) {
        this.estaEstudiando = estaEstudiando;
    }

    public boolean isTrabForm() {
        return tieneTrabajoFormal;
    }

    public void setTrabForm(boolean tieneTrabajoFormal) {
        this.tieneTrabajoFormal = tieneTrabajoFormal;
    }

    public boolean isObraSocial() {
        return tieneObraSocial;
    }

    public void setObraSocial(boolean tieneObraSocial) {
        this.tieneObraSocial = tieneObraSocial;
    }

    public boolean isDeporte() {
        return practicaDeporte;
    }

    public void setDeporte(boolean practicaDeporte) {
        this.practicaDeporte = practicaDeporte;
    }

    @Override
    public String toString() {
        return "Adulto{" + super.toString() + "estaEstudiando=" + estaEstudiando + ", tieneTrabajoFormal=" + tieneTrabajoFormal + ", tieneObraSocial=" + tieneObraSocial + ", practicaDeporte=" + practicaDeporte + '}';
    }
    
}
