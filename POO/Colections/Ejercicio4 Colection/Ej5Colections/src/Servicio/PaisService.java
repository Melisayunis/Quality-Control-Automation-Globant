/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto.
 * 
 * Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
public class PaisService {

    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    HashSet<Pais> paises = new HashSet();

    public void cargarPais() {
        Pais country;
        boolean exit = true;
        int opc;

        do {
            country = new Pais();
            System.out.println("    -> Ingrese el nombre del pais: ");
            country.setName(read.next());
            paises.add(country);

            System.out.println("    -> ¿Desea agregar un nuevo pais? "
                    + "\n     -> 1: Si"
                    + "\n     -> 2: No");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    exit = true;
                    break;
                case 2:
                    exit = false;
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta, intente nuevamente.");
            }
        } while (exit);
    }

    public void mostrarPaises(){
        System.out.println(" * Los paises son: ");
        for (Pais country : paises) {
            System.out.println("    * Nombre: " + (country.getName().toUpperCase().charAt(0)) 
                    + (country.getName().substring(1, country.getName().length())) );
        }
    }
    
    private void eliminarPais(Pais country) {
        paises.remove(country);
    }
    
    public void ordenarPaises(){
        // Hay que pasar de HashSet a Listas para poder ordenar.
        ArrayList<Pais> listCountry = new ArrayList(paises); 
        listCountry.sort(Pais.compararPaises);
        mostrarPaisesOrdenados(listCountry);
    }
    
    private void mostrarPaisesOrdenados(ArrayList<Pais> list) {
        for (Pais country : list) {
            System.out.println("    * Nombre: " + (country.getName().toUpperCase().charAt(0)) 
                    + (country.getName().substring(1, country.getName().length())) );
        }
    }
    
    public void buscarPais() {
        System.out.println("Ingrese el pais que desea buscar y eliminar: ");
        String name = read.next();
        boolean isHere = false;
        
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            Pais newCountry = it.next();
            
            if (newCountry.getName().equals(name)) {
                eliminarPais(newCountry);
                isHere = true;
                System.out.println("Pais eliminado exitosamente.");
                break;
            } 
        }
        if (!isHere) {
            System.out.println("El pais no se encontradba registrado.");
        }
    }
    
}
