package launcher;


import smellytrivial.Game;

import java.util.Random;

public class GameLauncher {

    private static boolean noGanador;

    public static void main(String[] args) {

        try{
        Game juego = new Game();

        juego.agregar("Maria");
        juego.agregar("Juan");
        juego.agregar("Antonio");
        juego.agregar("Maria");
        juego.agregar("Juan");
        juego.agregar("Juan");

        Random rand = new Random();
        if (juego.esJugable()) {
            do {

                juego.tirarDado(rand.nextInt(5) + 1);

                if (rand.nextInt(9) == 7) {
                    noGanador = juego.respuestaIncorrecta();
                } else {
                    noGanador = juego.fueRespuestaCorrecta();
                }


            } while (noGanador);
        } else {
            System.out.println("Debe haber un minimo de dos jugadores");
        }}catch (ArrayIndexOutOfBoundsException e){
            System.out.println();
            System.out.println("Debe haber un maximo de 6 jugadores");
        }
    }
}
