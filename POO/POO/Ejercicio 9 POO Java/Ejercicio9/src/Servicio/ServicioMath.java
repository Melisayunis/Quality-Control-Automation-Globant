/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;
import java.util.Scanner;

/**
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class ServicioMath {
    
    public double devolverMayor(Matematica maths) {
        System.out.println("El mayor de los valores es: ");
        return Math.max(maths.getNum1(), maths.getNum2());
    }
    
    public double calcularPotencia(Matematica maths) {
        // pow(double a, double b) realiza a elevbado a la b
        // round(double a) redondea
        long max = Math.round(Math.max(maths.getNum1(), maths.getNum2()));
        long min = Math.round(Math.min(maths.getNum1(), maths.getNum2()));
        
        System.out.println("El resultado de valor max " + max + " elevado al valor minimo " + min + ". Es: ");
        return (Math.pow(max, min));
    }
    
    public double calculaRaiz(Matematica maths) {
        // abs(double a)
        // sqrt(double a)
        double min = Math.abs(Math.min(maths.getNum1(), maths.getNum2()));
        
        System.out.println("La raiz cuadrada del valor absoluto del menor numero (" + min + "), es: ");
        return (Math.sqrt(min));
    }
    
    public void mostrarNums(Matematica maths) {
        System.out.println("    El primer valor es: "  + maths.getNum1());
        System.out.println("    El segundo valor es: " + maths.getNum2());
    }
}
