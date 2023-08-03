/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
* 
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
* 
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
* 
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
* 
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
* 
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
* 
* Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
public class ServicioRaices {
    Scanner read = new Scanner(System.in);
    
    public Raices crearRaiz() {
        Raices equation = new Raices();
        System.out.println("Ingrese los siguientes valores para crear la funcion de 2do grado:"
        + "\n   -> a:");
        equation.setA(read.nextInt());
        System.out.println("   -> b:");
        equation.setB(read.nextInt());
        System.out.println("   -> c:");
        equation.setC(read.nextInt());
        
        return equation;
    }
    
    /*
     Método getDiscriminante(): devuelve el valor del discriminante (double). El
    discriminante tiene la siguiente formula: (b^2)-4*a*c
    */
    public double getDiscriminante(Raices equation) {
        
        return Math.pow(equation.getB(), 2) - 4 * equation.getA() * equation.getC();
    }
    
    /*  Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    que esto ocurra, el discriminante debe ser mayor o igual que 0.
    */
    public boolean tieneRaices(Raices equation) {
        
        return getDiscriminante(equation) >= 0;
    }
    
    /*
     Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
    que esto ocurra, el discriminante debe ser igual que 0.
    */
    public boolean tieneRaiz(Raices equation) {
        
        return getDiscriminante(equation) == 0;
    }
    
    /*
     Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
    posibles soluciones.
    */
    public void obtenerRaices(Raices equation) {
        // (-b±√((b^2)-(4*a*c)))/(2*a)
        // (-b±√discriminante) / (2*a)
        
        double divi2a = 2 * equation.getA();
        double raizDiscrim = Math.sqrt(getDiscriminante(equation));
        
        if (tieneRaices(equation)) {
            // imprimirlas hacer el calculo para + y -
            System.out.println("La ecuacion tiene 2 raices, estas son:" 
            + "\n   Raiz 1: " + (((-equation.getB()+raizDiscrim)/divi2a))
            + "\n   Raiz 2: " + (((-equation.getB()-raizDiscrim)/divi2a)));
        }
    }
    
    
    /*
     Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
    Es en el caso en que se tenga una única solución posible.
    */
    public void obtenerRaiz(Raices equation) {
        // (-b±√((b^2)-(4*a*c)))/(2*a)
        double divi2a = 2 * equation.getA();
        double raizDiscrim = Math.sqrt(getDiscriminante(equation));
        
        if (tieneRaiz(equation)) {
            // imprimir la raiz. sino no hace nada
            System.out.println("La ecuacion tiene 1 raiz, esta es:" 
            + "\n   Raiz 1: " + (((-equation.getB()+raizDiscrim)/divi2a)));
        } 
    }
    
    
    /*
     Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
    pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
    obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
    de no existir solución, se mostrará un mensaje.
    */
    public void calcular(Raices equation) {
         
        if (tieneRaiz(equation)) {
            obtenerRaiz(equation);
        } else if (tieneRaices(equation)) {
            obtenerRaices(equation);
        } else {
            System.out.println("La ecuacion de segundo grado ingresada no tiene solucion. \n");
        }  
    }
    
    
}
