/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service;

import Entity.Integrante;
import Entity.Ninio;
import java.util.Scanner;

public class NinioService implements IntegranteServicioInterfaz {
     Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    @Override
    public Integrante crearIntegrante() {
       Ninio ninio = new Ninio();
       
       return ninio.crearIntegrante();
    }

}
