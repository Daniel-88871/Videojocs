package Ahorcado;

public class Lanzar {

    Juego juego1 = new Juego();

    public void lanzar() {
        darBienvenida();
        juego1.palabraAleatoria();
        juego1.iniciarPalabra();
        juego1.mostrarJuego();
        juego1.juego();
    }
    void darBienvenida() {
        System.out.println("BIENVENIDO AL AHORCADO");
    }
}

