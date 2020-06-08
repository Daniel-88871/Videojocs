package Simon;

public class Lanzar {

    Juego juego1 = new Juego();

    public void lanzar() {
        darBienvenida();
        juego1.pedirNumeroJugadores();

        juego1.seguirJugando = true;

        while (juego1.seguirJugando) {
            juego1.simonDice();
            juego1.jugadorResponde();
            juego1.comprobarRespuesta();
            juego1.pasarTurno();
            juego1.comprobarFinPartida();
        }
    }
    void darBienvenida() {
        System.out.println("BIENVENIDO AL SIMON DICE");
    }
}
