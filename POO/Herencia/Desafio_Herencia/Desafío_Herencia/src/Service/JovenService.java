/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Integrante;
import Entity.Joven;
import java.util.Scanner;

public class JovenService implements IntegranteServicioInterfaz {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    @Override
    public Integrante crearIntegrante() {
        Joven joven = new Joven();
        joven.crearIntegrante();

        System.out.println(" --> Que estudia?: ");
        joven.setEstudio(read.next());

        System.out.println(" --> Practica algun deporte: \n 1: Si - 2: No");
        int haceDeporte = read.nextInt();

        if (haceDeporte == 1) {
            joven.setDeporte(true);
        } else {
            joven.setDeporte(false);
        }

        System.out.println(" --> Tiene trabajo: \n 1: Si - 2: No");
        int tieneTrabajo = read.nextInt();

        if (tieneTrabajo == 1) {
            joven.setTrabajo(true);
        } else {
            joven.setTrabajo(false);
        }

        return joven;
    }

}
