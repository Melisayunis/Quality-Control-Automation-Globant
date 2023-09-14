
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 */

/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/
public class Ej1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<String> razas = new ArrayList();
        Iterator it = razas.iterator();
        
        boolean exit = true;
        String nameRaza;

        System.out.println("Ingrese una raza de perro: ");
        nameRaza = read.next();
        razas.add(nameRaza);

        do {
            System.out.println("Desea agregar una raza nueva? "
                    + "\n   1: Si"
                    + "\n   2: No");

            switch (read.nextInt()) {
                case 1:
                    System.out.println("Ingrese una raza de perro: ");
                    nameRaza = read.next();
                    razas.add(nameRaza);
                    System.out.println("    -> Raza agregada exitosamente. Las razas actuales son: ");

                    razas.forEach((raza) -> {
                        System.out.println(raza);
                    });
                    break;
                case 2:
                    exit = false;
                    break;
                default:
                    System.out.println("La opcion ingresa es incorrecta, intentelo nuevamente:");
            }
        } while (exit);

    }

}
