/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circulo;
import java.util.Scanner;

/**
* PERIMETRO = 2 * PI * RADIO
* AREA = PI * RADIO^2
 */
public class ServicioCirculo {
    Scanner leer = new Scanner(System.in);
    
    public Circulo crearCirculo() {
        System.out.println("Ingrese el radio del circulo: ");
        float radio = leer.nextFloat();
        
        Circulo circul = new Circulo(radio);
        return circul;
    }
    
    public float perimetroCirculo(Circulo figura) {
        float perimetro = 2 * (float) Math.PI * figura.getRadio();
        return perimetro;
    }
    
     public float areaCirculo(Circulo figura) {
        float area = (float) Math.PI * (float)Math.pow(figura.getRadio(), 2);
        return area;
    }
}
