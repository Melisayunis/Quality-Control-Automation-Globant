/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1;

import Entidad.Vehiculo;
import Servicio.ServicioVehiculo;
import java.util.Scanner;

/**
Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
avanzó.
 */
public class EjercicioExtra1 {

    public static void main(String[] args) {
        boolean exit = true;
        int seguir = 0;
        Scanner leer = new Scanner(System.in);
        
        ServicioVehiculo serVehic = new ServicioVehiculo();
        System.out.println("    1° vehiculo: ");
        Vehiculo v1 = serVehic.crearVehiculo();
        System.out.println("    2° vehiculo: ");
        Vehiculo v2 = serVehic.crearVehiculo();
        System.out.println("    3° vehiculo: ");
        Vehiculo v3 = serVehic.crearVehiculo();
        
        int mover1, mover2, mover3;
        // Hacemos un ciclo para probar los 3 vehiculos en diferentes velocidades.
        do {
            System.out.println("    Acciones para  " + v1.getTipo() + ", de marca " + v1.getMarca());
            mover1 = serVehic.moverVehiculo(v1) + serVehic.frenarVehiculo(v1);
            System.out.println("* El vehiculo avanzó " + (mover1) + " metros en el tiempo indicado.");
            System.out.println("");
            
            System.out.println("    Acciones para  " + v2.getTipo() + ", de marca " + v2.getMarca());
            mover2 = serVehic.moverVehiculo(v2) + serVehic.frenarVehiculo(v2);
            System.out.println("* El vehiculo avanzó " + (mover2) + " metros en el tiempo indicado.");
            System.out.println("");
            
            System.out.println("    Acciones para  " + v3.getTipo() + ", de marca " + v3.getMarca());
            mover3 = serVehic.moverVehiculo(v3) + serVehic.frenarVehiculo(v3);
            System.out.println("* El vehiculo avanzó " + (mover3) + " metros en el tiempo indicado.");
            System.out.println("");
            
            if (mover1 >= mover2 && mover1 >= mover3) {
                System.out.println("-> El vehiculo mas rapido fue el 1° ");
                serVehic.mostrarVehiculo(v1);
            } else if (mover2 >= mover1 && mover2 >= mover3) {
                System.out.println("-> El vehiculo mas rapido fue el 2° ");
                serVehic.mostrarVehiculo(v2);
            } else {
                System.out.println("-> El vehiculo mas rapido fue 3° ");
                serVehic.mostrarVehiculo(v3);
            }
            
            
            System.out.println("    Desea continuar? Ingrese: 1 -> Si - 2 -> No");
            seguir = leer.nextInt();
            if (seguir == 2) {
                exit = false;
            }
        } while (exit == true);
        
    }
    
}
