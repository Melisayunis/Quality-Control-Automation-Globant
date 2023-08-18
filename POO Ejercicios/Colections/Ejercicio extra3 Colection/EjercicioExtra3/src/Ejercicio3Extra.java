
import Entidad.Libro;
import Servicio.LibroServicio;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Implemente un programa para una Librería haciendo uso de un HashSet para
 * evitar datos repetidos.
 *
 * Para ello, se debe crear una clase llamada Libro que guarde la información de
 * cada uno de los libros de una Biblioteca. La clase Libro debe guardar el
 * título del libro, autor, número de ejemplares y número de ejemplares
 * prestados. También se creará en el main un HashSet de tipo Libro que guardará
 * todos los libros creados.
 *
 * En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario
 * todos sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda
 * en el conjunto y se le pregunta al usuario si quiere crear otro Libro o no.
 *
 *
 */
public class Ejercicio3Extra {

    public static void main(String[] args) {
        HashSet<Libro> libros = new HashSet();
        LibroServicio serviceBook = new LibroServicio();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Libro book;

        int opc;
        boolean exit = true, prestamoDevolucion = false;

        do {
            System.out.println("    -> Ingrese el titulo del libro: ");
            String titulo = read.next();
            System.out.println("    -> Ingrese el autor del libro: ");
            String autor = read.next();
            System.out.println("    -> Ingrese la cantidad de ejemplares del libro: ");
            int ejemplares = read.nextInt();
            System.out.println("    -> Ingrese la cantidad de ejemplares prestados: ");
            int ejemplaresPrestados = read.nextInt();

            book = new Libro(titulo, autor, ejemplares, ejemplaresPrestados);
            libros.add(book);

            System.out.println("    -> ¿Desea cargar un nuevo libro?"
                    + "\n  - 1: Si"
                    + "\n  - 2: No");
            opc = read.nextInt();

            if (opc == 2) {
                exit = false;
            }

        } while (exit);

        exit = true;
        do {
            System.out.println("\n    -> Ingrese que desea realizar: "
                    + "\n   * 1: Solicitar un prestamo de un libro."
                    + "\n   * 2: Devolver un ejemplar."
                    + "\n   * 3: Mostrar todos los libros."
                    + "\n   * 0: Salir.");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("    -> Ingrese el titulo dle libro que desea sacar prestado: ");
                    String nombre = read.next();

                    for (Libro libro : libros) {
                        if (libro.getTitulo().equals(nombre)) {
                            prestamoDevolucion = serviceBook.prestamo(libro);
                            break;
                        }
                    }
                    if (!prestamoDevolucion) {
                        System.out.println(" No se pudo realizar el prestamo.");
                    } else System.out.println(" * Prestamo exitoso");

                    break;
                case 2:
                    System.out.println("    -> Ingrese el titulo dle libro que desea devolver: ");
                    String name = read.next();

                    for (Libro libro : libros) {
                        if (libro.getTitulo().equals(name)) {
                            prestamoDevolucion = serviceBook.devolucion(libro);
                            break;
                        }
                    }
                    if (!prestamoDevolucion) {
                        System.out.println(" No se pudo realizar la devolucion.");
                    } else System.out.println(" * Devolucion exitosa");

                    break;
                case 3:
                    serviceBook.toString(libros);
                    break;
                case 0:
                    System.out.println(" ¡Hasta Luego! ");
                    exit = false;
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta.");
                    break;
            }
        } while (exit);
    }

}
