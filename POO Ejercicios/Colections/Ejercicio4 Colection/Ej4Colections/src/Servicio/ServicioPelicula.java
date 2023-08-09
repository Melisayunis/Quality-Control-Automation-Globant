/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula
 * pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al
 * usuario si quiere crear otra Pelicula o no.
 *
 * Después de ese bucle realizaremos las siguientes acciones: 
 * • Mostrar en pantalla todas las películas. 
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora. 
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. 
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla. 
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla. 
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
public class ServicioPelicula  {
    ArrayList<Pelicula> peliculas = new ArrayList();
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void crearPelicula() {
        boolean exit = true;
        int opc;
        Pelicula movie;

        do {
            movie = new Pelicula();
            System.out.println("    * Ingrese el titulo de la pelicula: ");
            movie.setTitulo(read.next());
            System.out.println("    * Ingrese el director de la pelicula: ");
            movie.setDirector(read.next());
            System.out.println("    * Ingrese la duracion de la pelicula en minutos: ");
            movie.setDuracion(read.nextInt());
            peliculas.add(movie);

            System.out.println("    * Desea cargar una nueva pelicula? "
                    + "\n       1: Si"
                    + "\n       2: No");
            opc = read.nextInt();
            
            switch(opc) {
                case 1:
                    exit = true;
                    break;
                case 2:
                    exit = false;
                    break;
                default:
                    System.out.println("La opcion ingresa es incorrecta, intentelo nuevamente.");
                    break;
            }
        } while (exit);
    }

    public void mostrarPeliculas() {
        System.out.println(" -> Las peliculas disponibles son: ");
        peliculas.forEach((movie) -> { mostrar(movie); } );
    }
    
    private void mostrar(Pelicula movie) {
        System.out.println("     Titulo: " + movie.getTitulo() 
                       + "\n     Director: " + movie.getDirector()
                       + "\n     Duracion: " + movie.getDuracion() + "\n");
    }
    
    public void mostrarTodasMenoresUnaHora() {
        for (Pelicula movie : peliculas ){
            if (movie.getDuracion() <= 60) {
                mostrar(movie);
            }
        }
    }
    
    public void duracionMenorMayor() {
        peliculas.sort(Pelicula.compararDuracionMenorMayor);
    }
    
    public void duracionMayorMenor() {
        peliculas.sort(Pelicula.compararDuracionMayorMenor);
    }
    
    public void ordenarPorTituloAlfabet() { 
        peliculas.sort(Pelicula.compararPorTituloAlfabet);
    }
    
    public void ordenarDirectorAlfabet() {
        peliculas.sort(Pelicula.compararDirectorAlfabet);
    }


    
}
