/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
En el main se crearán las formas y se mostrará el resultado final.
 */
public class Ej4Herencia {

    public static void main(String[] args) {
       
        Circulo circulo1 = new Circulo(4, 9);
        Circulo circulo2 = new Circulo(15, 5);
        Circulo circulo3 = new Circulo(20, 20);
        
        Rectangulo rectangulo1 = new Rectangulo(20, 5);
        Rectangulo rectangulo2 = new Rectangulo(5, 10);
        Rectangulo rectangulo3 = new Rectangulo(8, 16);
        
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        
        circulo2.calcularArea();
        circulo2.calcularPerimetro();
        
        circulo3.calcularArea();
        circulo3.calcularPerimetro();
        
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
        
        rectangulo2.calcularArea();
        rectangulo2.calcularPerimetro();
        
        rectangulo3.calcularArea();
        rectangulo3.calcularPerimetro();
    }
    
}
