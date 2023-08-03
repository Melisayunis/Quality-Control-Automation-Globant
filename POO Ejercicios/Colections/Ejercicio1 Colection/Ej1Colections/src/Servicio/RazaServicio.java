/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.RazaPerro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class RazaServicio {

    private ArrayList<String> listaRazas;
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public RazaServicio() {
        this.listaRazas = new ArrayList();
    }

    public RazaPerro crearRaza() {
        System.out.println("Ingrese la raza del perro: ");
        return creaRazaPerro(read.next());
    }

    public RazaPerro creaRazaPerro(String raza) {
        return new RazaPerro(raza);
    }

    public void cargarRaza(RazaPerro raza) {

        if (!razaExiste(raza)) {
            // si la raza no se encuentra en la lista, la agrego
            listaRazas.add(raza.getRaza());
            System.out.println("    Raza agregada exitosamente");
        } else {
            // sino manda un mensaje avisando
            System.out.println("    La raza ya se encuentra en la lista, ingrese una nueva.");
        }
    }
    
    // ver forEach 
    // ver lista.stream();
    
    public void eliminarPorNombre() {
        System.out.println("Ingrese el nombre de la raza que desea eliminar: ");
        String name = read.next();
        
        for (int i = 0; i < listaRazas.size(); i++) {
            if (listaRazas.get(i).equals(name)){
                listaRazas.remove(name);
                System.out.println("    -> La raza se ha eliminado con exito.");
            }
        }
    }
    
    public void actualizarRazaPorNombre(){
        String razaNew;
        System.out.println("Ingrese el nombre de la raza que desea actualizar: ");
        String nameOriginal = read.next();
        
        System.out.println("Ingrese el nombre nuevo: ");
        String nameNuevo = read.next();
        
        for (int i = 0; i < listaRazas.size(); i++) {
            razaNew = listaRazas.get(i);
            
            if (razaNew.equals(nameOriginal)){
                
                razaNew.set(i, nameNuevo);
                System.out.println("    -> La raza se ha actualizado con exito.");
                break;
            }
        }
        
    }

    public void mostrarRazas() {
        System.out.println("Hay " + listaRazas.size() + " razas cargadas. Estas son: ");
        listaRazas.forEach((aux) -> {
            System.out.println("    -> " + aux);
        });
    }

    private boolean razaExiste(RazaPerro raza) {

        if (!(listaRazas.isEmpty())) {
            for (String aux : listaRazas) {
                if (raza.equals(aux)) {
                    return true;
                }
            }
        }
        return false;
    }

    private int indiceRaza() {
        boolean exit = true;
        int index;

        do {
            System.out.println("Ingrese el N° de la raza desea eliminar/actualizar: ");
            mostrarRazas();
            index = read.nextInt();

            if (index <= listaRazas.size()) {
                return index;
            }
            System.out.println("    -->> La posición indicada no exite, intentelo nuevamente.");
        } while (exit);

        return index;
    }

        /*public void eliminarRazaBuscandoIndice() {
        int delete = indiceRaza();

        if (razaExiste(listaRazas.get(delete - 1))) {
            // si la raza se encuentra en la lista, la agrego
            listaRazas.remove(delete - 1);
            System.out.println("    Raza eliminada exitosamente");
        } else {
            // sino manda un mensaje avisando
            System.out.println("    La raza no se encuentra en la lista, no se puede eliminar");
        }

    }*/
    
    /*public void actualizarRazaBuscandoIndice() {
        int actualizar = indiceRaza();

        if (razaExiste(listaRazas.get(actualizar - 1))) {
            System.out.println("Ingrese la nueva raza: ");
            listaRazas.set(actualizar - 1, read.next());
        }

    }*/   
    
    
}
