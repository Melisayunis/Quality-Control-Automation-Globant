/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Adulto;
import Entity.Integrante;
import java.util.Scanner;

public class AdultoService implements IntegranteServicioInterfaz {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    @Override
    public Integrante crearIntegrante() {
        Adulto adulto = new Adulto();
        adulto.crearIntegrante();

        System.out.println(" --> Esta estudiando?: \n 1: Si - 2: No");
        int estaEstudiando = read.nextInt();
        if (estaEstudiando == 1) {
            adulto.setEstudio(true);
        } else {
            adulto.setEstudio(false);
        }

        System.out.println(" --> Tiene trabajo formal?: \n 1: Si - 2: No");
        int tieneTrabajo = read.nextInt();
        if (tieneTrabajo == 1) {
            adulto.setTrabForm(true);
        } else {
            adulto.setTrabForm(false);
        }

        System.out.println(" --> Tiene obra social: \n 1: Si - 2: No");
        int tieneObraSocial = read.nextInt();
        if (tieneObraSocial == 1) {
            adulto.setObraSocial(true);
        } else {
            adulto.setObraSocial(false);
        }

        System.out.println(" --> Practica algun deporte: \n 1: Si - 2: No");
        int haceDeporte = read.nextInt();
        if (haceDeporte == 1) {
            adulto.setDeporte(true);
        } else {
            adulto.setDeporte(false);
        }

        return adulto;
    }

}
