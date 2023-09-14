/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 Los colores disponibles para los electrodomésticos son:
        blanco, negro, rojo, azul y gris. 
 */
public enum Color {
    BLANCO("blanco"), NEGRO("negro"), ROJO("rojo"), AZUL("azul"), GRIS("gris");
    
    private String color;
    
    Color(String color) {
        this.color = color;
    }
}
