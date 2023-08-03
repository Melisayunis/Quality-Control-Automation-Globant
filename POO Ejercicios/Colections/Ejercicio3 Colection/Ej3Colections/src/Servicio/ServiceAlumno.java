/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 *
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 *
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
 * calcular su nota final y se lo busca en la lista de Alumnos. Si está en la
 * lista, se llama al método. Dentro del método se usará la lista notas para
 * calcular el promedio final de alumno. Siendo este promedio final, devuelto
 * por el método y mostrado en el main.
 */
public class ServiceAlumno {

    private ArrayList<Alumno> listaAlumnos = new ArrayList();
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumno() {
        boolean exit = true;
        int opc = 1, nota;
        Alumno student;

        do {
            System.out.println("\n    * ¿Desea agregar un nuevo alumno?"
                    + "\n       1: Si"
                    + "\n       2: No");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    student = new Alumno();
                    System.out.println("    * Ingrese el nombre del alumno: ");
                    student.setName(read.next());
                    System.out.println("    * Ingrese la 1er nota:");
                    nota = read.nextInt();
                    student.getNotas().add(agregarNotaOk(nota));

                    System.out.println("    * Ingrese la 2da nota:");
                    nota = read.nextInt();
                    student.getNotas().add(agregarNotaOk(nota));

                    System.out.println("    * Ingrese la 3er nota:");
                    nota = read.nextInt();
                    student.getNotas().add(agregarNotaOk(nota));

                    listaAlumnos.add(student);
                    System.out.println("    -> Alumno agregado exitosamente.");
                    break;
                case 2:
                    exit = false;
                    break;
                default:
                    System.out.println("    -> La opcion ingresada es incorrecta, intentelo nuevamente.");
                    break;
            }

        } while (exit);
    }

    private Integer agregarNotaOk(Integer nota) {
        boolean exit = true;
        do {
            if (nota <= 10 && nota > 0) {
                return nota;
            }
            System.out.println("    ¡¡La nota ingresada es invalida!! Ingresela nuevamente: ");
            nota = read.nextInt();
        } while (exit);
        return nota;
    }

    /*
    * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
 * calcular su nota final y se lo busca en la lista de Alumnos. Si está en la
 * lista, se llama al método. Dentro del método se usará la lista notas para
 * calcular el promedio final de alumno. Siendo este promedio final, devuelto
 * por el método y mostrado en el main.
     */
    public double notaFinal() {
        double finalNote = 0;
        System.out.println("    * Ingrese el nombre del alumno a calcular su nota final: ");
        String name = read.next();

        for (Alumno student : listaAlumnos) {
            if (student.getName().equals(name)) {
                // calcular nota final
                for (int i = 0; i < 3; i++) {
                    finalNote += student.getNotas().get(i);
                }
                return (finalNote / 3);
            }
        }
        System.out.println("    -> No se encontro el alumno, intentelo nuevamente.");
        return finalNote;
    }

    public void buscarAlumno() {
        System.out.println("    * Ingrese el nombre del alumno que desea buscar: ");
        String name = read.next();
        boolean isHere = false;

        for (Alumno student : listaAlumnos) {
            if (student.getName().equals(name)) {
                System.out.println("    -> Las notas del alumno " + student.getName() + " son: "
                        + student.getNotas().toString());
                isHere = true;
            }
        }
        if (!isHere) {
            System.out.println("    -> No se encuentró el alumno, intentelo nuevamente.");
        }
    }

    public void mostrarAlumnos() {
        System.out.println("    Los alumnos registrados son: ");
        listaAlumnos.forEach((student) -> {
            System.out.println("    -> Nombre: " + student.getName()
                    + "\n    -> Sus notas son: " + student.getNotas().toString() + "\n");
        });
    }

    public void eliminarAlumno() {
        System.out.println("    * Ingrese el nombre del alumno a eliminar: ");
        String name = read.next();
        boolean isHere = false;
        Iterator<Alumno> it = listaAlumnos.iterator();

        while (it.hasNext()) {
            if (it.next().getName().equals(name)) {
                it.remove();
                System.out.println("    -> El alumno se ha eliminado exitosamente.");
                isHere = true;
                break;
            }
        }
        if (!isHere) {
            System.out.println("    -> No se encontro el alumno, intentelo nuevamente.");
        }
    }

    public void actualizarAlumno() {
        System.out.println("    * Ingrese el nombre del alumno a actualizar: ");
        String name = read.next();
        int nota;
        boolean isHere = false;
        Iterator<Alumno> it = listaAlumnos.iterator();
        Alumno student;

        while (it.hasNext()) {
            student = it.next();
            if (student.getName().equals(name)) {
                System.out.println("    * Ingrese el nuevo nombre del alumno: ");
                student.setName(read.next());

                for (int i = 0; i < 3; i++) {
                    System.out.println("    * Ingrese la  " + (i+1) + "° nota: ");
                    nota = read.nextInt();
                    student.getNotas().set(i, agregarNotaOk(nota));
                }
                isHere = true;
                System.out.println("    -> Alumno actualizado correctamente.");
            }
        }
        if (!isHere) {
            System.out.println("    -> El alumno no se ha encontrado, intentelo nuevamente.");
        }
    }

}
