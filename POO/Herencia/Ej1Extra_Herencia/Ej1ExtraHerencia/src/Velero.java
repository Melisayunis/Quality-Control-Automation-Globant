
import java.time.LocalDate;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
• Número de mástiles para veleros.
 */
public class Velero extends Barco{
    protected Integer nroMastiles; 
    
    public Velero(){
        
    }

    public Velero(Integer nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    public Velero(Integer nroMastiles, String matricula, Integer eslora, LocalDate añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.nroMastiles = nroMastiles;
    }

    @Override
    public void crearBarco() {
        Scanner read = new Scanner(System.in);
        
        super.crearBarco();
        
        System.out.println(" -> Ingrese el numero de mastiles del velero: ");
        this.nroMastiles = read.nextInt();
    }
    
    @Override
    public void mostrarBarco() {
        super.mostrarBarco();
        System.out.println(String.format("  * Numero de mastiles: %s", this.nroMastiles));
    }
    
    
    public Integer getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(Integer nroMastiles) {
        this.nroMastiles = nroMastiles;
    }
    
    
}
