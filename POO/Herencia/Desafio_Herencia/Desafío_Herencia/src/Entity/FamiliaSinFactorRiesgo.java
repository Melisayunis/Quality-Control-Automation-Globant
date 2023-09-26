/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

import Service.FamiliaServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
Si una familia NO tiene factores de riesgo, se debe agregar lo siguiente;
    Mejora (es un boolean que debe guardar si la familia contiene o no contiene alguna mejora en su hogar.)
 */
public class FamiliaSinFactorRiesgo extends Familia {
   
    protected boolean tieneMejoraVivienda;
    FamiliaServicio familiaServicio = new FamiliaServicio();

    public FamiliaSinFactorRiesgo() {
    }

    public FamiliaSinFactorRiesgo(boolean tieneMejoraVivienda, String direccion, Integer ide, Integer numLote, String barrio, String localidad, ArrayList<Integrante> integrantes, InfoVivienda infoVivienda) {
        super(direccion, ide, numLote, barrio, localidad, integrantes, infoVivienda);
        this.tieneMejoraVivienda = tieneMejoraVivienda;
    }
    
    public Familia crearFamiliaSinFactRiesgo() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        FamiliaSinFactorRiesgo familia = (FamiliaSinFactorRiesgo) super.crearFamilia();

        System.out.println(" --> Tiene alguna mejora e su hogar? \n 1: Si - 2: No ");
        int hayMejoraHogar = read.nextInt();
        
        if (hayMejoraHogar == 1) {
            familia.setTieneMejoraVivienda(true);
        } else {
            familia.setTieneMejoraVivienda(false);
        }
        
        return familia;
    }

    public boolean isTieneMejoraVivienda() {
        return tieneMejoraVivienda;
    }

    public void setTieneMejoraVivienda(boolean tieneMejoraVivienda) {
        this.tieneMejoraVivienda = tieneMejoraVivienda;
    }

    @Override
    public String toString() {
        return "FamiliaSinFactorRiesgo{" + "tieneMejoraVivienda=" + tieneMejoraVivienda + super.toString() + '}';
    }

    @Override
    public void mostrarFamilia(Familia familia) {
        
        familiaServicio.mostrarFamilia(familia);
        System.out.println(" -> El hogar posee mejoras: " + this.tieneMejoraVivienda);
    }

    @Override
    public void eliminarFamilia(Familia familia) {
    
        
    }

    @Override
    public Familia modificarFamilia(Familia familia) {
        
        
        return null;
    }
    
    
}
