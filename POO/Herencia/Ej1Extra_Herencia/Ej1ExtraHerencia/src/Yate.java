
import java.time.LocalDate;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
• Potencia en CV y número de camarotes para yates de lujo.
 */
public class Yate extends AMotor{
    protected Integer nroCamarotes;

    public Yate() {
    }

    public Yate(Integer nroCamarotes, String matricula, Integer eslora, LocalDate añoFabricacion, Integer potencia) {
        super(matricula, eslora, añoFabricacion, potencia);
        this.nroCamarotes = nroCamarotes;
    }

    public Integer getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(Integer nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public void crearBarco() {
        Scanner read = new Scanner(System.in);
        
        super.crearBarco(); // aca llamo al metodo del padre
        
        System.out.println(" -> Ingrese el numero de camarotes del yate: ");
        this.nroCamarotes = read.nextInt();
    }
    
    @Override
    public void mostrarBarco() {
        super.mostrarBarco();
        System.out.println(String.format("  * Numero de camarotes: %s", this.nroCamarotes));
    }
}
