
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
* 
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
public class Ej2ExtraHerencia {

    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        
        // int nroOficinas, int cantPersonasPorOficina, int nroPisos, double ancho, double alto, double largo
        Edificio oficina1 = new EdificioDeOficinas(10, 5, 10, 15.0, 2.0, 5.0);
        Edificio oficina2 = new EdificioDeOficinas(15, 8, 20, 18.0, 2.0, 7.5);
        
        // String name, Instalacion tipoInstalacion, double ancho, double alto, double largo
        Edificio poli1 = new Polideportivo("Poli1", Instalacion.ABIERTO, 25.0, 5.0, 25.0);
        Edificio poli2 = new Polideportivo("Poli2", Instalacion.TECHADO, 15.0, 4.0, 35.0);
        
        edificios.add(poli2);
        edificios.add(poli1);
        edificios.add(oficina1);
        edificios.add(oficina2);
        
        for(Edificio edif : edificios){
            
            if (edif.getClass().equals(Polideportivo.class)) {
                Polideportivo poli = (Polideportivo) edif;
                System.out.println(String.format("\n * El nombre del polideportivo es %s, y es de tipo %s", poli.getName(), poli.getTipoInstalacion().name()));
                System.out.println(String.format(" * Su superficie es de %s y su volumen es de %s ", poli.calcularSuperficie(), poli.calcularVolumen()));
            }
            if (edif.getClass().equals(EdificioDeOficinas.class)) {
                EdificioDeOficinas ofi = (EdificioDeOficinas) edif;
                System.out.println(String.format("\n * El edificios de oficinas tiene "
                        + "una superficie de %s, y un volumen de %s", ofi.calcularSuperficie(), ofi.calcularVolumen()));
                ofi.cantPersonas();
            }
        }
        
    }
    
}
