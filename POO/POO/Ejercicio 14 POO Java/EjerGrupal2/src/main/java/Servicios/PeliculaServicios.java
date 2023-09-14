/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Alquiler;
import Entidad.Pelicula;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Mafe
 */
public class PeliculaServicios {

    Scanner leer = new Scanner(System.in);

    public Pelicula crearPelicula() {
        System.out.println("Ingresar el titulo");
        String nombre = leer.nextLine();
        System.out.println("Ingresar el año");
        int a = leer.nextInt();
        Date anio = new Date();
        anio.setYear(a);
        System.out.println("Ingresar el genero");
        System.out.println("1-comedia / 2-accion / 3- terror");

        int genero = leer.nextInt();
        String G1 = "";
        switch (genero) {
            case 1:
                G1 = "comedia";
                break;
            case 2:
                G1 = "accion";
                break;
            case 3:
                G1 = "terror";
                break;
            default:
                System.out.println("La ingresada es incorrecta");
                break;
        }

        System.out.println("Cuando dura la pellicula");

        int duracion = leer.nextInt();
        leer.nextLine();
        return new Pelicula(nombre, anio, G1, duracion);

    }

    public void verPeliculas(Pelicula[] P1) {

        for (int i = 0; i < P1.length; i++) {
            System.out.println("La pelicula " + i);
            System.out.println("nombre: " + P1[i].getTitulo());
            System.out.println("genero: " + P1[i].getGenero());
            System.out.println("año: " + P1[i].getAnio());
            System.out.println("Duracion: " + P1[i].getDuracion());

        }

    }

    public void buscarTitulo(Pelicula[] P1) {

        System.out.println("Ingresa el titulo");
        String titulo = leer.nextLine();
        boolean tes = false;

        for (int i = 0; i < P1.length; i++) {
            if (P1[i].getTitulo().equals(titulo)) {
                System.out.println(P1[i].getTitulo());
                System.out.println("La pelicula existe");
                tes = true;
                break;
            }
        }

        if (!tes) {
            System.out.println("La pelicula no existe");
        }

    }
    
    public void buscarGenero(Pelicula[] P1) {

        System.out.println("Ingresa el genero");
        String genero = leer.nextLine();
        boolean tes = false;

        for (int i = 0; i < P1.length; i++) {
            if (P1[i].getGenero().equals(genero)) {
                System.out.println(P1[i].getTitulo());
                System.out.println("El genero existe");
                tes = true;
                break;
            }
        }

        if (!tes) {
            System.out.println("No existen peliculas de este genero");
        }

    }

}
