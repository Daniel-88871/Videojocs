package com.company;

import java.util.Scanner;

public class TresEnRaya {

    Scanner scanner = new Scanner(System.in);
    String[][] tablero = new String[3][3];
    int turno;
    String jugador= "X";
    int x, y;
    boolean jugar = true;
    int seguirjugando=0;

    public void lanzar() {
        darBienvenida();
        crearTablero();
    }

    void darBienvenida() {
        System.out.println("BIENVENIDO AL Tres En Raya");
    }
    void crearTablero() {

        for (int i = 0; i <3 ; i++) {
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



