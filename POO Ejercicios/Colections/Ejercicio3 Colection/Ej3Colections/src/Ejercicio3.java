
import Servicio.ServiceAlumno;
import java.util.Scanner;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. *
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ServiceAlumno serviceStudent = new ServiceAlumno();

        boolean exit = true;
        int opc;

        do {
            System.out.println("\n Ingrese la opcion que desea realizar: "
                    + "\n   1: Agregar alumnos."
                    + "\n   2: Calcular nota final de un alumno."
                    + "\n   3: Buscar un alumno."
                    + "\n   4: Ver todos los alumnos."
                    + "\n   5: Eliminar un alumno."
                    + "\n   6: Actualizar un alumno."
                    + "\n   0: Salir. \n");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    serviceStudent.crearAlumno();
                    break;
                case 2:
                    System.out.println("    -> La nota final del alumno es: " + serviceStudent.notaFinal());
                    break;
                case 3:
                    serviceStudent.buscarAlumno();
                    break;
                case 4:
                    serviceStudent.mostrarAlumnos();
                    break;
                case 5:
                    serviceStudent.eliminarAlumno();
                    break;
                case 6:
                    serviceStudent.actualizarAlumno();
                    break;
                case 0:
                    exit = false;
                    System.out.println("¡Hasta luego! \n");
                    break;
                default:
                    System.out.println("    -> La opcion ingresada es incorrecta, intentelo nuevamente.");
                    break;
            }

        } while (exit);

    }

}
