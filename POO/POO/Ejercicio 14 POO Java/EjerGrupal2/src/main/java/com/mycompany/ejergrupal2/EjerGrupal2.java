/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejergrupal2;

import Entidad.Alquiler;
import Entidad.Pelicula;
import Servicios.AlquilerServicios;
import Servicios.PeliculaServicios;
import java.util.Scanner;

/**
 *
 * @author Mafe
 */
public class EjerGrupal2 {

    public static void main(String[] args) {

        PeliculaServicios PS = new PeliculaServicios();
        AlquilerServicios AS = new AlquilerServicios();

//        Pelicula P1 = PS.crearPelicula();
        Scanner leer = new Scanner(System.in);
        boolean testigo = true;
        Pelicula[] peliculas = new Pelicula[2];
        Alquiler[] alquiler = new Alquiler[1];
        while (testigo) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Cargar una película");
            System.out.println("2. Mostrar todas las películas disponibles");
            System.out.println("3. Crear un alquiler");
            System.out.println("4. Mostrar todos los alquileres realizados");
            System.out.println("5. Buscar películas por título");
            System.out.println("6. Buscar películas por genero");
            System.out.println("7. Buscar alquileres por fecha");
            System.out.println("8. calcular precio");
            System.out.println("9. Salir");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < peliculas.length; i++) {
                        peliculas[i] = PS.crearPelicula();
                    }
                    break;
                case 2:
                    PS.verPeliculas(peliculas);
                    break;
                case 3:
                    for (int i = 0; i < alquiler.length; i++) {
                        alquiler[i] = AS.crearAlquiler();
                    }
                    break;
                case 4:
                    AS.verAlquiler(alquiler);
                    break;

                case 5:
                    PS.buscarTitulo(peliculas);
                    break;
                case 6:
                    PS.buscarGenero(peliculas);

                    break;

                case 7:
                    AS.buscarFecha(alquiler);
                    break;
                case 8:
                    System.out.println(AS.calcularIngresoTotal(alquiler));
                    break;
                case 9:
                    testigo = false;
                    break;
            }

        }
    }
}
