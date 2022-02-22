package launcher;


import smellytrivial.Game;

import java.util.Random;

public class GameLauncher {

    private static boolean ganador;

    public static void main(String[] args) {

        try{
        Game juego = new Game();

        juego.agregar("Maria");
        juego.agregar("Juan");
        juego.agregar("Antonio");

        Random rand = new Random();
        if (juego.esJugable()) {
            do {

                juego.tirarDado(rand.nextInt(5) + 1);

                if (rand.nextInt(9) == 7) {
                    ganador = juego.fueRespuestaCorrecta();
                } else {
                    ganador = juego.respuestaIncorrecta();
                }


            } while (ganador);
        } else {
            System.out.println("Debe haber un minimo de dos jugadores");
        }}catch (ArrayIndexOutOfBoundsException e){
            System.out.println();
            System.out.println("Debe haber un maximo de 6 jugadores");
        }
    }
}
