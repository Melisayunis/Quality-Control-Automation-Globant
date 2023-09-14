
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Para cada Alquiler se guarda: el nombre, documento del cliente, 
* la fecha de alquiler, fecha de devolución, la posición del amarre y el barco que lo ocupará.
* 
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.

 */
public class Alquiler {
    protected String nombre;
    protected Integer nroCliente;
    protected LocalDate inicioAlquiler;
    protected LocalDate finAlquiler;
    protected Integer posicionAmarre;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer nroCliente, LocalDate inicioAlquiler, LocalDate finAlquiler, Integer posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.nroCliente = nroCliente;
        this.inicioAlquiler = inicioAlquiler;
        this.finAlquiler = finAlquiler;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
    
    void mostrarAlquiler() {
        System.out.println("    -.Datos del alquiler.-");
        System.out.println(String.format("  * Nombre dueño: %s", this.nombre));
        System.out.println(String.format("  * Numero documento: %s", this.nroCliente));
        System.out.println(String.format("  * Posicion de amarre: %s", this.posicionAmarre));
        System.out.println(String.format("  * Fecha inicio del alquiler: %s", this.inicioAlquiler));
        System.out.println(String.format("  * Fecha fin alquiler: %s", this.finAlquiler.format(DateTimeFormatter.ISO_DATE)));
        printBarco();
    }
    
    void printBarco() {
        Barcos tipoBarco = Barcos.BARCO;
        
        switch (tipoBarco) {
            case BARCO:
                this.barco.mostrarBarco();
                break;
            case VELERO:
                this.barco.mostrarBarco();
                //this.barco = new Velero();
                //this.barco.crearBarco();
                break;
            case AMOTOR:
                this.barco.mostrarBarco();
                //this.barco = new AMotor();
                //this.barco.crearBarco();
                break;
            case YATE:
                this.barco.mostrarBarco();
//                this.barco = new Yate();
//                this.barco.crearBarco();
                break;
            default:
                break;
        }
    }
    
    
    public void crearAlquiler(Barcos tipoBarco) {
        Scanner read = new Scanner(System.in);
        
        System.out.println(" -->> Vamos a registrar sus datos para el alquiler");
        System.out.println(" * Ingrese su nombre: ");
        this.nombre = read.next();
        
        System.out.println(" * Ingrese su documento: ");
        this.nroCliente = read.nextInt();
        
        System.out.println(" * Indique la posicion del amarre: ");
        this.posicionAmarre = read.nextInt();
        
        System.out.println(" * Ingrese la fecha de inicio del alquiler: ");
        this.inicioAlquiler = fecha();
        
        System.out.println(" * Ingrese la fecha de finalizacion del alquiler: ");
        this.finAlquiler = fecha();
        
        switch (tipoBarco) {
            case BARCO:
                this.barco = new Barco();
                this.barco.crearBarco();
                break;
            case VELERO:
                this.barco = new Velero();
                this.barco.crearBarco();
                break;
            case AMOTOR:
                this.barco = new AMotor();
                this.barco.crearBarco();
                break;
            case YATE:
                this.barco = new Yate();
                this.barco.crearBarco();
                break;
            default:
                break;
        }
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
    
    /*
    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
        alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
        multiplicando por 10 los metros de eslora).
        En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
        sumándole el atributo particular de cada barco. 
    
        En los veleros se suma el número de mástiles,
        en los barcos a motor se le suma la potencia en CV y 
        en los yates se suma la potencia en CV y el número de camarotes.
    */
    public long alquiler() {
        long alquiler = diasOcupacion() * valorModulo();
        System.out.println(String.format("  ---> El alquiler del barco %s es de: %s", this.barco.matricula, alquiler));
        
        return alquiler;
    }
    
    private long diasOcupacion() {
        return DAYS.between(this.inicioAlquiler, this.finAlquiler);
    }
    
    private int valorModulo() {
        int modulo = this.barco.eslora * 10;

        if (this.barco instanceof Velero) {
            Velero velero = (Velero) this.barco;
            modulo += velero.nroMastiles;
            
        } else if (this.barco instanceof AMotor) {
            AMotor aMotor = (AMotor) this.barco;
            modulo += aMotor.potencia;
            
        } else if (this.barco instanceof Yate) {
            Yate yate = (Yate) this.barco;
            modulo += yate.potencia + yate.nroCamarotes;
        }
        
        return modulo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(Integer nroCliente) {
        this.nroCliente = nroCliente;
    }

    public LocalDate getInicioAlquiler() {
        return inicioAlquiler;
    }

    public void setInicioAlquiler(LocalDate inicioAlquiler) {
        this.inicioAlquiler = inicioAlquiler;
    }

    public LocalDate getFinAlquiler() {
        return finAlquiler;
    }

    public void setFinAlquiler(LocalDate finAlquiler) {
        this.finAlquiler = finAlquiler;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    
}
