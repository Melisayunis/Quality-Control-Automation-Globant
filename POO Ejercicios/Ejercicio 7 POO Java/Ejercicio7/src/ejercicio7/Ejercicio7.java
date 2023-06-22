/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import Entidad.Persona;
import Servicio.ServicioPersona;

/**
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona person = new ServicioPersona();
        
        Persona p1 = person.crearPersona();
        Persona p2 = person.crearPersona();
        Persona p3 = person.crearPersona();
        Persona p4 = person.crearPersona();        
        
        //System.out.println("Las personas estan en su peso ideal?");

        int peso[] = new int[4];
        peso[0] = person.calcularIMC(p1);
        peso[1] = person.calcularIMC(p2);
        peso[2] = person.calcularIMC(p3);
        peso[3] = person.calcularIMC(p4);
        
        boolean edad[] = new boolean[4];
        edad[0] = person.mayorEdad(p1);
        edad[1] = person.mayorEdad(p2);
        edad[2] = person.mayorEdad(p3);
        edad[3] = person.mayorEdad(p4);
        
        // promedio de cuantos estan en su peso o no, y cuantos son mayor o menor de edad
        int bajo = 0, bien = 0, sobre = 0, menor=0, mayor=0;
        
        for (int i = 0; i < 4; i++) {
            switch (peso[i]) {
                case -1:
                    bajo += 1;
                    break;
                case 0:
                    bien += 1;
                    break;
                case 1:
                    sobre += 1;
                    break;
                default:
                    break;
            }
            
            if (edad[i] == true) {
                mayor += 1;
            } else {
                menor += 1;
            }
        }
       
        System.out.println(bajo + " personas estan bajas de peso.");
        System.out.println(bien + " personas estan normales en su peso.");
        System.out.println(sobre + " personas tienen sobrepeso.");
        System.out.println("");
        System.out.println(menor + " personas son menores de edad.");
        System.out.println(mayor + " personas son mayores de edad.");
    }
    
}
