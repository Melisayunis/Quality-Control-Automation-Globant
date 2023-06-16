/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;

public class POOEj01 {


    public static void main(String[] args) {
        
          Persona prueba1 = new Persona("melisa", "yunis", 31);
          
          prueba1.getApellido();
          prueba1.getEdad();
          prueba1.getNombre();
          
          prueba1.setApellido("Yunis Duclos");
          prueba1.setNombre("Melisa Belen");


    }
    
}
