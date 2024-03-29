/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;


/**
Para esto, tendremos una clase Pelicula con el título, director 
* y duración de la película (en horas).
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    
    public static Comparator<Pelicula> compararDuracionMenorMayor = 
            (Pelicula movie1, Pelicula movie2) -> 
                    (movie1.getDuracion().compareTo(movie2.getDuracion()));
    
    public static Comparator<Pelicula> compararDuracionMayorMenor = 
            (Pelicula movie1, Pelicula movie2) -> 
                    (movie2.getDuracion().compareTo(movie1.getDuracion()));
    
    public static Comparator<Pelicula> compararPorTituloAlfabet = 
            (Pelicula movie1, Pelicula movie2) -> 
                    (movie1.getTitulo().compareTo(movie2.getTitulo()));
    
    public static Comparator<Pelicula> compararDirectorAlfabet = 
            (Pelicula movie1, Pelicula movie2) -> 
            (movie1.getDirector().compareTo(movie2.getDirector()));
    
}
