package TresEnRaya;

import java.util.Scanner;

public class Lanzar {

    Jugar jugar = new Jugar();
    Tablero tablero = new Tablero();

    public void lanzar() {
        darBienvenida();
        tablero.crearTablero();
        jugar.jugar();
    }
    void darBienvenida() {
        System.out.println("BIENVENIDO AL TRES EN RAYA");
    }
}
