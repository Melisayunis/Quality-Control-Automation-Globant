/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Vehiculo;
import java.util.Scanner;

/**
* Moverse: Es la cantidad de metros que avanzará por segundo.
* Frenar: Dejará de avanzar y se frenará 2 metros más adelante. 
* En el caso de la bicicleta, se frenará y no avanzará más metros.
* Referencias:
* Un automóvil avanza 3 metros por segundo.
* Una motocicleta avanza 2 metros por segundo.
* Una bicicleta avanza 1 metro por segundo.
* marca, modelo, tipo, año
 */
public class ServicioVehiculo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Vehiculo crearVehiculo() {
        boolean opc;
        System.out.println("Ingrese la marca del vehiculo: ");
        String marca = leer.next();
        System.out.println("Ingrese el modelo del vehiculo: ");
        String modelo = leer.next();
        String tipo;
        do {
            System.out.println("Ingrese el tipo del vehiculo (automovil, motocicleta, bicicleta):");
            tipo = leer.next();

            if (!(tipo.equals("automovil") || tipo.equals("motocicleta") || tipo.equals("bicicleta"))) {
                System.out.println("La opcion ingresada es incorrecta, intentelo nuevamente: ");
                opc = false;
            } else {
                opc = true;
            }
        } while (opc == false);
        
        System.out.println("Ingrese el año del vehiculo: ");
        int año = leer.nextInt();
        
        Vehiculo vehic = new Vehiculo(marca, modelo, tipo, año);
        return vehic;
    }
    
    public int moverVehiculo(Vehiculo vehic){
        int mover = 0;
        
        System.out.println("Ingrese por cuanto tiempo se movera el vehiculo: ");
        mover = leer.nextInt();
        
        switch (vehic.getTipo()) {
            case "automovil":
                mover = mover * 3;
                break;
            case "motocicleta":
                 mover = mover * 2;
                break;
            case "bicicleta":
                 mover = mover * 1;
                break;
            default:
                break;
        }
        // Devuelve la cantidad de metros que se avanzó en el tiempo indicado
        return mover;
    }
    
    public int frenarVehiculo(Vehiculo vehic) {
        int frenar = 0;
        
        if (!(vehic.getTipo().equals("bicicleta"))) {
            frenar = 2;
        }
        // Devuelve la cantidad de metros que avanza luego de frenar.
        return frenar;
    }
    
    public void mostrarVehiculo(Vehiculo vehic) {
        System.out.println("El vehiculo es un/a: " + vehic.getTipo());
        System.out.println("Su marca es: " + vehic.getMarca() + ", con modelo " + vehic.getModelo() + ", del año " + vehic.getAño());
    }
    
}
