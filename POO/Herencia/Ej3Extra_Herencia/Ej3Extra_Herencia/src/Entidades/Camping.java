/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

/**
Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
public class Camping extends ExtraHotelero {
    protected Integer capacidadMaxCarpas;
    protected Integer cantBaños;
    protected Boolean hayRestaurant;

    public Camping() {
    }

    public Camping(Integer capacidadMaxCarpas, Integer cantBaños, Boolean hayRestaurant, Boolean esPrivado, Integer mtCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, mtCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBaños = cantBaños;
        this.hayRestaurant = hayRestaurant;
    }

    public Integer getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(Integer capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public Integer getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(Integer cantBaños) {
        this.cantBaños = cantBaños;
    }

    public Boolean getHayRestaurant() {
        return hayRestaurant;
    }

    public void setHayRestaurant(Boolean hayRestaurant) {
        this.hayRestaurant = hayRestaurant;
    }
    
}
