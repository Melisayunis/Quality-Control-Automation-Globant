
package desafio2;

import Entidad.Alquiler;
import Entidad.Pelicula;
import Servicios.AlquilerServicio;
import Servicios.PeliculaServicios;
import java.util.Scanner;

public class Desafio2 {
    
    public static void main(String[] args) {
        PeliculaServicios PS = new PeliculaServicios();
        AlquilerServicio AS = new AlquilerServicio();
        boolean exit = true;
        int opcion;
        
        Scanner leer = new Scanner(System.in);
        System.out.println(" ¿Cuantas peliculas desea ingresar? ");
        Pelicula[] peliculas = new Pelicula[leer.nextInt()];
        System.out.println(" ¿Cuantos alquileres desea ingresar? ");
        Alquiler[] alquiler = new Alquiler[leer.nextInt()];
        
        do {
            menu();            
            opcion = leer.nextInt();

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
                    AS.calcularIngresoTotal(alquiler);
                    break;
                case 0:
                    exit = false;
                    System.out.println("Hasta luego! ");
                    break;
            }
        } while (exit == true);
    }
    
    private static void menu() {
        System.out.println("");
        System.out.println("Ingrese la opcion deseada: " + 
                "\n     1. Cargar una película." + 
                "\n     2. Mostrar todas las películas disponibles." + 
                "\n     3. Cargar los alquileres." + 
                "\n     4. Mostrar todos los alquileres realizados." + 
                "\n     5. Buscar películas por título." + 
                "\n     6. Buscar películas por genero." + 
                "\n     7. Buscar alquileres por fecha." + 
                "\n     8. Calcular los ingresos totales." + 
                "\n     0. Salir." );
    }
}
