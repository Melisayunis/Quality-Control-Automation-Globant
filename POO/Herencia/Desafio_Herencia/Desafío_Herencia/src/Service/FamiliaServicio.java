/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Familia;
import Entity.Integrante;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FamiliaServicio implements FamiliaServiceInterface {
    
    ArrayList<Familia> familias = new ArrayList<>();

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    NinioService ninioServicio = new NinioService();
    JovenService jovenServicio = new JovenService();
    AdultoService adultoServicio = new AdultoService();
    AdultoMayorService adultoMayorServicio = new AdultoMayorService();

    @Override
    public Familia crearFamilia() {
        Familia familia = null;

        System.out.println(" * Ingrese a continuacion los datos de la familia: ");
        System.out.println(" --> Ide: ");
        familia.setIde(read.nextInt());

        System.out.println(" --> Dirección: ");
        familia.setDireccion(read.next());

        System.out.println(" --> Número de lote: ");
        familia.setNumLote(read.nextInt());

        System.out.println(" --> Barrio");
        familia.setBarrio(read.next());

        System.out.println(" --> Localidad");
        familia.setLocalidad(read.next());
        
        System.out.println(" --> ¿Cuántos integrantes conforman la familia?");
        int cantIntegrantes = read.nextInt();
        familia.setIntegrantes(crearIntegrantes(cantIntegrantes));

        familias.add(familia);
        
        return familia;
    }

    private ArrayList<Integrante> crearIntegrantes(int cantidad) {
        ArrayList<Integrante> integrantes = null;
        Integrante integrante;
        int opc;
        int integrantesIngresados = 1;

        System.out.println(" * Ingrese los datos de cada integrante de la familia: ");

        do {
            System.out.println(" Ingrese la opcion que corresponda a la edad del integrante " + integrantesIngresados
                    + "\n -> - 1: Niño (menor a 14 años)."
                    + "\n -> - 2: Joven (entre 15 y 18 años)."
                    + "\n -> - 3: Adulto (entre 19 y 64 años )."
                    + "\n -> - 4: Adulto mayor (mayor a 65 años).");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    integrante = ninioServicio.crearIntegrante();
                    integrantesIngresados += 1;
                    break;
                case 2:
                    integrante = jovenServicio.crearIntegrante();
                    integrantesIngresados += 1;
                    break;
                case 3:
                    integrante = adultoServicio.crearIntegrante();
                    integrantesIngresados += 1;
                    break;
                case 4:
                    integrante = adultoMayorServicio.crearIntegrante();
                    integrantesIngresados += 1;
                    break;
                default:
                    System.out.println(" ** La opcion ingresada es incorrecta, intentelo nuevamente. ** ");
                    break;
            }
        } while (integrantesIngresados <= cantidad);

        return integrantes;
    }


    @Override
    public void mostrarFamilia(Familia familia) {
        
        for (Integrante integrante : familia.getIntegrantes()) {
            integrante.toString();
        }
    }

    @Override
    public void eliminarFamilia(Familia familia) {
        Iterator it = familias.iterator();
        
        int ide = familia.getIde();
        Familia aux;
        
        while (it.hasNext()) {
            aux = (Familia) it.next();
            if (aux.getIde() == ide) {
                it.remove();
            }
        }
    }

    @Override
    public Familia modificarFamilia(Familia familia) {
        
        
        return familia;
    }

}
