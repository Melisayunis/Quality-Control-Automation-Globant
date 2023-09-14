
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
* 
* Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
* 
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
* 
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
* 
* • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
 */
public class Electrodomestico {
    protected Double precio;
    protected String color;
    protected String consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, String consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    /*
    * • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
        electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
        precio se le da un valor base de $1000.
    */
    protected void crearElectrodomestico() {
        Scanner read = new Scanner(System.in);
        
        System.out.println(" -> Ingrese el color del electrodomestico: ");
        String color = read.next();
        
        System.out.println(" -> Ingrese el consumo energetico del electrodomestico (A, B, C, D, E, F): ");
        char consumoEnergetico = read.next().charAt(0);
        
        System.out.println(" -> Ingrese el peso del electrodomestico: ");
        Double peso = read.nextDouble();
        
        //Electrodomestico electrodomesticoNew = 
        //        new Electrodomestico(1000, comprobarColor(color), comprobarConsmoEnergetico(consumoEnergetico), peso);
        
        comprobarColor(color);
        comprobarConsmoEnergetico(consumoEnergetico);
        this.precio = 1000.0;
        this.peso = peso;
    }
    
    /*
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
        precio. Esta es la lista de precios:
    */
    public void precioFinal() {
        
        switch(this.consumoEnergetico) {
            case "A":
                this.precio += 1000;
                break;
            case "B":
                this.precio += 800;
                break;
            case "C":
                this.precio += 600;
                break;
            case "D":
                this.precio += 500;
                break;
            case "E":
                this.precio += 300;
                break;
            case "F":
                this.precio += 100;
                break;
            default:
                System.out.println("No deberia entrar aca..");
                break;
        }
        
        if (this.peso >= 1 && this.peso <= 19) {
            this.precio += 100;
        } else if(this.peso >= 20 && this.peso <= 49) {
            this.precio += 500;
        }  else if(this.peso >= 50 && this.peso <= 79) {
            this.precio += 800;
        } else if (this.peso >= 80) {
            this.precio += 1000;
        }
    }
    
    /* peso
    Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
    */
    
    /*
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
        sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
        objeto y no será visible.
    */
    private void comprobarConsmoEnergetico(char letra) {
        ConsumoEnergetico letraConsumo;
        String letraString = letra + "";
        this.consumoEnergetico = "F";
        
        for (ConsumoEnergetico consumo : ConsumoEnergetico.values()){
            if (consumo.name().equals(letraString.toUpperCase())) {
                this.consumoEnergetico = consumo.name();
                break;
            }
        }
    }
    
    /*
    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
        usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
        blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
        minúsculas. Este método se invocará al crear el objeto y no será visible.
    */
    private void comprobarColor(String colorUsuario) {
        Color colorEnum;
        this.color = "BLANCO";

        for (Color color : Color.values()) {
            if (colorUsuario.toUpperCase().equals(color.name())) {
                this.color = color.name();
                break;
            }
        }
    }
    
    
    
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
}
