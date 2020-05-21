package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado{
    Scanner scanner = new Scanner(System.in);
    String[] palabras = {"zoo","chaqueta","calendario","discord","coche"};
    Random random = new Random();
    char[] palabraJuego;
    char[] letrasAdivinadas;
    String jugador;
    int seguir = 1;
    int aciertos = 0;
    int errores = 9;
    int coinciden = 0;
    boolean seguirjugando = true;

    public void lanzar() {
        darBienvenida();
        palabraAleatoria();
        iniciarPalabra();
        mostrarJuego();
        juego();
    }

    private void juego() {
        for (int i = 0; i < palabraJuego.length || seguirjugando == true; i++) {
            System.out.println();
            System.out.println("introduce una letra:");
            jugador=scanner.nextLine();
            for (int j = 0; j <99 ; j++) {
                if (jugador.length() > 1){
                    System.out.println("Tiene que ser solo una letra");
                    jugador=scanner.nextLine();
                }else if (jugador.length() == 1){
                    coincide();
                    mostrarJuego();
                    break;
                }
            }
        }
    }

    private void coincide() {
        coinciden=0;
        for (int i = 0; i < palabraJuego.length; i++){
            if (jugador.charAt(0) == palabraJuego[i]){
                aciertos++;
                coinciden=1;
                intercambiarLetra();
                finaljuego();
            }
        }
        if(coinciden != 1) {
            errores--;
            System.out.println("Has Fallado, te quedan "+errores+" intentos");
            finaljuego();
        }
    }

    private void intercambiarLetra() {
        for (int i = 0; i <palabraJuego.length ; i++) {
            if (jugador.charAt(0)==palabraJuego[i]){
                letrasAdivinadas[i]=jugador.charAt(0);
            }else if (i==palabraJuego.length){
                break;
            }
        }
    }

    private void finaljuego() {
        if (aciertos==palabraJuego.length){
            System.out.println("Felicidades has acertado!!");
            System.out.println("Quieres seguir jugando (1 'si' // 0  'no')");
            seguir=scanner.nextInt();
            if (seguir==1){
                seguir = 1;
                aciertos=0;
                errores=9;
                coinciden=0;
                lanzar();
            }else if (seguir==0){
                seguirjugando=false;
            }else {
                System.out.println("Numero equivocado");
            }
        }
        else if (errores==0){
            seguirjugando=false;
        }
    }

    private void mostrarJuego() {
        for (int i = 0; i < palabraJuego.length; i++) {
            System.out.print(letrasAdivinadas[i] + " ");
        }
    }

    private void iniciarPalabra() {
        int indiceArray = palabraJuego.length;
        letrasAdivinadas = new char[indiceArray];
        for (int i = 0; i < palabraJuego.length; i++) {
            letrasAdivinadas[i]='_';
        }
        System.out.println();
    }

    void palabraAleatoria() {
        int numPalabra = random.nextInt(5);
        palabraJuego = palabras[numPalabra].toCharArray();
    }

    void darBienvenida() {
        System.out.println("BIENVENIDO AL AHORCADO");
    }
}