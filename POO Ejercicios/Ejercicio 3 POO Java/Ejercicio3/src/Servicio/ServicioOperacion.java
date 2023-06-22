/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
public class ServicioOperacion {
    
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion() {
        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();
        
        Operacion op = new Operacion(num1, num2);
        return op;
    }
    
    public int sumar(Operacion op){
        return (op.getNumero1() + op.getNumero2());
    }
    
    public int restar(Operacion op){
        return (op.getNumero1() - op.getNumero2());
    }
    
    public int multiplicar(Operacion op){
        
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            System.out.println("Alguno de los numero es 0, ERROR.");
            return 0;
        } else {
            return (op.getNumero1() * op.getNumero2());
        } 
    }
    
    public int dividir(Operacion op){
        
        if (op.getNumero2() == 0) {
            System.out.println("No se puede dividir por 0, ERROR.");
            return 0;
        } else {
            return (op.getNumero1() / op.getNumero2());
        } 
    }
}
