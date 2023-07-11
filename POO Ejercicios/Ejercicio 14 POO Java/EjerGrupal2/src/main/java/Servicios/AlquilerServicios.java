/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Alquiler;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Mafe
 */
public class AlquilerServicios {

    Scanner leer = new Scanner(System.in);

    public Alquiler crearAlquiler() {

        System.out.println("Titulo de la pelicula alquilada");
        String titulo = leer.nextLine();

        System.out.println("Ingresa la fecha de inicio");
        Date FechaInicio = new Date(leer.nextInt(), leer.nextInt(), leer.nextInt());
        System.out.println("Ingresa la fecha de fin");
        Date FechaFin = new Date(leer.nextInt(), leer.nextInt(), leer.nextInt());

        System.out.println("Precio");
        int Precio = leer.nextInt();
        leer.nextLine();
        return new Alquiler(titulo, FechaInicio, FechaFin, Precio);

    }

    public void verAlquiler(Alquiler[] A1) {
        for (int i = 0; i < A1.length; i++) {
            System.out.println("La pelicula alquilada " + i);
            System.out.println("nombre: " + A1[i].getNombre());
            System.out.println("precio: " + A1[i].getPrecio());
            System.out.println("Fecha inicio: " + A1[i].getFechaInicio());
            System.out.println("Fecha fin " + A1[i].getFechaFin());

        }
    }

    public void buscarFecha(Alquiler[] A1) {

        System.out.println("Ingresar fecha de inicio");
        Date FechaIni = new Date(leer.nextInt(), leer.nextInt(), leer.nextInt());

        boolean tes = false;

        for (int i = 0; i < A1.length; i++) {
            if (A1[i].getFechaInicio().compareTo(FechaIni) == 0) {
                System.out.println(A1[i].toString());
                System.out.println("La pelicula esta alquilada");
                tes = true;

            }
        }

        if (!tes) {
            System.out.println("No hay ningun alquiler en esa fecha");
        }

    }

    public double calcularIngresoTotal(Alquiler[] alquileres) {
        double ingresoTotal = 0;

        for (Alquiler alquiler : alquileres) {
            int diasAlquilados = (int) ((alquiler.getFechaFin().getDate() - alquiler.getFechaInicio().getDate()));

            if (diasAlquilados > 3) {
                double precioBase = 10;
                double interes = 0.1;

                ingresoTotal += (diasAlquilados - 3) * 0.1 + precioBase;

//                for (int i = 4; i <= diasAlquilados; i++) {
//                    precioBase *= (1.0 + interes);
//                }
            } else {
                ingresoTotal = 10;
            }
        }

        return ingresoTotal;
    }
}
