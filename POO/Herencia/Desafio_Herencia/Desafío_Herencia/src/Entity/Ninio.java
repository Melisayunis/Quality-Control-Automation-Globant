/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.time.LocalDate;

/*
El niño simplemente guardará la información básica de una persona. Se consideran niños hasta 14 años.
*/
public class Ninio extends Integrante {

    public Ninio(String nombre, String apellido, String sexo, String vinculo, 
            Integer dni, Integer numOrden, LocalDate fechaNacimiento, 
            ProblemaSalud problemaSalud, AbordajeNutricional abordajeNutricional) {
        
        super(nombre, apellido, sexo, vinculo, dni, numOrden, fechaNacimiento, problemaSalud, abordajeNutricional);
    }

    public Ninio() {
        
    }
    
    

    @Override
    public String toString() {
        return super.toString();
    }
}
