package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Videojuegos");

            System.out.println("           ELIJE UN JUEGO ^_^          ");
            System.out.println("  ----------------------------------   ");
            System.out.println(" || *       1 - Simon dice       * ||  ");
            System.out.println(" || *       2 - Tres en raya     * ||  ");
            System.out.println(" || *       3 - Ahorcado         * ||  ");
            System.out.println("  ----------------------------------   ");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Lanzando Simon...");
                Simon.Lanzar lanzar1 = new Simon.Lanzar();
                lanzar1.lanzar();
                System.out.println("...juego Simon terminado.");
            } else if (opcion == 0) {
                break;
            }
            if (opcion == 2) {
                System.out.println("Lanzando Tres...");
                TresEnRaya.Lanzar lanzar2 = new TresEnRaya.Lanzar();
                lanzar2.lanzar();
                System.out.println("...juego Tres terminado.");
            } else if (opcion == 0) {
                break;
            }
            if (opcion == 3) {
                System.out.println("Lanzando Ahorcado...");
                Ahorcado.Lanzar lanzar3 = new Ahorcado.Lanzar();
                lanzar3.lanzar();
                System.out.println("...juego Ahorcado terminado.");
            } else if (opcion == 0) {
                break;
            }
        }
    }
}