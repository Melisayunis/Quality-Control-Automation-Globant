/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

/**
* • Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
public class Hotel4Estrellas extends Hotel {
    protected String gimnasio;
    protected String nombreRestaurant;
    protected Integer capacidadRestaurant;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String gimnasio, String nombreRestaurant, Integer capacidadRestaurant, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public Integer getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(Integer capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }
    
    @Override
    public Double calcularPrecio() {
        double precio = super.calcularPrecio();
        
        if (this.capacidadRestaurant < 30) {
            precio += 10;
        } else if (this.capacidadRestaurant >= 30 && this.capacidadRestaurant < 50) {
            precio += 30;
        } else if (this.capacidadRestaurant >= 50) {
            precio += 50;
        }
        
        if (this.gimnasio.equals(Gimnasio.A.name())) {
            precio += 50;
        } else if (this.gimnasio.equals(Gimnasio.B.name())) {
            precio += 30;
        }
        
        return precio;
    }
    
}

/*
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:

PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).

Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.

Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.

*/