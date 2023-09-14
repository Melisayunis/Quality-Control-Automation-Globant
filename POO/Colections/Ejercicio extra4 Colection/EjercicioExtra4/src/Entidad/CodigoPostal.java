/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class CodigoPostal {
    private String name;
    private int cp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public CodigoPostal(String name, int cp) {
        this.name = name;
        this.cp = cp;
    }

    public CodigoPostal() {
    }
    
    
    
}
