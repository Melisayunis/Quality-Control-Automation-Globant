
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Los métodos que se implementara serán:
• Método get y set del atributo carga.
* 
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
* 
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
public class Lavadora extends Electrodomestico {
    private Integer carga;

    public Lavadora() {
        super();
    }

    public Lavadora(Integer carga, Double precio, String color, String consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    /*
    • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
        padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
        el atributo propio de la lavadora.
    */
    public void crearLavadora() {
        Scanner read = new Scanner(System.in);
        Electrodomestico electro = new Electrodomestico();
        
        System.out.println("\n    -----> Ingrese los datos de la lavadora a adquirir");
        electro.crearElectrodomestico();
        
        System.out.println(" -> Ingrese la carga de la lavadora: ");
        Integer carga = read.nextInt();
        
        this.carga = carga;
        this.precio = electro.getPrecio();
        this.color = electro.getColor();
        this.consumoEnergetico = electro.getConsumoEnergetico();
        this.peso = electro.getPeso();
    }
        
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
        funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
        carga es menor o igual, no se incrementará el precio. Este método debe llamar al
        método padre y añadir el código necesario. Recuerda que las condiciones que hemos
        visto en la clase Electrodoméstico también deben afectar al precio.
    */
    @Override
    public void precioFinal() {
        super.precioFinal();
        
        if(carga > 30) {
            this.precio += 500;
        } 
    }   
    
    public void mostrarLavadora() {
        System.out.println("     ~.~ Lavadora ~.~");
        System.out.println(" - Color: " + this.color
        + "\n - Peso: " + this.peso
        + "\n - Consumo Energetico: " + this.consumoEnergetico
        + "\n - Precio: " + this.precio
        + "\n - Carga: " + this.carga);
    }
    
    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }



}
