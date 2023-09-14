/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 * Clase Jugador: esta clase posee los siguientes atributos: id (representa el
 * número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por
 * ejemplo) y mojado (indica si está mojado o no el jugador). El número de
 * jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está
 * en este rango, por defecto será 6. Métodos: • disparo(Revolver r): el método,
 * recibe el revolver de agua y llama a los métodos de mojar() y
 * siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si
 * el revolver tira el agua, el jugador se moja. El atributo mojado pasa a false
 * y el método devuelve true, sino false.
 */
public class Player {

    private int id;
    private String userName;
    private boolean mojado;

    public Player() {
    }

    public Player(int id, String userName, boolean wet) {
        this.id = id;
        this.userName = userName;
        this.mojado = wet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean getMojado() {
        return mojado;
    }

    public void setWet(boolean wet) {
        this.mojado = wet;
    }

    // Metodos

    public boolean disparo(WaterStirrer pistola, Player jugadorQueDispara) {
        if (pistola.mojar(pistola)) {
            jugadorQueDispara.mojado = true;
            return true;
        }
        pistola.siguienteChorro(pistola);

        return false;
    }

    public void showPlayer() {
        System.out.println(" - ID: " + this.id);
        System.out.println(" - Nombre: " + this.userName
                + "\n - Mojado: " + this.mojado + "\n");
    }

}
