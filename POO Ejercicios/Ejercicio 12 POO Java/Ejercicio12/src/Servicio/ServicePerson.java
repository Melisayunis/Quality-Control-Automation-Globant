/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Person;
import java.util.Scanner;
import java.util.Date;

/**
Y los siguientes métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
public class ServicePerson {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Person crearPersona() {
        /*
     Agregar un método de creación del objeto que respete la siguiente firma:
        crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
        usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
        fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    */
        System.out.println("Ingrese el nombre de la persona: ");
        String name = leer.next();
        int dia, mes, anio;
        boolean isOk;
        
        System.out.println("Ingrese los datos de la fecha de nacimiento:");
        
        do {
            System.out.println("Día:");
            dia = leer.nextInt();
            System.out.println("Mes:");
            mes = leer.nextInt();
            isOk = dateOK(dia, mes);
            
            if (isOk == false){
                System.out.println("Los datos ingresados son erroneos, ingreselos nuevamente: ");
            }
        } while (isOk == false);
        
        System.out.println("Año:");
        anio = leer.nextInt();
        
        Date birthDay = new Date(anio, mes, dia);
        Person people = new Person(name, birthDay);
        
        return people;
    }
    
    private boolean dateOK(int dia, int mes) {
        // verifica que el dia y el mes sean correctos
        boolean isOk = false;

        if (dia > 0 && mes > 0) {
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
                isOk = true;
            } else if (mes == 2 && dia <= 28) {
                isOk = true;
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                isOk = true;
            }
        }

        return isOk;
    }
    
    public int calcularEdad(Person people) {
        /*
         Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
            en cuenta que para conocer la edad de la persona también se debe conocer la fecha
            actual.
        */
        Date now = new Date(); // fecha actual
        
        // getYear()
        Date fecha = people.getBirthDate();
        int edad;
        
        if (now.getMonth() > fecha.getMonth()) {
            // ya cumplio años
            edad = now.getYear() + 1900 - fecha.getYear();
        } else if (now.getMonth() == fecha.getMonth() && now.getDate() >= fecha.getDate()) {
            // ya cumplio años
            edad = now.getYear() + 1900 - fecha.getYear();
        } else {
            // no cumplio años todavia
            edad = now.getYear() + 1900 - fecha.getYear() - 1;
        }

        return edad;        
    }
    
    public boolean menorQue(int edadPerson, int edad) {
        /*
         Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
        edad y retorna true en caso de que el receptor tenga menor edad que la persona que
        se recibe como parámetro, o false en caso contrario.
        */
        boolean isMenor = false;
        
        if (edadPerson >= edad) {
            isMenor = true;
        }

        return isMenor;
    }
    
    public void mostrarPersona(Person people) {
        /*
         Metodo mostrarPersona(): este método muestra la persona creada en el método
        anterior.
        */
        System.out.println("   -> El nombre de la persona es: " + people.getName());
        System.out.print("   -> La fecha de nacimiento de la perosna es: " );
        System.out.print(people.getBirthDate().getDate() + "/");
        System.out.print(people.getBirthDate().getMonth() + "/");
        System.out.println(people.getBirthDate().getYear());
    }
}
