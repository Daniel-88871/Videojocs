package Simon;

import java.util.Random;
import java.util.Scanner;

public class Juego {

    Scanner scanner = new Scanner(System.in);
    String mem = "";
    String respuesta;
    int turno = 1;
    int numeroJugadores;
    boolean seguirJugando;

    void pasarTurno() {
        turno++;

        if (turno > numeroJugadores){
            turno = 1;
        }
    }
    void comprobarFinPartida() {
        if (numeroJugadores == 0) {
            System.out.println("FIN PARTIDA");
            seguirJugando = false;
        }
    }
    void jugadorResponde() {
        System.out.println("Jugador " + turno + ":");
        respuesta = scanner.nextLine();
    }
    void comprobarRespuesta() {
        if (respuesta.equals(mem)) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("ELIMINADO");
            numeroJugadores--;
        }
    }
    void simonDice() {
        System.out.println("Simon dice:");
        Random random = new Random();

        char aleatorio = (char) (random.nextInt(4) + 65);

        mem += aleatorio;

        System.out.println(mem);
        System.out.println("(press any key...)");

        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }
    void pedirNumeroJugadores() {
        System.out.println("Jugadores:");

        numeroJugadores = scanner.nextInt();
        scanner.nextLine();
    }
}