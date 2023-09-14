
import java.util.Scanner;

public class Ej3Extra_Herencia {

    /*
    Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
        • todos los alojamientos.
        • todos los hoteles de más caro a más barato.
        • todos los campings con restaurante
        • todos las residencias que tienen descuento.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean exit = true;
        int opc;

        do {
            menu();
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    /*  • todos los alojamientos.*/

                    break;
                case 2:
                    /*  • todos los hoteles de más caro a más barato.*/

                    break;
                case 3:
                    /*  • todos los campings con restaurante*/

                    break;
                case 4:
                    /* • todos las residencias que tienen descuento. */

                    break;
                case 0:
                    exit = false;
                    System.out.println(" Hasta luego!");
                    break;
            }
        } while (exit);
    }

    private static void menu() {
        System.out.println("-----------------------------------------");
        System.out.println(" ---> Ingrese la opcion deseada:");
        System.out.println("\n * 1- Mostrar todos los alojamientos"
                + "\n * 2- Mostrar los hoteles del mas caro al mas barato."
                + "\n * 3- Mostrar todos los camping con restaurantes."
                + "\n * 4- Mostrar todas las residencias que tienen descuento."
                + "\n * 0- Salir. \n");
    }

}
