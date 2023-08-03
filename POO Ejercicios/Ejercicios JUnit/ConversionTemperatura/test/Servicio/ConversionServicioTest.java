/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Conversion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversionServicioTest {
    
    public ConversionServicioTest() {
    }
    
    ConversionServicio service;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        service = new ConversionServicio();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void deberiaConvertirCelsiusToFahrenheit(){
        assertEquals(77.0, service.celsiusToFahrenheit(service.crearGrados(25, 0, 0)), 0);
        assertEquals(98.6, service.celsiusToFahrenheit(service.crearGrados(37, 0, 0)), 0.00000001);
        assertEquals(80.33, service.celsiusToFahrenheit(service.crearGrados(26.85, 0, 0)), 0.00000001);
        assertEquals(32.0, service.celsiusToFahrenheit(service.crearGrados(0, 0, 0)), 0);
    }
    
    @Test
    public void deberiaConvetirCelsiusToKelvin() {
        assertEquals(298.15, service.celsiusToKelvin(service.crearGrados(25, 0, 0)), 0);
        assertEquals(310.15, service.celsiusToKelvin(service.crearGrados(37, 0, 0)), 0);
        assertEquals(300, service.celsiusToKelvin(service.crearGrados(26.85, 0, 0)), 0);
        assertEquals(273.15, service.celsiusToKelvin(service.crearGrados(0, 0, 0)), 0);
    }
    
    @Test
    public void deberiaConvertirFahrenheitToKelvin() {
        assertEquals(310.15, service.fahrenheitToKelvin(service.crearGrados(0, 98.6, 0)), 1);
        
        
    }
    
}
