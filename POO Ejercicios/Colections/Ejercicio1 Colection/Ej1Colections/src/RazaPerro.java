
import Servicio.RazaServicio;
import java.util.Scanner;


/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 */
public class RazaPerro {

    /**
     * @param args the command line arguments
     */
    private static final Scanner read = new Scanner(System.in);
    private static final RazaServicio service = new RazaServicio();
    
    public static void main(String[] args) {
        
        boolean exit = true;
        int opc;
        
        do {
            System.out.println("\n Ingrese la opcion que desea realizar: "
                    + "\n     1: Ingresar una nueva raza de perro."
                    + "\n     2: Eliminar una raza existente."
                    + "\n     3: Mostrar las razas de perro cargadas."
                    + "\n     4: Actualizar una raza existente."
                    + "\n     0: Salir.");

            opc = read.nextInt();

            switch (opc) {
                case 1:
                    service.cargarRaza(service.crearRaza());
                    break;
                case 2:
                    service.eliminarPorNombre();
                    
                    //service.eliminarRazaBuscandoIndice();
                    break;
                case 3:
                    service.mostrarRazas();
                    break;
                case 4:
                    service.actualizarRazaPorNombre();
                    
                    //service.actualizarRazaBuscandoIndice();
                    break;
                case 0:
                    System.out.println("    ¡Hasta luego! :) ");
                    exit = false;
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta. Intentelo neuvamente");
            }
        } while (exit);

    }

}
