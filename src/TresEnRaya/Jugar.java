package TresEnRaya;

public class Jugar {

    Jugador jugador1 = new Jugador();
    Tablero tablero1 = new Tablero();

    void limpiarpantalla() {
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
        }
    }

    void jugar() {
        for (jugador1.turno = 1; jugador1.jugar; jugador1.turno++) {
            jugador1.casillaJugador();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == jugador1.x && j == jugador1.y) {

                        tablero1.tablero[i][j] = jugador1.jugador;
                    }
                }
            }
            for (int j = 0; j < 3; j++) {
                System.out.print("|");
                for (int k = 0; k < 3; k++) {
                    System.out.print(tablero1.tablero[j][k]);
                    System.out.print("|");
                }
                System.out.println();
            }
            jugador1.comprobarGanador();
            if (jugador1.seguirjugando == 1) {
                limpiarpantalla();
                break;
            }
        }
    }
}
