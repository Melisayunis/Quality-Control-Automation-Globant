
import Entidad.Conversion;
import Servicio.ConversionServicio;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 2. Conversión de Temperatura: Crea una clase TemperatureConverter que
 * convierta entre diferentes unidades de temperatura (por ejemplo, Celsius,
 * Fahrenheit, Kelvin). Escribe pruebas unitarias para asegurarte de que la
 * conversión entre las diferentes unidades se realiza correctamente y produce
 * los resultados esperados.
 */
public class Ej2JUnit {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ConversionServicio service = new ConversionServicio();
        Conversion grados = service.crearConversion();

        System.out.println("   -> Los grados Celsius son: " + grados.getCelsius()
                + "\n   -> Los grados Fahrenheit son: " + grados.getFahrenheit()
                + "\n   -> Los grados Kelvin son: " + grados.getKelvin());
        
        System.out.println("");
        
        System.out.println(grados.getCelsius() + " °C son equivalentes a: \n" 
        + "     " + service.celsiusToFahrenheit(grados) + " °F \n"
        + "     " + service.celsiusToKelvin(grados) + " °K");

    }

}
