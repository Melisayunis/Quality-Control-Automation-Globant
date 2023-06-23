/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2;

import Entidad.Circulo;
import Entidad.Cuadrado;
import Entidad.Pentagono;
import Entidad.Rectangulo;
import Entidad.Rombo;
import Entidad.Triangulo;
import Servicio.ServicioCirculo;
import Servicio.ServicioCuadrado;
import Servicio.ServicioHexagono;
import Servicio.ServicioPentagono;
import Servicio.ServicioRectangulo;
import Servicio.ServicioRombo;
import Servicio.ServicioTriangulo;
import java.util.Scanner;


/**
* Se está realizando una calculadora grafica, y se requiere calcular algunas áreas 
* y perímetros de unas figuras geométricas. Las figuras son las siguientes:
    Cuadrado
    Rectángulo
    Triangulo
    Circulo
    Hexágono
    Pentágono
    Rombo
* El usuario debe elegir la figura geométrica, luego debe ingresar el/los dato/s 
* de la figura geométrica elegida y le debe mostrar por pantalla el área y el perímetro.
* Aclaración: Si el usuario elige una figura, se debe crear un objeto de esa figura 
* seleccionada, y realizar los cálculos para luego mostrar en pantalla.
 */
public class EjercicioExtra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        boolean exit = true;

        do {
            System.out.println("");
            System.out.println("Elija la opcion que desee: ");
            System.out.println("* 1: Cuadrado");
            System.out.println("* 2: Rectangulo");
            System.out.println("* 3: Triangulo");
            System.out.println("* 4: Circulo");
            System.out.println("* 5: Rombo");
            System.out.println("* 6: Pentagono");
            System.out.println("* 7: Hexagono");
            System.out.println("* 8: Salir");
            System.out.println("--------------------------");
            opc = leer.nextInt();

            switch(opc){
                case 1:
                    ServicioCuadrado servCuad = new ServicioCuadrado();
                    Cuadrado cuadr = servCuad.crearCudrado();
                    System.out.println("-> El area del cuadrado es: " + servCuad.areaCuadrado(cuadr));
                    System.out.println("-> El perimetro del cuadrado es: " + servCuad.perimetroCuadrado(cuadr));
                    break;
                case 2:
                    ServicioRectangulo servRect = new ServicioRectangulo();
                    Rectangulo rect = servRect.crearRectangulo();
                    System.out.println("-> El area del rectangulo es: " + servRect.areaRectangulo(rect));
                    System.out.println("-> El perimetro del rectangulo es: " + servRect.perimetroRectangulo(rect));
                    break;
                case 3:
                    ServicioTriangulo servTriang = new ServicioTriangulo();
                    Triangulo triang = servTriang.crearTriangulo();
                    System.out.println("-> El area del triangulo es: ");
                    System.out.println("-> El perimetro del triangulo es: ");
                    break;
                case 4:
                    ServicioCirculo servCirc = new ServicioCirculo();
                    Circulo circ = servCirc.crearCirculo();
                    System.out.println("-> El area del circulo es: " + servCirc.areaCirculo(circ));
                    System.out.println("-> El perimetro del circulo es: " + servCirc.perimetroCirculo(circ));
                    break;
                case 5:
                    ServicioRombo servRombo = new ServicioRombo();
                    Rombo rombo = servRombo.crearRombo();
                    System.out.println("-> El area del rombo es: ");
                    System.out.println("-> El perimetro del rombo es: ");
                    break;
                case 6:
                    ServicioPentagono servPent = new ServicioPentagono();
                    Pentagono pent = servPent.crearPentagono();
                    System.out.println("-> El area del pentagono es: " + servPent.areaPetagono(pent));
                    System.out.println("-> El perimetro del pentagono es: " + servPent.perimetroPetagono(pent));
                    break;
                case 7:
                    ServicioHexagono servHex = new ServicioHexagono();
                    //  Hexagono hexag = servHex.
                    System.out.println("-> El area del hexagono es: ");
                    System.out.println("-> El perimetro del hexagono es: ");
                    break;
                case 8:
                    exit = false;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("-> La opcion ingresa no es correcta, intentelo nuevamente.");
                    break;
            }
        } while(exit == true);
        
    }
    
}
