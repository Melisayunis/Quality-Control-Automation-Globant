/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto
 * de Jugadores) y Revolver Métodos: • llenarJuego(ArrayList<Jugador>jugadores,
 * Revolver r): este método recibe los jugadores y el revolver para guardarlos
 * en los atributos del juego. • ronda(): cada ronda consiste en un jugador que
 * se apunta con el revolver de agua y aprieta el gatillo. Sí el revolver tira
 * el agua el jugador se moja y se termina el juego, sino se moja, se pasa al
 * siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar.
 * Al final del juego, se debe mostrar que jugador se mojó. Pensar la lógica
 * necesaria para realizar esto, usando los atributos de la clase Juego.
 */
public class Game {

    private ArrayList<Player> jugadores;
    private WaterStirrer pistola;

    public Game() {
        jugadores = new ArrayList<>();
        pistola = new WaterStirrer();
    }

    public Game(ArrayList<Player> players, WaterStirrer stirrer) {
        this.jugadores = players;
        this.pistola = stirrer;
    }

    public ArrayList<Player> getPlayers() {
        return jugadores;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.jugadores = players;
    }

    public WaterStirrer getStirrer() {
        return pistola;
    }

    public void setStirrer(WaterStirrer stirrer) {
        this.pistola = stirrer;
    }

    /*
    Métodos:
        • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
            y el revolver para guardarlos en los atributos del juego.
        • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
            aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
            moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
            mojar. Al final del juego, se debe mostrar que jugador se mojó.
            
    Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
     */
    public String ronda() {
        int cantJugadores = jugadores.size();
        int jugadorActual = 0;
        int ronda = 1;
        Player jugadorQueDispara;

        // System.out.println("\n Nueva ronda..");
        System.out.println("\n -----*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-----");
        
        while (ronda <= 6) {
            jugadorQueDispara = jugadores.get(jugadorActual);
            System.out.println("\n       -> Ronda: " + ronda);
            System.out.println(" ---> El " + jugadorQueDispara.getUserName() + " va a disparar...");
            boolean isHere = jugadorQueDispara.disparo(pistola, jugadorQueDispara);

            if (isHere) {
                System.out.println("\n        ¡ ¡ ¡ ¡ ¡ A G U A ! ! ! ! !\n");
                System.out.println("         El " + jugadorQueDispara.getUserName() + " ha perdido! :(");
                System.out.println("\n    El juego ah terminado, hasta luego! ");
                System.out.println(" -----*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-----\n");
                return "    Juego finalizado en la ronda " + ronda;
            } 
            if ((pistola.getActualPosition() >= 6)) {
                pistola.setActualPosition(0);
            }

            if (jugadorActual == cantJugadores - 1) {
                // ej: si hay 2 jugadores nomas, la ronda se vuelve a empezar
                jugadorActual = 0;
                
                System.out.println("        ¡ ¡ ¡ ¡ ¡ V A C I O ! ! ! ! ! ");
            } else {
                jugadorActual += 1;
                System.out.println("        ¡ ¡ ¡ ¡ ¡ V A C I O ! ! ! ! ! ");
            }

            ronda += 1;
        }
        return "no deberia llegar aca..";
    }

    public void llenarJuego() {

        System.out.println(" Ingrese cuantos jugadores va a tener el juego (entre 1 a 6)");
        Scanner read = new Scanner(System.in);
        int cantJugadores = read.nextInt();

        if (cantJugadores > 0 && cantJugadores <= 6) {
            cargarJugadores(cantJugadores);
        } else {
            System.out.println(" -> La cantidad de jugares ingresada no es valida, participaran 6 jugadores por defecto.");
            cargarJugadores(6);
        }

        this.pistola = pistola.llenarRevolver();
    }

    private void cargarJugadores(int cantJugadores) {
        Player jugador;

        for (int i = 1; i <= cantJugadores; i++) {
            jugador = new Player();
            jugador.setId(i);
            jugador.setUserName("Jugador " + i);
            jugador.setWet(false);
            jugadores.add(jugador);
        }
    }

    public void showGame() {
        //System.out.println(" Jugadores: ");
        //showPlayers();
        System.out.println(" - Pistola: ");
        this.pistola.showStrirrer();
    }

    private void showPlayers() {
        for (Player jugador : jugadores) {
            jugador.showPlayer();
        }
    }

}
