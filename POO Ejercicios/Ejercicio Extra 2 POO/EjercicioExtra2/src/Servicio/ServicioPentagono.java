/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pentagono;
import java.util.Scanner;

/**
* perimetro = 5 * lado
* area = (perimetro * apotema) / 2
 */
public class ServicioPentagono {
    Scanner leer = new Scanner(System.in);
    
    public Pentagono crearPentagono() {
        System.out.println("Ingrese el lado del pentagono: ");
        float lado = leer.nextFloat();
        
        System.out.println("Ingrese la apotema del pentagono: ");
        float apotema = leer.nextFloat();
        
        Pentagono figura = new Pentagono(lado, apotema);
        return figura;
    }
    
    public float perimetroPetagono(Pentagono figura) {
        float perimetro = 5 * figura.getLado();
        return perimetro;
    }
    
    public float areaPetagono(Pentagono figura) {
        float area = ( 5 * figura.getLado() * figura.getApotema()) / 2;
        return area;
    }
}
