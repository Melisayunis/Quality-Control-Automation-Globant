/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Pelicula;
import java.time.LocalDate;
import java.util.Scanner;

public class PeliculaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {
        boolean exit;
        String genero = "";
        int opcGenero;
        
        System.out.println("\n" +"----> Ingrese el titulo de la pelicula: ");
        String titulo = leer.nextLine();
        
        System.out.println("    -> Ingrese la fecha /año de la pelicula: ");
        LocalDate anio = cargarFecha();

        do {
            System.out.println("    -> Ingrese el genero: ");
            System.out.println("  1- Comedia | 2- Accion | 3- Terror ");
            opcGenero = leer.nextInt();
            switch (opcGenero) {
                case 1:
                    genero = "comedia";
                    exit = false;
                    break;
                case 2:
                    genero = "accion";
                    exit = false;
                    break;
                case 3:
                    genero = "terror";
                    exit = false;
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta, intentelo nuevamente: ");
                    exit = true;
                    break;
            }
        } while (exit == true);

        System.out.println("    -> Ingrese la duración en minutos de la pelicula: ");
        int duracion = leer.nextInt();
        leer.nextLine();
        return new Pelicula(titulo, anio, genero, duracion);
    }

    public void verPeliculas(Pelicula[] peliculas) {
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println("\n" + "La información de la pelicula " + (i+1) + " es:");
            System.out.println("    Nombre: " + peliculas[i].getTitulo());
            System.out.println("    Genero: " + peliculas[i].getGenero());
            System.out.println("    Año: " + peliculas[i].getAnio());
            System.out.println("    Duracion: " + peliculas[i].getDuracion());
        }
    }

    public void buscarTitulo(Pelicula[] peliculas) {
        System.out.println("\n" +"Ingrese el titulo de la pelicula a buscar: ");
        String titulo = leer.nextLine();
        boolean exist = false;
        
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
                System.out.println("La pelicula -" + pelicula.getTitulo() + "- existe");
                exist = true;
                break;
            }
        }
        
        if (!exist) {
            System.out.println("La pelicula solicitada no existe.");
        }
    }
    
    public void buscarGenero(Pelicula[] peliculas) {
        System.out.println("Ingresa el genero");
        String genero = leer.nextLine();
        boolean exist = false;

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getGenero().toLowerCase().equals(genero.toLowerCase())) {
                System.out.println("La pelicula -" + pelicula.getTitulo() + "- es del genero: " + genero);
                exist = true;
            }
        }

        if (!exist) {
            System.out.println("No existen peliculas de este genero.");
        }
    }
    
    private LocalDate cargarFecha() {
        boolean isOk;
        int dia, mes, anio;
        
        do {
            System.out.println("Día:");
            dia = leer.nextInt();
            System.out.println("Mes:");
            mes = leer.nextInt();
            isOk = dateOK(dia, mes);
            
            if (isOk == false){
                System.out.println("Los datos ingresados son erroneos, ingreselos nuevamente: ");
            }
        } while (isOk == false);
        
        System.out.println("Año:");
        anio = leer.nextInt();
        
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        
        return fecha;
    }
    
    private boolean dateOK(int dia, int mes) {
        // verifica que el dia y el mes sean correctos
        boolean isOk = false;

        if (dia > 0 && mes > 0) {
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
                isOk = true;
            } else if (mes == 2 && dia <= 28) {
                isOk = true;
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                isOk = true;
            }
        }

        return isOk;
    }
}
