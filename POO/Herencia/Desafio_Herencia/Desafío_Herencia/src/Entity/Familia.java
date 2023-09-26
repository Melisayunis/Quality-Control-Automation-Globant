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

/*
Cada familia tiene los siguientes datos:
    Dirección
    IDE
    N° de lote
    Barrio
    Localidad
Cada familia, tiene al menos 1 integrante.
Cada familia tiene además, una relacion 1 a 1 con la clase InformacionVivienda
*/
public abstract class Familia implements FamiliaServiceInterface {

    protected String direccion;
    protected Integer ide;
    protected Integer numLote;
    protected String barrio;
    protected String localidad;

    protected ArrayList<Integrante> integrantes;
    protected InfoVivienda infoVivienda;
    
    FamiliaServiceInterface familiaServicio = new FamiliaServicio();

    public Familia() {
    }

    public Familia(String direccion, Integer ide, Integer numLote, String barrio, String localidad, ArrayList<Integrante> integrantes, InfoVivienda infoVivienda) {
        this.direccion = direccion;
        this.ide = ide;
        this.numLote = numLote;
        this.barrio = barrio;
        this.localidad = localidad;
        this.integrantes = integrantes;
        this.infoVivienda = infoVivienda;
    }
    
    @Override
    public Familia crearFamilia() {
                
        return familiaServicio.crearFamilia();
    }



    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getIde() {
        return ide;
    }

    public void setIde(Integer ide) {
        this.ide = ide;
    }

    public Integer getNumLote() {
        return numLote;
    }

    public void setNumLote(Integer numLote) {
        this.numLote = numLote;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public ArrayList<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    public InfoVivienda getInfoVivienda() {
        return infoVivienda;
    }

    public void setInfoVivienda(InfoVivienda infoVivienda) {
        this.infoVivienda = infoVivienda;
    }

    @Override
    public String toString() {
        return "Familia{" + "direccion=" + direccion + ", ide=" + ide + ", numLote=" + numLote + ", barrio=" + barrio + ", localidad=" + localidad + ", integrantes=" + integrantes + ", infoVivienda=" + infoVivienda + '}';
    }

    
}
