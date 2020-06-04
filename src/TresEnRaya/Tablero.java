package TresEnRaya;

public class Tablero {

    String[][] tablero = new String[3][3];
    String jugador = "X";

    void limpiarTablero() {
        jugador = "X";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = " ";
            }
        }
    }
    void limpiarpantalla() {
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
        }
    }

    void crearTablero() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = " ";
            }
        }
        for (int j = 0; j < 3; j++) {
            System.out.print("|");
            for (int k = 0; k < 3; k++) {
                System.out.print(tablero[j][k]);
                System.out.print("|");
            }
            System.out.println();
        }
    }
}