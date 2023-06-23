/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuadrado;
import java.util.Scanner;

/**
Calcular area y perimetro
 */
public class ServicioCuadrado {
    Scanner leer = new Scanner(System.in);
    
    public Cuadrado crearCudrado() {
        System.out.println("Ingrese el tamaño del lado del cuadrado: ");
        int lado = leer.nextInt();
        
        Cuadrado cuadr = new Cuadrado(lado);
        return cuadr;
    }
    
    public int areaCuadrado(Cuadrado cuadr) {
        int area = cuadr.getLado() * cuadr.getLado();
        return area;
    }
    
    public int perimetroCuadrado(Cuadrado cuadr) {
        int perimetro = cuadr.getLado() * 4;
        return perimetro;        
    }
    
}
