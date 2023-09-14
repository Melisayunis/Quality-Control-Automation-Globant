/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**

 */
public class ServiceCP {
    public static HashMap<String, Integer> city = new HashMap<>();
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void addCity() {
        System.out.println("    -> Ingrese el nombre de la ciudad: ");
        String name = read.next();
        System.out.println("    -> Ingrese su codigo postal: ");
        int cp = read.nextInt();
        
        city.put(name, cp);
        System.out.println(" * Ciudad agregada exitosamente.");
    }
    
    public void addCities() {
        city.put("Cordoba", 5000);
        city.put("Santa Maria", 5164);
        city.put("Sarmiento", 9020);
        city.put("Cordoba2", 5010);
        city.put("Cordoba3", 5020);
        city.put("Cordoba4", 5001);
        city.put("Cordoba5", 5030);
        city.put("Cordoba6", 5040);
    }
    
    public void showCP(){
        System.out.println("    * Las ciudades registradas son: ");
        for(Map.Entry<String, Integer> ciudad : city.entrySet()) {
            System.out.println(String.format(" - Ciudad: %s. \n - CP: %s", ciudad.getKey(), ciudad.getValue()));
        }
    }
    
    public void showCity(){
        System.out.println("    -> Ingrese un codigo postal: ");
        int cp = read.nextInt();
        boolean isHere = false;
        
        for(Map.Entry<String, Integer> ciudad : city.entrySet()) {
            if(ciudad.getValue() == cp) {
                System.out.println(String.format(" * Ciudad: %s", ciudad.getKey()));
                isHere = true;
                break;
            }
        }
        if (!isHere) {
            System.out.println(" * El codigo postal ingresado no se encuentra registrado.");
        }
        
    }
    
    public void deleteCity(){
        boolean isHere = false;
        System.out.println("    -> Ingrese el CP de la ciudad a eliminar: ");
        int cp = read.nextInt();
        
        for (Map.Entry<String, Integer> ciudad : city.entrySet()) {
            
            if (ciudad.getValue() == cp) {
                city.remove(ciudad.getKey());
                System.out.println(" * Ciudad eliminada exitosamente.");
                isHere = true;
                break;
            }
        }
        if (!isHere) {
            System.out.println(" * El CP no existe. Intentelo nuevamente");
        }

    }
}
