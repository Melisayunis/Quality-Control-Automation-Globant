/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío.
 */
public class Libro {
    
    public int ISBN;
    public String titulo;
    public String autor;
    public int pag;
    
    public Libro() {
    }
    
    public Libro(int ISBN, String titulo, String autor, int pag) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.pag = pag;
    }
}
