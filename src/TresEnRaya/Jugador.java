package TresEnRaya;

import java.util.Scanner;

public class Jugador {

    Scanner scanner = new Scanner(System.in);
    Jugar jugar1 = new Jugar();
    Tablero tablero1 = new Tablero();
    int seguirjugando = 0;
    int turno;
    String jugador = "X";
    int x, y;
    boolean jugar = true;


    void comprobarGanador() {
        if ((tablero1.tablero[0][0] == "X" && tablero1.tablero[0][1] == "X" && tablero1.tablero[0][2] == "X" || tablero1.tablero[0][0] == "X" && tablero1.tablero[1][0] == "X" && tablero1.tablero[2][0] == "X" || tablero1.tablero[0][2] == "X" && tablero1.tablero[1][2] == "X" && tablero1.tablero[2][2] == "X" || tablero1.tablero[2][0] == "X" && tablero1.tablero[2][1] == "X" && tablero1.tablero[2][2] == "X" || tablero1.tablero[1][0] == "X" && tablero1.tablero[1][1] == "X" && tablero1.tablero[1][2] == "X" || tablero1.tablero[0][0] == "X" && tablero1.tablero[1][1] == "X" && tablero1.tablero[2][2] == "X" || tablero1.tablero[0][2] == "X" && tablero1.tablero[1][1] == "X" && tablero1.tablero[2][0] == "X" || tablero1.tablero[0][1] == "X" && tablero1.tablero[1][1] == "X" && tablero1.tablero[2][1] == "X")) {
            System.out.println("Gana el jugador X !!");
            System.out.println("Quieres seguir jugando?  ('0' si // '1' no)");
            seguirjugando = scanner.nextInt();
            if (seguirjugando == 0) {
                turno = 0;
                jugador = "X";
                jugar = true;
                tablero1.limpiarTablero();
            } else if (seguirjugando == 1) {
                jugar = false;
                System.out.println("Gracias por jugar");
                System.out.println("Saliendo del Tres en raya...");
            } else {
                System.out.println("Numero no valido");
            }
        } else if ((tablero1.tablero[0][0] == "O" && tablero1.tablero[0][1] == "O" && tablero1.tablero[0][2] == "O" || tablero1.tablero[0][0] == "O" && tablero1.tablero[1][0] == "O" && tablero1.tablero[2][0] == "O" || tablero1.tablero[0][2] == "O" && tablero1.tablero[1][2] == "O" && tablero1.tablero[2][2] == "O" || tablero1.tablero[2][0] == "O" && tablero1.tablero[2][1] == "O" && tablero1.tablero[2][2] == "O" || tablero1.tablero[1][0] == "O" && tablero1.tablero[1][1] == "O" && tablero1.tablero[1][2] == "O" || tablero1.tablero[0][0] == "O" && tablero1.tablero[1][1] == "O" && tablero1.tablero[2][2] == "O" || tablero1.tablero[0][2] == "O" && tablero1.tablero[1][1] == "O" && tablero1.tablero[2][0] == "O" || tablero1.tablero[0][1] == "O" && tablero1.tablero[1][1] == "O" && tablero1.tablero[2][1] == "O")) {
            System.out.println("Gana el jugador O !!");
            System.out.println("Quieres seguir jugando?  ('0' si // '1' no)");
            seguirjugando = scanner.nextInt();
            if (seguirjugando == 0) {
                turno = 0;
                jugador = "X";
                jugar = true;
                tablero1.limpiarTablero();
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
                tablero1.limpiarTablero();
            } else if (seguirjugando == 1) {
                jugar = false;
                System.out.println("Gracias por jugar");
                System.out.println("Saliendo del Tres en raya...");
            } else {
                System.out.println("Numero no valido");
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
            if (casilla == 1 && !(tablero1.tablero[0][0]=="X" || tablero1.tablero[0][0]=="O")){
                x=0;
                y=0;
                vacia=true;
            }else if (casilla ==2 && !(tablero1.tablero[0][1]=="X" || tablero1.tablero[0][1]=="O")){
                x=0;
                y=1;
                vacia=true;
            }else if (casilla ==3 && !(tablero1.tablero[0][2]=="X" || tablero1.tablero[0][2]=="O")){
                x=0;
                y=2;
                vacia=true;
            }else if (casilla==4 && !(tablero1.tablero[1][0]=="X" || tablero1.tablero[1][0]=="O")){
                x=1;
                y=0;
                vacia=true;
            }else if (casilla==5 && !(tablero1.tablero[1][1]=="X" || tablero1.tablero[1][1]=="O")){
                x=1;
                y=1;
                vacia=true;
            }else if (casilla==6 && !(tablero1.tablero[1][2]=="X" || tablero1.tablero[1][2]=="O")){
                x=1;
                y=2;
                vacia=true;
            }else if (casilla==7 && !(tablero1.tablero[2][0]=="X" || tablero1.tablero[2][0]=="O")){
                x=2;
                y=0;
                vacia=true;
            }else if (casilla==8 && !(tablero1.tablero[2][1]=="X" || tablero1.tablero[2][1]=="O")){
                x=2;
                y=1;
                vacia=true;
            }else if (casilla==9 && !(tablero1.tablero[2][2]=="X" || tablero1.tablero[2][2]=="O")){
                x=2;
                y=2;
                vacia=true;
            }else{
                System.out.println("Error casilla ocupada!");
            }
        }
    }
}