/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/*
Se deben guardar los siguientes datos:
    N° de dormitorios
    Tipo de Paredes (pueden ser alguna de estas opciones: Material, madera, Lata, otros)
    Tipo de piso (pueden ser alguna de estas opciones: Mosaico, cemento, tierra, otros)
    Iluminación (verdadero o falso de si tiene o no tiene iluminacion electrica)
*/
public class InfoVivienda {

    protected int numDormitorios;
    protected String tipoParedes;
    protected String tipoPiso;
    protected boolean tieneIluminacion;
    
    protected Familia familia;

    public InfoVivienda() {
    }

    public InfoVivienda(int numDormitorios, String tipoParedes, String tipoPiso, boolean tieneIluminacion) {
        this.numDormitorios = numDormitorios;
        this.tipoParedes = tipoParedes;
        this.tipoPiso = tipoPiso;
        this.tieneIluminacion = tieneIluminacion;
    }

    public int getNroDormitorio() {
        return numDormitorios;
    }

    public void setNroDormitorio(int numDormitorios) {
        this.numDormitorios = numDormitorios;
    }

    public String getTipoParedes() {
        return tipoParedes;
    }

    public void setTipoParedes(String tipoParedes) {
        this.tipoParedes = tipoParedes;
    }

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public boolean isIluminacion() {
        return tieneIluminacion;
    }

    public void setIluminacion(boolean tieneIluminacion) {
        this.tieneIluminacion = tieneIluminacion;
    }

    @Override
    public String toString() {
        return "InfoVivienda{" + "numDormitorios=" + numDormitorios + ", tipoParedes=" + tipoParedes + ", tipoPiso=" + tipoPiso + ", tieneIluminacion=" + tieneIluminacion + '}';
    }

}
