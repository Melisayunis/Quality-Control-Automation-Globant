/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.AdultoMayor;
import Entity.Integrante;
import java.util.Scanner;

public class AdultoMayorService implements IntegranteServicioInterfaz {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    @Override
    public Integrante crearIntegrante() {
        AdultoMayor adultoMayor = new AdultoMayor();
        adultoMayor.crearIntegrante();

        System.out.println(" --> esta jubilado: \n 1: Si - 2: No");
        int tieneTrabajo = read.nextInt();

        if (tieneTrabajo == 1) {
            adultoMayor.setJubilacion(true);
        } else {
            adultoMayor.setJubilacion(false);
        }

        return adultoMayor;
    }

}
