/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.HashSet;

/**
● Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
● Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
● Método toString para mostrar los datos de los libros.
 */
public class LibroServicio {
    
    public boolean prestamo(Libro libro) {
        if(libro.getEjemplares() > libro.getEjemplaresPrestados()) {
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
            return true;
        }
        return false;
    }
    
    public boolean devolucion(Libro libro) {
        if(libro.getEjemplaresPrestados()>0) {
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()-1);
            return true;
        }
        return false;
    }
    
    
    public void toString(HashSet<Libro> libros){
        System.out.println("    Los libros registrados son: ");
        for (Libro libro : libros) {
            System.out.println(String.format("\n- Titulo: %s. \n- Autor: %s. \n- Ejemplares: %s. \n- Ejemplares prestados: %s.",
                    libro.getTitulo(), libro.getAutor(), libro.getEjemplares(), libro.getEjemplaresPrestados()));
        }
    }
    
}
