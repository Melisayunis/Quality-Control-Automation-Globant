/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Triangulo;
import java.util.Scanner;

/** DEPENDE DEL TIPO DE TRIANGULO?????
* perimetro = a+b+c
* area = (base * altura ) /2
 */
public class ServicioTriangulo {
    Scanner leer = new Scanner(System.in);
    
    
    public Triangulo crearTriangulo(){
        System.out.println("Ingrese la base del triangulo: ");
        int base = leer.nextInt();
        
        System.out.println("Ingrese la altura del triangulo: ");
        int altura = leer.nextInt();
        
        System.out.println("Ingrese el lado 1: ");
        int lado1 = leer.nextInt();
        System.out.println("Ingrese el lado 2: ");
        int lado2 = leer.nextInt();
        System.out.println("Ingrese el lado 3: ");
        int lado3 = leer.nextInt();
        
        
        Triangulo triang = new Triangulo();
        return triang;
    }
    
       
       
       
       
       
}
