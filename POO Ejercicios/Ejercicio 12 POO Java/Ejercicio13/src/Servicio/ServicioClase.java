/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
* 
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
* 
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
public class ServicioClase {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso(){
        /*
         Método crearCurso(): el método crear curso, le pide los valores de los atributos al
        usuario y después se le asignan a sus respectivos atributos para llenar el objeto
        Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
        al atributo alumnos
        */
        String alumnos[] = new String[1];
        String turno;
        int cantidadDiasPorSemana;
        int cantidadHorasPorDia;
        System.out.println("Bienvenido, vamos a cargar la información del curso.");
        System.out.println("Ingrese los siguientes datos:");
        
        System.out.println("    * Nombre del curso:");
        String nombreCurso = leer.next();
        
        do {
            System.out.println("    * Cantidad de horas por dia del curso: ");
            cantidadHorasPorDia = leer.nextInt();
        } while (cantidadHorasPorDia <= 0 || cantidadHorasPorDia > 24);
        
        do {
            System.out.println("    * Cantidad de dias por semana que se brinda el curso: ");
            cantidadDiasPorSemana = leer.nextInt();
        } while (cantidadDiasPorSemana <= 0 || cantidadDiasPorSemana > 7);
        
        do {
            System.out.println("    * El turno del curso (maniana / tarde): ");
            turno = leer.next();
        } while (!(turno.toLowerCase().equals("maniana") || turno.toLowerCase().equals("tarde")));
        
        System.out.println("    * El precio por hora: ");
        double precioPorHora = leer.nextDouble();
        
        Curso course = new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, alumnos);
        cargarAlumnos(course);
        
        System.out.println("¡Muchas gracias!");
        
        return course;        
    }
    
    public void cargarAlumnos(Curso course){
            /*
          método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
        que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
        en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
        nombre de cada alumno.
        */
        int cantAlumnos;
        do {
            System.out.println("Ingrese la cantidad de alumnos que se han inscripto al curso (máximo 5): ");
            cantAlumnos = leer.nextInt();
        } while (!(cantAlumnos >= 0) || !(cantAlumnos <= 5));

        String alumnos[] = new String[cantAlumnos];
        String name;
        System.out.println("Vamos a cargar los alumnos que asisten al curso " + course.getNombreCurso());

        for (int i = 0; i < cantAlumnos; i++) {
            System.out.println("Ingrese el alumno N°" + (i+1));
            name = leer.next();
            alumnos[i] = name;
        }
        course.setAlumnos(alumnos);
        System.out.println("Los alumnos cargados son: " + Arrays.toString(course.getAlumnos()));
    }
    
    public double calcularGananciaSemanal(Curso course) {
        /*
         Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
        en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
        día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
        se repite el encuentro.
        */
        double total = course.getCantidadDiasPorSemana() * course.getCantidadHorasPorDia() * course.getPrecioPorHora() * 5;

        return total;
    }
    
    public void mostrarInfo(Curso course) {
        System.out.println("    -> El nombre del curso es: " + course.getNombreCurso());
        System.out.println("    -> Se brinda " + course.getCantidadDiasPorSemana() + " dias por semana.");
        System.out.println("    -> De " + course.getCantidadHorasPorDia() + " horas por cada día.");
        System.out.println("    -> Y cada hora cuesta $" + course.getPrecioPorHora());
        System.out.println("    -> Se brinda en el turno " + course.getTurno());
        System.out.println("    -> Los alumnos que participan son: " + Arrays.toString(course.getAlumnos()));
    }
    
}
