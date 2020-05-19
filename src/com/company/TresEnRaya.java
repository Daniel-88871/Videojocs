package com.company;

import java.util.Scanner;

public class TresEnRaya {

    Scanner scanner = new Scanner(System.in);
    String[][] tablero = new String[3][3];
    int turno;
    String jugador = "X";
    int x, y;
    boolean jugar = true;
    int seguirjugando = 0;

    public void lanzar() {
        darBienvenida();
        crearTablero();
        jugar();
    }

    void darBienvenida() {
        System.out.println("BIENVENIDO AL Tres En Raya");
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
    void jugar() {
        for (turno = 1; jugar; turno++) {
            casillaJugador();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == x && j == y) {

                        tablero[i][j] = jugador;
                    }
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
            comprobarGanador();
            if (seguirjugando == 1) {
                limpiarpantalla();
                break;
            }
        }
    }
    void limpiarpantalla() {
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
        }
    }
    void comprobarGanador() {
        if ((tablero[0][0] == "X" && tablero[0][1] == "X" && tablero[0][2] == "X" || tablero[0][0] == "X" && tablero[1][0] == "X" && tablero[2][0] == "X" || tablero[0][2] == "X" && tablero[1][2] == "X" && tablero[2][2] == "X" || tablero[2][0] == "X" && tablero[2][1] == "X" && tablero[2][2] == "X" || tablero[1][0] == "X" && tablero[1][1] == "X" && tablero[1][2] == "X" || tablero[0][0] == "X" && tablero[1][1] == "X" && tablero[2][2] == "X" || tablero[0][2] == "X" && tablero[1][1] == "X" && tablero[2][0] == "X" || tablero[0][1] == "X" && tablero[1][1] == "X" && tablero[2][1] == "X")) {
            System.out.println("Gana el jugador X !!");
            System.out.println("Quieres seguir jugando?  ('0' si // '1' no)");
            seguirjugando = scanner.nextInt();
            if (seguirjugando == 0) {
                turno = 0;
                jugador = "X";
                jugar = true;
                limpiarTablero();
            } else if (seguirjugando == 1) {
                jugar = false;
                System.out.println("Gracias por jugar");
                System.out.println("Saliendo del Tres en raya...");
            } else {
                System.out.println("Numero no valido");
            }
        } else if ((tablero[0][0] == "O" && tablero[0][1] == "O" && tablero[0][2] == "O" || tablero[0][0] == "O" && tablero[1][0] == "O" && tablero[2][0] == "O" || tablero[0][2] == "O" && tablero[1][2] == "O" && tablero[2][2] == "O" || tablero[2][0] == "O" && tablero[2][1] == "O" && tablero[2][2] == "O" || tablero[1][0] == "O" && tablero[1][1] == "O" && tablero[1][2] == "O" || tablero[0][0] == "O" && tablero[1][1] == "O" && tablero[2][2] == "O" || tablero[0][2] == "O" && tablero[1][1] == "O" && tablero[2][0] == "O" || tablero[0][1] == "O" && tablero[1][1] == "O" && tablero[2][1] == "O")) {
            System.out.println("Gana el jugador O !!");
            System.out.println("Quieres seguir jugando?  ('0' si // '1' no)");
            seguirjugando = scanner.nextInt();
            if (seguirjugando == 0) {
                turno = 0;
                jugador = "X";
                jugar = true;
                limpiarTablero();
            } else if (seguirjugando == 1) {
                jugar = false;
                System.out.println("Gracias por jugar");
                System.out.println("Saliendo del Tres en raya...");
            } else {
                System.out.println("Numero no valido");
            }
        } else if (turno == 9) {
            System.out.println("Empate");
            System.out.println("Quieres seguir jugando?  ('0' si // '1' no)");
            seguirjugando = scanner.nextInt();
            if (seguirjugando == 0) {
                turno = 0;
                jugar = true;
                limpiarTablero();
            } else if (seguirjugando == 1) {
                jugar = false;
                System.out.println("Gracias por jugar");
                System.out.println("Saliendo del Tres en raya...");
            } else {
                System.out.println("Numero no valido");
            }
        }
    }
    void limpiarTablero() {
        jugador = "X";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = " ";
            }
        }
    }
    void casillaJugador() {
        boolean vacia = false;
        for (; vacia == false; ) {
            if (turno == 1 || turno == 3 || turno == 5 || turno == 7 || turno == 9) {
                jugador = "X";
            } else {
                jugador = "O";
            }
            System.out.println("Escoge tu casilla:");
            int casilla= scanner.nextInt();
            if (casilla == 1 && !(tablero[0][0]=="X" || tablero[0][0]=="O")){
                x=0;
                y=0;
                vacia=true;
            }else if (casilla ==2 && !(tablero[0][1]=="X" || tablero[0][1]=="O")){
                x=0;
                y=1;
                vacia=true;
            }else if (casilla ==3 && !(tablero[0][2]=="X" || tablero[0][2]=="O")){
                x=0;
                y=2;
                vacia=true;
            }else if (casilla==4 && !(tablero[1][0]=="X" || tablero[1][0]=="O")){
                x=1;
                y=0;
                vacia=true;
            }else if (casilla==5 && !(tablero[1][1]=="X" || tablero[1][1]=="O")){
                x=1;
                y=1;
                vacia=true;
            }else if (casilla==6 && !(tablero[1][2]=="X" || tablero[1][2]=="O")){
                x=1;
                y=2;
                vacia=true;
            }else if (casilla==7 && !(tablero[2][0]=="X" || tablero[2][0]=="O")){
                x=2;
                y=0;
                vacia=true;
            }else if (casilla==8 && !(tablero[2][1]=="X" || tablero[2][1]=="O")){
                x=2;
                y=1;
                vacia=true;
            }else if (casilla==9 && !(tablero[2][2]=="X" || tablero[2][2]=="O")){
                x=2;
                y=2;
                vacia=true;
            }else{
                System.out.println("Error casilla ocupada!");
            }
        }
    }
}