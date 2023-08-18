/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Libro;
import java.util.Scanner;

/**
Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, 
* el autor del libro y el numero de páginas.
 */
public class ServiciosLibro {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro CargarLibro(){
        System.out.println("Ingrese el autor del libro: ");
        String autor = leer.next();
        
        System.out.println("Ingrese el titulo del libro: ");
        String titulo = leer.next();
        
        System.out.println("Ingrese el número de ISBN del libro: ");
        int ISBN = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de páginas del libro: ");
        int pag = leer.nextInt();
        
        Libro book = new Libro(ISBN, titulo, autor, pag);
        
        return book;
    }

    public void MostrarLibro(int ISBN, String titulo, String autor, int pag){
        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El ISBN del libro es: " + ISBN);
        System.out.println("El libro tiene " + pag + " paginas.");
    }
    
}
