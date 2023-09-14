/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

/**
Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.
 */
public class Residencia extends ExtraHotelero {
    protected Integer cantHabitaciones;
    protected Boolean hayDescuentoGremio;
    protected Boolean hayCampoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantHabitaciones, Boolean hayDescuentoGremio, Boolean hayCampoDeportivo, Boolean esPrivado, Integer mtCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(esPrivado, mtCuadrados, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.hayDescuentoGremio = hayDescuentoGremio;
        this.hayCampoDeportivo = hayCampoDeportivo;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Boolean getHayDescuentoGremio() {
        return hayDescuentoGremio;
    }

    public void setHayDescuentoGremio(Boolean hayDescuentoGremio) {
        this.hayDescuentoGremio = hayDescuentoGremio;
    }

    public Boolean getHayCampoDeportivo() {
        return hayCampoDeportivo;
    }

    public void setHayCampoDeportivo(Boolean hayCampoDeportivo) {
        this.hayCampoDeportivo = hayCampoDeportivo;
    }
    
}
