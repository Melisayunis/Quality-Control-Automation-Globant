/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Conversion;
import java.util.Scanner;

/**
Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
(por ejemplo, Celsius, Fahrenheit, Kelvin).
 */
public class ConversionServicio {
    Scanner read = new Scanner(System.in);
    
    public Conversion crearConversion() {
        Conversion grados = new Conversion();
        
        System.out.println("Ingrese una temperatura en grados Celsius: ");
        grados.setCelsius(read.nextDouble());
        
        System.out.println("Ingrese una temperatura en grados Fahrenheit: ");
        grados.setFahrenheit(read.nextDouble());
        
        System.out.println("Ingrese una temperatura en grados Kelvin: ");
        grados.setKelvin(read.nextDouble());
        
        return grados;
    }
    
    public Conversion crearGrados(double c, double f, double k) {
        
        return new Conversion(c, f, k);
    }
    
    public double celsiusToFahrenheit(Conversion grados){
        // Celsius a Fahrenheit: F = (C × 9/5) + 32

        return ((grados.getCelsius() * (1.8)) + 32);
    }
    
    
    public double celsiusToKelvin(Conversion grados){
        // Celsius a Kelvin: K = C + 273.15

        return (grados.getCelsius() + 273.15);
    }
    
    public double fahrenheitToKelvin(Conversion grados){
        //     Fahrenheit a Kelvin: K = (F + 459.67) × 5/9

        return ((grados.getFahrenheit() + 459.67) * (0.555));
    }
    
    public double fahrenheitToCelsius(Conversion grados){
        // Fahrenheit a Celsius: C = (F - 32) × 5/9

        return ((grados.getFahrenheit() - 32) / (0.55));        
    }
    
    public double kelvinToCelsius(Conversion grados){
        // Kelvin a Celsius: C = K - 273.15
    
        return (grados.getKelvin() - 273.15);
    }
    
    public double kelvinToFahrenheit(Conversion grados){
        // Kelvin a Fahrenheit: F = (K × 9/5) - 459.67

        return ((grados.getKelvin() * (1.8)) - 459.67);
    }
}
