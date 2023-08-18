/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.

*  Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
* 
* Atributos: marca, precio, modelo, memoriaRam, almacenamiento y codigo.
 */
public class serviceMovil {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Movil cargarCelular() {
        System.out.println("Ingrese la marca del celular: ");
        String marca = read.next();
        
        System.out.println("Ingrese el modelo: ");
        String modelo = read.next();
        
        System.out.println("Ingrese la RAM: ");
        int ram = read.nextInt();
        
        System.out.println("Ingrese el almacenamiento: ");
        int almacenamiento = read.nextInt();
        
        System.out.println("Ingrese el precio: ");
        double precio = read.nextDouble();
        
        Movil newMovil = new Movil(marca, modelo, ram, almacenamiento, precio, ingresarCodigo());
        return newMovil;
    }
    
    public int[] ingresarCodigo(){
        /*
        *  Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
        números de un celular. Para ello, puede utilizarse un bucle repetitivo.
        El atributo código será un arreglo numérico de dimensión 7 (siete) donde 
        cada subíndice alojará un número correspondiente al código. 
        */
        int[] codigo = new int[7];
        System.out.println("Ingrese a continuacio los 7 digitos del codigo del celular:  ");
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Inserte el digito " + (i+1));
            codigo[i] = read.nextInt();
        }
        return codigo;
    }
    
    public void mostrarInfo(Movil movil) {
        System.out.println("El celular posee la siguiente informacion: ");
        System.out.println("* Marca: " + movil.getMarca());
        System.out.println("* Precio: " + movil.getPrecio());
        System.out.println("* Modelo: " + movil.getModelo());
        System.out.println("* Memoria RAM: " + movil.getRam());
        System.out.println("* Almacenamiento: " + movil.getAlmacenamiento());
        System.out.printf("* Codigo: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(movil.getCodigo()[i]);
        }
        System.out.println("");
    }
    
}
