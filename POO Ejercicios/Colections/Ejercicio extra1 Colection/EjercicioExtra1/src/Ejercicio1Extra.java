
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Diseñar un programa que lea una serie de valores numéricos enteros desde el
 * teclado y los guarde en un ArrayList de tipo Integer. La lectura de números
 * termina cuando se introduzca el valor -99. Este valor no se guarda en el
 * ArrayList. A continuación, el programa mostrará por pantalla el número de
 * valores que se han leído, su suma y su media (promedio).
 */
public class Ejercicio1Extra {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        boolean exit = true;
        int suma = 0, num;

        do {
            System.out.println("    -> Ingrese un numero: ");
            num = read.nextInt();

            if (num == (-99)) {
                exit = false;
            } else {
                suma += num;
                lista.add(num);
            }
        } while (exit);

        System.out.println("    -> Los numeros ingresados fueron: ");
        for (Integer element : lista) {
            System.out.println(" * " + element);
        }
        System.out.println("    -> La suma de los elementos es: " + suma
                + "\n    -> El promedio de los elementos es: " + (suma / lista.size()));
    }

}
