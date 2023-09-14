
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Utilizando la herencia de forma apropiada, deberemos programar en Java, las
 * clases y los métodos necesarios que permitan al usuario elegir el barco que
 * quiera alquilar y mostrarle el precio final de su alquiler.
 */
public class Ej1ExtraHerencia {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        boolean exit = true;
        int opc;

        ArrayList<Alquiler> alquileres = new ArrayList();
        Alquiler alquiler;

        do {
            menu();
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    // agregar barco comun
                    alquiler = new Alquiler();
                    alquiler.crearAlquiler(Barcos.BARCO);
                    alquileres.add(alquiler);
                    break;
                case 2:
                    // velero
                    alquiler = new Alquiler();
                    alquiler.crearAlquiler(Barcos.VELERO);
                    alquileres.add(alquiler);
                    break;
                case 3:
                    // motor
                    alquiler = new Alquiler();
                    alquiler.crearAlquiler(Barcos.AMOTOR);
                    alquileres.add(alquiler);
                    break;
                case 4:
                    // yate
                    alquiler = new Alquiler();
                    alquiler.crearAlquiler(Barcos.YATE);
                    alquileres.add(alquiler);
                    break;
                case 5:
                    // mostrar todos los alquileres
                    for (Alquiler alquilerAux : alquileres) {
                        System.out.println(" \n -------------------- \n");
                        alquilerAux.mostrarAlquiler();
                    }
                    break;
                case 6:
                    // mostrar todos los alquileres
                    for (Alquiler alquilerAux : alquileres) {
                        System.out.println(" \n -------------------- \n");
                        alquilerAux.alquiler();
                    }
                    break;
                case 7:
                    // mostrar todos los barcos
                    for (Alquiler alquilerAux : alquileres) {
                        System.out.println(" \n -------------------- \n");
                        alquilerAux.barco.mostrarBarco();
                    }
                    break;
                case 0:
                    System.out.println(" ¡Hasta luego!");
                    exit = false;
                    break;
                default:
                    System.out.println("  -->> La opcion ingresada es incorrecta, intentelo nuevamente.");
                    break;
            }

        } while (exit);

    }

    public static void menu() {

        System.out.println("\n      --->>> Bienvenido al puerto! <<<---\n");

        System.out.println("    Para realizar un alquiler de un amarre, "
                + "ingrese la opcion del tipo de barco que posee.");

        System.out.println("    - 1: Agregar un barco comun."
                + "\n    - 2: Agregar un velero."
                + "\n    - 3: Agregar un barco a motor."
                + "\n    - 4: Agregar un yate de lujo."
                + "\n\n     Si ya agrego su barco, puede ingresar: "
                + "\n    - 5: Mostrar los datos de todos los alquileres."
                + "\n    - 6: Calcular el valor de cada uno de los alquileres."
                + "\n    - 7: Mostrar todos los barcos."
                + "\n    - 0: Salir.\n");
    }
}
