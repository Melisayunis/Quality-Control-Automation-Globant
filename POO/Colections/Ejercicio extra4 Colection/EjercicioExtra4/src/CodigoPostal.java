
import Servicio.ServiceCP;
import java.util.Scanner;

/**
 * Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
 * página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la
 * letra, solo el número. • Pedirle al usuario que ingrese 10 códigos postales y
 * sus ciudades. • Muestra por pantalla los datos introducidos • Pide un código
 * postal y muestra la ciudad asociada si existe sino avisa al usuario. •
 * Muestra por pantalla los datos • Agregar una ciudad con su código postal
 * correspondiente más al HashMap. • Elimina 3 ciudades existentes dentro del
 * HashMap, que pida el usuario. • Muestra por pantalla los datos
 */
public class CodigoPostal {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ServiceCP service = new ServiceCP();
        boolean exit = true;
        int opc;

        service.addCities();
        
        do {
            System.out.println("\n    -> Ingrese la opcion que desea realizar: ");
            System.out.println(" 1: Agregar ciudad."
                    + "\n 2: Mostrar ciudades."
                    + "\n 3: Buscar por CP."
                    + "\n 4: Eliminar ciudad."
                    + "\n 0: Salir.");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    service.addCity();
                    break;
                case 2:
                    service.showCP();
                    break;
                case 3:
                    service.showCity();
                    break;
                case 4:
                    service.deleteCity();
                    break;
                case 0:
                    exit = false;
                    System.out.println(" ¡Hasta Luego! ");
                    break;
                default:
                    System.out.println(" * La opcion ingresada es incorrecta, intentelo nuevamente");
                    break;
            }
        } while (exit);

    }

}
