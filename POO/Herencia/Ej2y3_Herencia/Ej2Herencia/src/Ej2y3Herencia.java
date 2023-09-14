
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
public class Ej2y3Herencia {

    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> listElectros = new ArrayList();
        double sumaAll = 0;
        
        //  Lavadora(Integer carga, Double precio, String color, String consumoEnergetico, Double peso)
        Lavadora lavadora1 = new Lavadora(45, 1000.0, "Negro", "A", 89.0);
        Lavadora lavadora2 = new Lavadora(20, 1000.0, "Gris", "E", 45.0);
        
        // Televisor(Integer resolucion, boolean sintonizadorTDT, Double precio, String color, String consumoEnergetico, Double peso)
        Televisor tv1 = new Televisor(50, true, 1000.0, "Rojo", "C", 25.0);
        Televisor tv2 = new Televisor(21, false, 1000.0, "Negro", "B", 18.0);
        
        listElectros.add(lavadora1);
        listElectros.add(lavadora2);
        listElectros.add(tv1);
        listElectros.add(tv2);
        
        for (Electrodomestico electros : listElectros) {
            electros.precioFinal();
            
            if (electros.getClass().equals(Lavadora.class)) {
                System.out.println(String.format(" * El precio de la lavadora es: $ %s", electros.getPrecio()));
            } else if (electros.getClass().equals(Televisor.class)) {
                System.out.println(String.format(" * El precio del televisor es: $ %s", electros.getPrecio()));
            }

            sumaAll += electros.getPrecio();
        }
        
        System.out.println(String.format("  -----> La suma de los electrodomesticos es: $ %s", sumaAll));

        System.out.println("\n -> Lavadora 1: ");
        lavadora1.mostrarLavadora();
        System.out.println("\n -> Lavadora 2: ");
        lavadora2.mostrarLavadora();
        System.out.println("\n -> TV 1: ");
        tv1.mostrarTelevisor();
        System.out.println("\n -> TV 2: ");
        tv2.mostrarTelevisor();
        
        System.out.println("");
    }
    
    
    
}
