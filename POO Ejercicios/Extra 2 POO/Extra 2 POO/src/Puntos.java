
import Entidad.Punto;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. 
 */
public class Puntos {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Punto point = crearPuntos();
        System.out.println("LA distancia entre los puntos ingresados es: " + distanciaPuntos(point));
    }
    
    private static Punto crearPuntos() {
        Scanner read = new Scanner(System.in);
        
        System.out.println("* Ingrese los valores de cada punto a continuacion:"
                + "\n    x1: ");
        int x1 = read.nextInt();
        System.out.println("    x2: ");
        int x2 = read.nextInt();
        System.out.println("    y1: ");
        int y1 = read.nextInt();
        System.out.println("    y2: ");
        int y2 = read.nextInt();

        return new Punto(x1, x2, y1, y2);
    }
    
    private static int distanciaPuntos(Punto point) {
        double aux = Math.pow((point.getX2() - point.getX1()), 2) + Math.pow((point.getY2() - point.getY1()), 2);
        
        return (int) Math.sqrt(aux);
    }
    
}
