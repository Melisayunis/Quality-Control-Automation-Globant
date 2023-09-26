/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Familia;


public interface FamiliaServiceInterface {
    
    public Familia crearFamilia();
    
    public void mostrarFamilia(Familia familia);
    
    public void eliminarFamilia(Familia familia);
    
    public Familia modificarFamilia(Familia familia);
    
    
}
