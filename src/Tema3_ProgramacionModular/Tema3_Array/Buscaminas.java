package Tema3_ProgramacionModular.Tema3_Array;

import java.util.Scanner;

public class Buscaminas {
    public static void main(String[] args) {
        // configuracion
        int filas = 5;
        int columnas = 5;
        int cantidadMinas = 5;
        char[][] tablero = new char[filas][columnas];

        // Llenar tablero vacío
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = '-';
            }
        }
        // PONER MINAS
        int minasColocadas = 0;
        while (minasColocadas < cantidadMinas) {
            int f = (int)(Math.random() * filas);
            int c = (int)(Math.random() * columnas);
            if (tablero[f][c] == '-') {
                tablero[f][c] = '*';
                minasColocadas++;
            }
        }
        // JUEGO
        Scanner scanner = new Scanner(System.in);
        boolean juegoActivo = true;

        System.out.println("Empieza el Buscaminas");
        System.out.println("El tablero es de 0 a 4.");

        while (juegoActivo) {
            // Pedir coordenadas
            System.out.print("Ingresa Fila (0-4): ");
            int filaUsuario = scanner.nextInt();
            System.out.print("Ingresa Columna (0-4): ");
            int colUsuario = scanner.nextInt();

            // 1. VERIFICACIÓN (Aquí estaba el error)
            if (filaUsuario < 0 || filaUsuario >= filas || colUsuario < 0 || colUsuario >= columnas) {
                System.out.println("¡Coordenadas fuera de rango! Intenta de nuevo.");
                continue;
            }

            // 2. LÓGICA DEL JUEGO
            if (tablero[filaUsuario][colUsuario] == '*') {
                // Caso: Mina
                System.out.println("\n💥");
                System.out.println("Has pisado una mina.");
                juegoActivo = false;
            } else {
                // Caso: A salvo
                System.out.println("\n No hay Mina");
                // Ponemos 'V' de Visitado
                tablero[filaUsuario][colUsuario] = 'V';

                // Mostramos el tablero visible
                imprimirTableroVisible(tablero);
            }
        } // Fin del while

        // Al final, mostramos dónde estaban todas las minas
        System.out.println("\nAsí quedó el mapa final:");
        imprimirTableroCompleto(tablero);
    } // Fin del main
    public static void imprimirTableroVisible(char[][] t) {

        System.out.println("   0 1 2 3 4"); // Ayuda visual de columnas

        for (int i = 0; i < t.length; i++) {
            System.out.print(i + "| "); // Ayuda visual de filas
            for (int j = 0; j < t[0].length; j++) {
                if (t[i][j] == '*') {
                    System.out.print("- ");
                } else {
                    System.out.print(t[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void imprimirTableroCompleto(char[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}
