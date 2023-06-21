/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.EntidadCircunferencia;
import java.util.Scanner;
/**
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (area = pi * area al cuadrado).
e) Método perimetro(): para calcular el perímetro (perimetro = 2 * pi * radio).
 */
public class ServicioCircunferencia {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public EntidadCircunferencia crearCircunferencia(){
        
        System.out.println("Ingrese el radio: ");
        float radio = leer.nextFloat();
        EntidadCircunferencia objeto = new EntidadCircunferencia(radio);
        
        return objeto;
    }
    
    public void area(EntidadCircunferencia objeto) {
        System.out.print("El area del objeto es: ");
        System.out.println((Math.PI) * Math.pow(objeto.getRadio(), 2));
    }
    
    public void perimetro(EntidadCircunferencia objeto) {
        System.out.print("El perimetro del objeto es: ");
        System.out.println(2 * (Math.PI) * objeto.getRadio());
    }
}
