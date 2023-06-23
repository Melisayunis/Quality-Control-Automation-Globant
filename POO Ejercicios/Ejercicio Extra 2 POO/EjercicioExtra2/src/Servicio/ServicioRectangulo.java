/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
* perimetro = 2 * base + 2* altura
* area = base * altura
 */
public class ServicioRectangulo {
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la base del rectangulo: ");
        int base = leer.nextInt();
        
        System.out.println("Ingrese la altura del rectangulo: ");
        int altura = leer.nextInt();
        
        Rectangulo rectang = new Rectangulo(base, altura);
        return rectang;
    }
    
    public int perimetroRectangulo(Rectangulo figura){
        int perimetro = figura.getAltura() *2 + figura.getBase() * 2;
        return perimetro;
    }
    
    public int areaRectangulo(Rectangulo figura) {
        int area = figura.getAltura() * figura.getBase();
        return area;
    }
    
}
