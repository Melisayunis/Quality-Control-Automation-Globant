/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.RazaPerro;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RazaServicioTest {
    
    public RazaServicioTest() {
    }
    
    RazaServicio service;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        service = new RazaServicio();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crearRaza method, of class RazaServicio.
     */
    @Test
    public void testDeberiaCrearRaza() {
        
        assertNotNull(service.creaRazaPerro("Doberman"));
        
    }
    
    @Test
    public void testDeberiaCargarRazaALista(){
        /*
        public void cargarRaza(RazaPerro raza) {
        if (!razaExiste(raza)) {
            listaRazas.add(raza);
            System.out.println("    Raza agregada exitosamente");
        }*/
        
        
        
        
        
    }
    
}
