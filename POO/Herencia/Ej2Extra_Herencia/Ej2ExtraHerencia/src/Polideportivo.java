/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
* Volumen = Largo * Ancho * Alto
* Superficie Total = 2 * (Largo * Ancho + Largo * Alto + Ancho * Alto)
 */
public class Polideportivo extends Edificio {
    
    private String name;
    private Instalacion tipoInstalacion;

    public Polideportivo(String name, Instalacion tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.name = name;
        this.tipoInstalacion = tipoInstalacion;
    }
    
    @Override
    public double calcularSuperficie() {
        // Superficie Total = 2 * (Largo * Ancho + Largo * Alto + Ancho * Alto)
       double superficie = 0;
       
       if (this.tipoInstalacion.name().equals(Instalacion.TECHADO.name())) {
           superficie = ( this.getAlto() * this.getAncho() 
                   + this.getAlto() * this.getLargo() 
                   + this.getAncho() * this.getLargo() ) * 2 ;
       } else if (this.tipoInstalacion.name().equals(Instalacion.ABIERTO.name())) {
           superficie = ( this.getAlto() * this.getAncho() 
                   + this.getAlto() * this.getLargo()) * 2 
                   + this.getAncho() * this.getLargo();
       }         
       
       return superficie;
    }

    @Override
    public double calcularVolumen() {
        // Volumen = Largo * Ancho * Alto
        
        return this.getAlto() * this.getAncho() * this.getLargo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instalacion getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(Instalacion tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    
}
