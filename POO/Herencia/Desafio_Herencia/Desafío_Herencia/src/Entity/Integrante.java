/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.time.LocalDate;
import java.util.Scanner;

/*
De cada integrante familiar se deben registrar los siguientes datos:
    Numero de orden (Cada integrante tiene un numero de orden)
    Apellido
    Nombre
    Fecha de nacimiento
    DNI
    Sexo
    Vinculo (Si es Madre, Padre, Hijo/a, Abuelo/a).

Cada integrante, puede tener o no, una relación con alguna de las siguientes clases (usar la relación que
corresponda):
    Clase Problema de salud
    Clase Abordaje Nutricional
*/

public abstract class Integrante {

    protected String nombre;
    protected String apellido;
    protected String sexo;
    protected String vinculo;
    protected Integer dni;
    protected Integer numOrden;
    protected LocalDate fechaNacimiento;
    
    protected ProblemaSalud problemaSalud;
    protected AbordajeNutricional abordajeNutricional;

    public Integrante() {
    }

    public Integrante(String nombre, String apellido, String sexo, String vinculo, Integer dni, Integer numOrden, LocalDate fechaNacimiento, ProblemaSalud problemaSalud, AbordajeNutricional abordajeNutricional) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.vinculo = vinculo;
        this.dni = dni;
        this.numOrden = numOrden;
        this.fechaNacimiento = fechaNacimiento;
        this.problemaSalud = problemaSalud;
        this.abordajeNutricional = abordajeNutricional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public Integer getDNI() {
        return dni;
    }

    public void setDNI(Integer DNI) {
        this.dni = DNI;
    }

    public Integer getNroOrden() {
        return numOrden;
    }

    public void setNroOrden(Integer numOrden) {
        this.numOrden = numOrden;
    }

    public LocalDate getFechaNac() {
        return fechaNacimiento;
    }

    public void setFechaNac(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ProblemaSalud getSalud() {
        return problemaSalud;
    }

    public void setSalud(ProblemaSalud problemaSalud) {
        this.problemaSalud = problemaSalud;
    }

    public AbordajeNutricional getNutricion() {
        return abordajeNutricional;
    }

    public void setNutricion(AbordajeNutricional abordajeNutricional) {
        this.abordajeNutricional = abordajeNutricional;
    }

    @Override
    public String toString() {
        return "Integrante{" + "nombre=" + nombre + ", Apellido=" + apellido + ", sexo=" + sexo + ", vinculo=" + vinculo + ", DNI=" + dni + ", nroOrden=" + numOrden + ", fechaNac=" + fechaNacimiento + '}';
    }

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    
    public Integrante crearIntegrante() {
        ProblemaSalud problemaSalud = null;
        AbordajeNutricional abordajeNutricional = null;
        
        Integrante integrante = null;
        
        System.out.println(" --> Nombre: ");
        integrante.setNombre(read.next());
        
        System.out.println(" --> Apellido: ");
        integrante.setApellido(read.next());
        
        System.out.println(" --> Sexo: ");
        integrante.setSexo(read.next());
        
        System.out.println(" --> DNI: ");
        integrante.setDNI(read.nextInt());
        
        System.out.println(" --> Vinculo: ");
        integrante.setVinculo(read.next());
        
        System.out.println(" --> Fecha de Nacimiento: ");
        integrante.setFechaNac(fechaNacimiento());
        
        System.out.println(" --> Numero de orden: ");
        integrante.setNroOrden(read.nextInt());
        
        System.out.println(" --> Posee algun problema de salud? \n 1: Si - 2: No");
        int tieneProglemaSalud = read.nextInt();
        if (tieneProglemaSalud == 1) {
            problemaSalud = new ProblemaSalud();
            
            // crear el problema de salud
            integrante.setSalud(problemaSalud);
        } 
        
        System.out.println(" --> Posee algun abordaje nutricional? \n 1: Si - 2: No");
        int tieneAbordajeNutricional = read.nextInt();
        if (tieneAbordajeNutricional == 1) {
            abordajeNutricional = new AbordajeNutricional();
            
            // crear el abordaje nutricional
            integrante.setNutricion(abordajeNutricional);
        }
        
        System.out.println(" --> Integrante completo, muchas gracias!");

        return integrante;
    }
    
    private LocalDate fechaNacimiento() {

        System.out.println(" - Dia:");
        int dia = read.nextInt();
        System.out.println(" - Mes:");
        int mes = read.nextInt();
        System.out.println(" - Año:");
        int anio = read.nextInt();
        
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        
        return fecha;
    }
}
