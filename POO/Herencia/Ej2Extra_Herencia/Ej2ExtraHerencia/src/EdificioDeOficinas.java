/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
* 
* De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
public class EdificioDeOficinas extends Edificio {
    private int nroOficinas;
    private int cantPersonasPorOficina;
    private int nroPisos;

    public EdificioDeOficinas(int nroOficinas, int cantPersonasPorOficina, int nroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.nroPisos = nroPisos;
    }
    
    @Override
    public double calcularSuperficie() {
       // Superficie Total = 2 * (Largo * Ancho + Largo * Alto + Ancho * Alto)
       double superficie = (( this.getAlto() * this.getAncho() 
                   + this.getAlto() * this.getLargo() 
                   + this.getAncho() * this.getLargo() ) * 2) * this.nroPisos ;
       
       return superficie;
    }

    @Override
    public double calcularVolumen() {
        // Volumen = Largo * Ancho * Alto
        double volumen = (this.getAlto() * this.getAncho() * this.getLargo()) * this.nroPisos;
        
        return volumen;
    }
    
    public void cantPersonas() {
        // mostrar cant personas en un piso y en todo el edificio
        int cantTodoEdificio = this.cantPersonasPorOficina * this.nroOficinas;
        int cantPersonasPiso = this.cantPersonasPorOficina ;
        
        System.out.println(String.format(" -> En todo el edificio hay %s personas.", cantTodoEdificio));
        System.out.println(String.format(" -> En el piso entran %s personas.", cantPersonasPiso));
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getCantPersonasPorOficina() {
        return cantPersonasPorOficina;
    }

    public void setCantPersonasPorOficina(int cantPersonasPorOficina) {
        this.cantPersonasPorOficina = cantPersonasPorOficina;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }


}
