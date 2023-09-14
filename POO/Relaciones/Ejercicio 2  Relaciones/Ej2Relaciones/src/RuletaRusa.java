
import Entidad.Game;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**

 */
public class RuletaRusa {

    public static void main(String[] args) {
        
        Game game = new Game();
        
        game.llenarJuego();
        game.showGame();
        System.out.println("\n  *** Que comience el juego ***");
        
        game.ronda();
        game.showGame();
        
    }
    
}
