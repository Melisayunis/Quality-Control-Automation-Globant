/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

/**
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias.
 */
public class ExtraHotelero  extends Alojamiento {
    protected Boolean esPrivado;
    protected Integer mtCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(Boolean esPrivado, Integer mtCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.mtCuadrados = mtCuadrados;
    }

    public Boolean getEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(Boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public Integer getMtCuadrados() {
        return mtCuadrados;
    }

    public void setMtCuadrados(Integer mtCuadrados) {
        this.mtCuadrados = mtCuadrados;
    }
    
}
