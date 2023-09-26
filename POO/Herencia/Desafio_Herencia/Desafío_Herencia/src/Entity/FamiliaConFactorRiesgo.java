/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Service.FamiliaServiceInterface;
import Service.FamiliaServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Cada familia se divide en dos tipos, familias con factores de riesgo y
 * familias sin factores de riesgo. Si una familia tiene factores de riesgo, se
 * debe agregar la siguiente información: Factores (Se puede seleccionar de 1 a
 * 13 factores de riesgo) (el factor es una lista numérica. Puede ser cualquier
 * numero del 1 al 13, varios números del 1 al 13, como por ejemplo 2 y 5)
 *
 * Mediante una función mostrar cual es la cantidad de factores que tiene la
 * familia.
 */
public class FamiliaConFactorRiesgo extends Familia {

    protected ArrayList<Integer> factoresRiesgo = new ArrayList<>();
    private FamiliaServiceInterface familiaServicio = new FamiliaServicio();

    public FamiliaConFactorRiesgo() {
    }

    public FamiliaConFactorRiesgo(ArrayList<Integer> factoresRiesgo, String direccion, Integer ide, Integer numLote, String barrio, String localidad, ArrayList<Integrante> integrantes, InfoVivienda infoVivienda) {
        super(direccion, ide, numLote, barrio, localidad, integrantes, infoVivienda);
        this.factoresRiesgo = factoresRiesgo;
    }

    @Override
    public Familia crearFamilia() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        FamiliaConFactorRiesgo familia = (FamiliaConFactorRiesgo) super.crearFamilia();

        System.out.println(" --> Ingrese la cantidad de factores de riesgo: ");
        int cantFactoresRiesgo = read.nextInt();

        for (int i = 1; i <= cantFactoresRiesgo; i++) {
            System.out.println(" --> Ingrese el numero del " + i + "° factor");
            agregarFactor(read.nextInt());
        }
        
        familia.setFactoresRiesgo(factoresRiesgo);
        
        return familia;
    }

    public void agregarFactor(Integer factor) {
        factoresRiesgo.add(factor);
    }

    public void mostrarTodosFactores() {

        System.out.println(" Los factores de riesgo que posee la familia son: ");
        for (Integer factor : factoresRiesgo) {
            System.out.println(" factor, ");
        }
    }

    public int cantidadFactores() {
        int cantidadFactores = 0;

        for (Integer factor : factoresRiesgo) {
            cantidadFactores += 1;
        }

        return cantidadFactores;
    }

    public ArrayList<Integer> getFactoresRiesgo() {
        return factoresRiesgo;
    }

    public void setFactoresRiesgo(ArrayList<Integer> factoresRiesgo) {
        this.factoresRiesgo = factoresRiesgo;
    }

    @Override
    public String toString() {
        return "FamiliaConFactorRiesgo{" + "factoresRiesgo=" + factoresRiesgo + super.toString() + '}';
    }

    @Override
    public void mostrarFamilia(Familia familia) {
        familiaServicio.mostrarFamilia(familia);
        mostrarTodosFactores();
    }

    @Override
    public void eliminarFamilia(Familia familia) {
    
        
        
    }

    @Override
    public Familia modificarFamilia(Familia familia) {
    
        
        return null;
    }

}
