package Tema3_ProgramacionModular;

import java.util.Scanner;

public class Buscaminas {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] tableroOculto = new String[20];
            String[] tableroJuego = new String[20];
            for (int i = 0; i < 20; i++) {
                tableroJuego[i] = "*";
            }
            int minasColocadas = 0;
            while (minasColocadas < 6) {
                int posicionAleatoria = (int)(Math.random() * 20);
                if (tableroOculto[posicionAleatoria] == null) {
                    tableroOculto[posicionAleatoria] = "m";
                    minasColocadas++;
                }
            }
            for (int i = 0; i < 20; i++) {
                if (tableroOculto[i] == null) {
                    int contadorMinas = 0;

                    if (i > 0 && "m".equals(tableroOculto[i - 1])) contadorMinas++;

                    if (i < 19 && "m".equals(tableroOculto[i + 1])) contadorMinas++;

                    tableroOculto[i] = String.valueOf(contadorMinas);
                }
            }
            boolean juegoTerminado = false;
            while (!juegoTerminado) {
                System.out.println("Tablero de juego:");
                for (int i = 0; i < 20; i++) {
                    System.out.print((i+1) + ":" + tableroJuego[i] + "  ");
                }
                System.out.println();
                System.out.print("Elige una posicion (1-20): ");
                int posicionElegida = sc.nextInt() - 1;

                if (posicionElegida < 0 || posicionElegida >= 20) {
                    System.out.println("Posicion invalida.");
                    continue;
                }
                if (!tableroJuego[posicionElegida].equals("*")) {
                    System.out.println("Esa posicion ya esta destapada. Elige otra.");
                    continue;
                }
                if (tableroOculto[posicionElegida].equals("m")) {
                    System.out.println("¡Boom! Has pisado una mina.");
                    System.out.println("Has perdido.");
                    juegoTerminado = true;
                    continue;
                }
                tableroJuego[posicionElegida] = tableroOculto[posicionElegida];
                boolean elJugadorGana = true;
                for (int i = 0; i < 20; i++) {
                    if (!tableroOculto[i].equals("m") && tableroJuego[i].equals("*")) {
                        elJugadorGana = false;
                        break;
                    }
                }
                if (elJugadorGana) {
                    System.out.println("¡HAS GANADO!");
                    juegoTerminado = true;
                }
            }
            System.out.println("Tablero final:");
            for (int i = 0; i < 20; i++) {
                System.out.print(tableroOculto[i] + " ");
            }
        }
}
