/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscondionales;
import java.util.Scanner;

public class EjerciciosVectoresMatrices {
    /*
    Crea una aplicación que a través de una función nos convierta una cantidad 
    de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
    yenes o libras. 
    La función tendrá como parámetros, la cantidad de euros y la 
    moneda a converir que será una cadena, este no devolverá ningún valor y 
    mostrará un mensaje indicando el cambio (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros: ");
        int euros = leer.nextInt();
        
        System.out.println("Ingrese a que desea convertir los euros: ");
        System.out.println("libras - dolares - yenes.");
        String opcion = read.nextLine();
        
        Conversion(euros, opcion);
    }
    
    public static void Conversion(int euros, String cambio){
        
        switch (cambio.toLowerCase()){
            case "libras":
                System.out.println(euros + " euros son: " + (euros * 0.86) +  " libras.");
                break;
            case "dolares":
                System.out.println(euros + " euros son: " + (euros * 1.28611) +  " euros.");
                break;
            case "yenes":
                System.out.println(euros + " euros son: " + (euros * 129.852) +  " yenes.");
                break;
            default:
                System.out.println("La opcion de cambio ingresada es incorrecta.");
        }
    }
}
