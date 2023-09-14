
import java.time.LocalDate;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 * 
 * * Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
        • Número de mástiles para veleros.
        • Potencia en CV para barcos a motor.
        • Potencia en CV y número de camarotes para yates de lujo.
 */
public class Barco {
    protected String matricula;
    protected Integer eslora;
    protected LocalDate anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, LocalDate añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = añoFabricacion;
    }

    public void crearBarco() {
        Scanner read = new Scanner(System.in);
        
        System.out.println("    * Ingrese la informacion del barco.");
        
        System.out.println(" -> Ingrese la matricula: ");
        this.matricula = read.next();
        
        System.out.println(" -> Ingrese la eslora: ");
        this.eslora = read.nextInt();
        
        System.out.println(" -> Ingrese el año de fabricacion: ");
        this.anioFabricacion = fecha();
    }
    
    public void mostrarBarco() {
        System.out.println("\n    -->> Barco <<--");
        System.out.println(String.format("  * Matricula: %s", this.matricula));
        System.out.println(String.format("  * Eslora: %s", this.eslora));
        System.out.println(String.format("  * Año de fabricacion: %s", this.anioFabricacion));
    }
    
    
    private LocalDate fecha() {
        Scanner read = new Scanner(System.in);
        
        System.out.println(" - Ingrese el día:");
        int dia = read.nextInt();
        
        System.out.println(" - Ingrese el mes: ");
        int mes = read.nextInt();
        
        System.out.println(" - Ingrese el año: ");
        int anio = read.nextInt();
        
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        return fecha;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAñoFabricacion() {
        return anioFabricacion;
    }

    public void setAñoFabricacion(LocalDate añoFabricacion) {
        this.anioFabricacion = añoFabricacion;
    }
 
}
