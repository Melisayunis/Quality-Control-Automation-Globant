/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.time.LocalDate;

/*
El AdultoMayor debe guardar info básica de una persona. y si es que tiene la jubilación.
*/
public class AdultoMayor extends Integrante{
    
    protected boolean estaJubilado;

    public AdultoMayor() {
    }

    public AdultoMayor(boolean estaJubilado, String nombre, String apellido,
             String sexo, String vinculo, Integer dni, Integer numOrden, 
             LocalDate fechaNacimiento, ProblemaSalud problemaSalud, AbordajeNutricional abordajeNutricional) {
        
        super(nombre, apellido, sexo, vinculo, dni, numOrden, fechaNacimiento, problemaSalud, abordajeNutricional);
        
        this.estaJubilado = estaJubilado;
    }

    public boolean isJubilacion() {
        return estaJubilado;
    }

    public void setJubilacion(boolean estaJubilado) {
        this.estaJubilado = estaJubilado;
    }

    @Override
    public String toString() {
        
        return "AdultoMayor{" + super.toString() + "jubilacion=" + estaJubilado + '}';
    }
    
}
