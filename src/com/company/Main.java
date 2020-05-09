package com.company;

import sun.jvm.hotspot.utilities.ObjectReader;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("MULTIJUEGOS");

            System.out.println("1) Simon  2) Tres  3) Ahorcado");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Lanzando Simon...");
                SimonGame simonGame = new SimonGame();
                simonGame.lanzar();
                System.out.println("...juego Simon terminado.");
            } else if (opcion == 0) {
                break;
            }
        }
    }
}
