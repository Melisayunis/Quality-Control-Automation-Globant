
import java.time.LocalDate;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
• Potencia en CV para barcos a motor.
 */
public class AMotor extends Barco{
    protected Integer potencia;

    public AMotor() {
    }

    public AMotor(String matricula, Integer eslora, LocalDate añoFabricacion, Integer potencia) {
        super(matricula, eslora, añoFabricacion);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public void crearBarco() {
        Scanner read = new Scanner(System.in);
        
        super.crearBarco();
        
        System.out.println(" -> Ingrese la potencia de barco: ");
        this.potencia = read.nextInt();
    }
    
    @Override
    public void mostrarBarco() {
        super.mostrarBarco();
        System.out.println(String.format("  * Potencia: %s", this.potencia));
    }
}
