
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
* 
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
public class Televisor extends Electrodomestico{
    private Integer resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
    }

    public Televisor(Integer resolucion, boolean sintonizadorTDT, Double precio, String color, String consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /*
    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
        padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
        los atributos del televisor.
    */
    public void crearTelevisor(){
        Scanner read = new Scanner(System.in);
        Electrodomestico electro = new Electrodomestico();
        
        System.out.println("\n    -----> Ingrese los datos del televisor a adquirir");
        electro.crearElectrodomestico();
        
        System.out.println(" -> Ingrese la resolucion del televisor: ");
        this.resolucion = read.nextInt();
        
        System.out.println(" -> Ingrese si el televisor posee sintonizador TDT 1:Si - 2:NO");
        int hasTDT = read.nextInt();
        
        if (hasTDT == 1) {
            this.sintonizadorTDT = true;
        } else if( hasTDT == 2) {
            this.sintonizadorTDT = false;
        }
        
        this.precio = electro.getPrecio();
        this.color = electro.getColor();
        this.consumoEnergetico = electro.getConsumoEnergetico();
        this.peso = electro.getPeso();
    }
    
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
        funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
        incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
        $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
        también deben afectar al precio.
    */
    @Override
    public void precioFinal() {
        super.precioFinal();
        
        if(resolucion > 40) {
            this.precio *= 1.3;
        }
        
        if (sintonizadorTDT) {
            this.precio += 500;
        }

    }
    
    public void mostrarTelevisor() {
        System.out.println("    ~.~ Televisor ~.~ ");
        System.out.println(" - Color: " + this.color
        + "\n - Peso: " + this.peso
        + "\n - Consumo Energetico: " + this.consumoEnergetico
        + "\n - Precio: " + this.precio
        + "\n - Resolucion: " + this.resolucion
        + "\n - Sintonizador TDT: " + this.sintonizadorTDT);
    }
    
    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
}
