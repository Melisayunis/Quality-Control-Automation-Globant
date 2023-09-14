
import java.util.Scanner;
import Entidad.Cliente;
import Servicio.ServicioCliente;


/**
Crea al menos cinco clientes con datos ficticios.
Crea al menos cinco rutinas con datos ficticios.
Registra los clientes creados en el sistema utilizando el método correspondiente del servicio de clientes.
Agrega las rutinas creadas al sistema utilizando el método correspondiente del servicio de rutinas.
Obtén la lista de todos los clientes registrados y muéstralos por pantalla.
Obtén la lista de todas las rutinas registradas y muéstralas por pantalla.
Realiza una actualización en uno de los clientes existentes y muestra la lista de clientes actualizada.
Realiza una actualización en una de las rutinas existentes y muestra la lista de rutinas actualizada.
Elimina uno de los clientes existentes y muestra la lista de clientes final.
Elimina una de las rutinas existentes y muestra la lista de rutinas final.
 */
public class Gimnasio {
    private static Scanner read = new Scanner(System.in).useDelimiter("\n");
    private static ServicioCliente serviceCliente = new ServicioCliente();
    
    public static void main(String[] args) {

        boolean exit = true;
        int option, deleteId;
        
        do {
            mostrarOpciones();
            option = read.nextInt();
            System.out.println("");
            switch (option) {
                case 1:
                    serviceCliente.registrarCliente();
                    break;
                case 2: 
                    serviceCliente.obtenerClientes();
                    break;
                case 3:
                    pedirInfoActualizar();
                    break;
                case 4: 
                    System.out.println("Ingrese el id del cliente que desea eliminar:");
                    deleteId = read.nextInt();
                    serviceCliente.eliminarCliente(deleteId);
                    break;
                    
                case 5:
                    break;
                case 6: 
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                    exit = false;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta, intente nuevamente:");
            }
        } while (exit);
        
    }
    
    
    private static void mostrarOpciones() {
        System.out.println("");
        System.out.println("Ingrese la opcion que desea realizar: "
                + "\n         Clientes"
                + "\n     1- Registrar un cliente."
                + "\n     2- Obtener todos los clientes."
                + "\n     3- Actualizar un cliente."
                + "\n     4- Eliminar un cliente."
                + "\n         Rutina"
                + "\n     5- "
                + "\n     6- "
                + "\n     7- "
                + "\n     8- "
                + "\n     9- "
                + "\n     0- Salir.");
    }

    private static void pedirInfoActualizar() {
        System.out.println("Ingrese los datos del cliente a actualizar: "
                + "\n   ID nuevo: ");
        int id = read.nextInt();
        System.out.println("    Nombre nuevo: ");
        String nombre = read.next();
        System.out.println("    Edad nueva: ");
        int edad = read.nextInt();
        System.out.println("    Altura  nueva: ");
        double altura = read.nextDouble();
        System.out.println("    Peso nuevo: ");
        double peso = read.nextDouble();
        System.out.println("    Objetivo nuevo: ");
        String objetivo = read.next();

        serviceCliente.actualizarCliente(id, nombre, edad, altura, peso, objetivo);
    }
    
}
