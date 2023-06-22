/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método 
para calcular el perímetro del rectángulo. 

* Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura.
Superficie = base * altura
Perímetro = (base + altura) * 2.
 */
public class ServicioRectangulo {
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la base de su rectangulo: ");
        float base = leer.nextFloat();
        System.out.println("Ingrese la altura de su rectangulo: ");
        float altura = leer.nextFloat();
        
        Rectangulo rect = new Rectangulo(base, altura);
        return rect;
    }
    
    public float superficie(Rectangulo rect) {
        return (rect.getBase() * rect.getAltura());
    }
    
    public float perimetro(Rectangulo rect) {
        return ((rect.getBase() + rect.getAltura()) * 2);
    }
    
    public void dibujar(Rectangulo rect) {
        
        for (int i = 0; i < rect.getAltura(); i++) {
            for (int j = 0; j < rect.getBase(); j++) {
                if (i == 0 || j == 0 || i == rect.getAltura()-1 || j == rect.getBase()-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
