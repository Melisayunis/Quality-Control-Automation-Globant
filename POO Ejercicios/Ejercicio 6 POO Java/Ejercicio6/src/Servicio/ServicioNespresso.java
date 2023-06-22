/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class ServicioNespresso {
    Scanner leer = new Scanner(System.in);
    
    
    
    public void llenarCafetera(Cafetera cafet){
       // Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
        cafet.setCantidadActual(cafet.getCapacidadMax());
    }
    
    public void servirTaza(Cafetera cafet) {
        /*
         Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
        tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
        cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
        método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
        cuanto quedó la taza.
        */
        System.out.println("Ingrese el tamaño de una taza vacia: ");
        int taza = leer.nextInt();
        
        if (cafet.getCantidadActual() > taza  ) {
            // alcanza para llena toda la taza
            System.out.println("La taza esta llena.");
            cafet.setCantidadActual( (cafet.getCantidadActual()-taza) );
        } else {
            // no alcanza pra llenar la taza
            System.out.println("La taza no esta llena, le falta " + (taza - cafet.getCantidadActual()));
            cafet.setCantidadActual(0);
        }
    }
   
    public void vaciarCafetera(Cafetera cafet) {
        // Método vaciarCafetera(): pone la cantidad de café actual en cero.
        cafet.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafet) {
        // Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
        // recibe y se añade a la cafetera la cantidad de café indicada.
        System.out.println("Ingrese la cantidad de cafe a agregar: ");
        int cant = leer.nextInt();
        if ((cafet.getCantidadActual() + cant) <= cafet.getCapacidadMax()) {
            // se agrega todo el cafe. no se rebalsa
            System.out.println("Cantidad ingresada correctamente.");
            cafet.setCantidadActual( cafet.getCantidadActual() + cant);
        }else {
            // se rebalsa, asiq no se agrega todo
            System.out.println("La cantidad ingresada rebalsa la cafetera, ahora esta llena");
            cafet.setCantidadActual( cafet.getCapacidadMax());
        } 
    }

}
