
package Servicio;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioCantanteFamoso {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void addCantantes(ArrayList<CantanteFamoso> lista) {
        CantanteFamoso cf1 = new CantanteFamoso("Elvis Presley", "Elvis is Back!");
        CantanteFamoso cf2 = new CantanteFamoso("Michael Jackson", "Thriller");
        CantanteFamoso cf3 = new CantanteFamoso("Johnny Cash", "At Folsom Prison");
        CantanteFamoso cf4 = new CantanteFamoso("Chuck Berry", "The Great Twenty-Eight");
        CantanteFamoso cf5 = new CantanteFamoso("Bruce Springsteen", "Born in the U.S.A.");

        lista.add(cf1);
        lista.add(cf2);
        lista.add(cf3);
        lista.add(cf4);
        lista.add(cf5);
    }

    public void addCantante(ArrayList<CantanteFamoso> lista) {
        System.out.println("    -> Ingrese el nombre del nuevo cantante: ");
        String name = read.next();
        System.out.println("    -> Ingrese el nombre del disco mas vendido del cantante: ");
        String disco = read.next();

        CantanteFamoso newSinger = new CantanteFamoso(name, disco);
        lista.add(newSinger);

        System.out.println(" * Cantante agregado exitosamente.");
    }

    public void searchCantante(ArrayList<CantanteFamoso> lista) {
        System.out.println("    -> Ingrese el nombre del cantante a buscar: ");
        String name = read.next();
        boolean isHere = false;

        for (CantanteFamoso cantante : lista) {
            if (cantante.getNombre().equals(name)) {
                System.out.println("    -> El disco mas vendido de " + name + " es: " + cantante.getDiscoConMasVentas());
                isHere = true;
                break;
            }
        }
        if (!isHere) {
            System.out.println(" * El cantante ingresado no existe en la lista.");
        }
    }

    public void showCantantes(ArrayList<CantanteFamoso> lista) {
        System.out.println(" * Los cantantes registrados son: ");
        for (CantanteFamoso cantante : lista) {
            System.out.println("\n - Nombre: " + cantante.getNombre()
                    + "\n - Disco mas vendido: " + cantante.getDiscoConMasVentas());
        }

        /*lista.forEach((cantante) -> {
            System.out.println("\n - Nombre: " + cantante.getNombre()
                    + "\n - Disco mas vendido: " + cantante.getDiscoConMasVentas());
        });*/
    }

    public void deleteCantante(ArrayList<CantanteFamoso> lista) {
        Iterator<CantanteFamoso> it = lista.iterator();
        CantanteFamoso nextCantante;
        boolean isHere = false;

        System.out.println("    -> Ingrese el nombre del cantante a eliminar: ");
        String name = read.next();

        while (it.hasNext()) {
            nextCantante = it.next();
            if (nextCantante.getNombre().equals(name)) {
                it.remove();
                System.out.println(" * Cantante eliminado exitosamente.");
                isHere = true;
                break;
            }
        }
        if (!isHere) {
            System.out.println(" * El cantante no exite en la lista, intente nuevamente.");
        }
    }

    public void changeCantante(ArrayList<CantanteFamoso> lista) {
        System.out.println("    -> Ingrese el nombre del cantante a modificar: ");
        String name = read.next();
        CantanteFamoso nextCantante;
        boolean isHere = false;
        Iterator<CantanteFamoso> it = lista.iterator();
        
        while (it.hasNext()) {
            nextCantante = it.next();
            if (nextCantante.getNombre().equals(name)) {
                System.out.println("    -> Ingrese el nuevo nombre del disco más vendido: ");
                String disco = read.next();
                nextCantante.setDiscoConMasVentas(disco);
                
                System.out.println(" * Cambios realizados exitosamente.");
                isHere = true;
                break;
            }
        }
        if (!isHere) {
            System.out.println(" * El cantante ingresado no existe en la lista.");
        }
    }
}
