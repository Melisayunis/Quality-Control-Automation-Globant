/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Alquiler;
import java.time.LocalDate;
import java.util.Scanner;

public class AlquilerServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler() {
        System.out.println("\n" + "----> Ingrese el titulo de la pelicula alquilada: ");
        String titulo = leer.nextLine();

        System.out.println("    -> Ingresa la fecha de inicio del alquiler (día, mes y año): ");
        LocalDate FechaInicio = cargarFecha();
        LocalDate fechaFin;

        do {
            // La fecha de devolucion debe ser posterior a la de inicio del alquiler
            System.out.println("    -> Ingresa la fecha de devolución de la pelicula (día, mes y año): ");
            fechaFin = cargarFecha();
        } while (FechaInicio.isAfter(fechaFin));

        System.out.println("    -> Ingrese el precio del alquiler: ");
        int Precio = leer.nextInt();
        leer.nextLine();
        
        return new Alquiler(titulo, FechaInicio, fechaFin, Precio);
    }
    
    public void verAlquiler(Alquiler[] alquileres) {
        for (int i = 0; i < alquileres.length; i++) {
            System.out.println("\n" + "La información de la pelicula alquilada N°" + (i+1) + " es: ");
            System.out.println("Nombre: " + alquileres[i].getNombre());
            System.out.println("Precio: " + alquileres[i].getPrecio());
            System.out.println("Fecha inicio alquiler: " + alquileres[i].getFechaInicio());
            System.out.println("Fecha devolución:" + alquileres[i].getFechaFin());
        }
    }

    public void buscarFecha(Alquiler[] alquileres) {
        boolean isNotAlq = false;
        System.out.println("\n" + "Ingresar fecha de inicio de alquiler (día, mes y año): ");
        LocalDate FechaIni = cargarFecha();

        for (Alquiler alq : alquileres) {
            if (alq.getFechaInicio().compareTo(FechaIni) == 0) {
                System.out.println("La pelicula " + alq.toString() + " esta alquilada.");
                isNotAlq = true;
            }
        }

        if (!isNotAlq) {
            System.out.println("No hay ningun alquiler en esa fecha.");
        }
    }

    public void calcularIngresoTotal(Alquiler[] alquileres) {
        // Calcular el ingreso total del servicio (El alquiler cuesta $10, por 
        // 3 días. Por cada día extra, se aumenta un 10% de interés.)
        double total = 0;
        int diasConInteres, diasAlquilado;
        
        for (Alquiler alquiler : alquileres) {
            // diaFinal - diaInicial = diasAlquilados
            // diasAlquilados - 3 = dias con interes
            diasAlquilado = alquiler.getFechaFin().getDayOfMonth() - alquiler.getFechaInicio().getDayOfMonth();
            diasConInteres = diasAlquilado - 3;
            System.out.println("dias con interes: " + diasConInteres +
                    "\n dias alquilados " + diasAlquilado);
            
            if (diasConInteres > 0) { // ya tiene descontado los 3 dias con precio fijo $10
                total += 10 + (diasConInteres * 10) * alquiler.getPrecio() / 100;
            } else {
                total += alquiler.getPrecio();
            }
        } 
        
        System.out.println("El ingreso total por los alquileres es: " + total);
    }
    
    private LocalDate cargarFecha() {
        boolean isOk;
        int dia, mes, anio;
        
        do {
            System.out.println("Día:");
            dia = leer.nextInt();
            System.out.println("Mes:");
            mes = leer.nextInt();
            isOk = dateOK(dia, mes);
            
            if (isOk == false){
                System.out.println("Los datos ingresados son erroneos, ingreselos nuevamente: ");
            }
        } while (isOk == false);
        
        System.out.println("Año:");
        anio = leer.nextInt();
        
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        
        return fecha;
    }
    
    private boolean dateOK(int dia, int mes) {
        // verifica que el dia y el mes sean correctos
        boolean isOk = false;

        if (dia > 0 && mes > 0) {
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
                isOk = true;
            } else if (mes == 2 && dia <= 28) {
                isOk = true;
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                isOk = true;
            }
        }

        return isOk;
    }
}
