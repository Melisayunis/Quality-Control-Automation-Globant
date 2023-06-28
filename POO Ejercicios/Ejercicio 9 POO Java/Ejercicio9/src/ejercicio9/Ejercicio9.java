/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import Entidad.Matematica;
import Servicio.ServicioMath;
import java.util.Scanner;

/**
 En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean exit = true;
        int opc = 0;
        double num1 = Math.random() * 10;
        double num2 = Math.random() * 10;
        
        ServicioMath service = new ServicioMath();
        Matematica maths = new Matematica();
        maths.setNum1(num1);
        maths.setNum2(num2);
        
        do {
            System.out.println("Ingrese la opcion deseada: ");
            System.out.println("    1- Devolver mayor de los numeros.");
            System.out.println("    2- Calcular la potencia de los numeros.");
            System.out.println("    3- Calcular la raiz de los numeros.");
            System.out.println("    4- Mostrar los numeros.");
            System.out.println("    5- Salir.");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("    " + service.devolverMayor(maths));
                    break;
                case 2:
                    System.out.println("    " + service.calcularPotencia(maths));
                    break;
                case 3: 
                    System.out.println("    " + service.calculaRaiz(maths));
                    break;
                case 4:
                    service.mostrarNums(maths);
                    break;
                case 5:
                    exit = false;
                    break;
            }
        } while (exit == true);
    }
    
}
