/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

/**
* • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
* 
* Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
 */
public class Hotel5Estrellas extends Hotel4Estrellas {
    protected Integer cantSalonConferencia;
    protected Integer cantSuites;
    protected Integer cantLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer cantSalonConferencia, Integer cantSuites, Integer cantLimosinas, String gimnasio, String nombreRestaurant, Integer capacidadRestaurant, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurant, capacidadRestaurant, cantHabitaciones, numCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantSalonConferencia = cantSalonConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantSalonConferencia() {
        return cantSalonConferencia;
    }

    public void setCantSalonConferencia(Integer cantSalonConferencia) {
        this.cantSalonConferencia = cantSalonConferencia;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }
    
    @Override
    public Double calcularPrecio() {
        double precio = super.calcularPrecio();
        
        precio += (this.cantLimosinas * 15);
        
        return precio;
    }
}

/*
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:

Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
*/