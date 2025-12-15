package Tema3_ProgramacionModular.Tema3_String;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jugador 1 introduce la palabra secreta: ");
        String palabraSecreta = sc.nextLine().toUpperCase();

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        char[] progreso = new char[palabraSecreta.length()];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }

        int vidas = 6;
        boolean juegoTerminado = false;
        boolean haGanado = false;

        while (vidas > 0 && !juegoTerminado) {
            System.out.println("Vidas: " + vidas);
            dibujarAhorcado(vidas);
            System.out.println("Palabra: " + String.valueOf(progreso));

            System.out.print("Jugador 2 introduce una letra o resuelve: ");
            String intento = sc.nextLine().toUpperCase();

            if (intento.length() > 1) {
                if (intento.equals(palabraSecreta)) {
                    haGanado = true;
                    juegoTerminado = true;
                } else {
                    vidas = 0;
                }
            } else if (intento.length() == 1) {
                char letra = intento.charAt(0);
                boolean acierto = false;

                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        progreso[i] = letra;
                        acierto = true;
                    }
                }

                if (!acierto) {
                    vidas--;
                }

                if (String.valueOf(progreso).equals(palabraSecreta)) {
                    haGanado = true;
                    juegoTerminado = true;
                }
            }
        }
        dibujarAhorcado(vidas);

        if (haGanado) {
            System.out.println("Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("Fallaste, la palabra era: " + palabraSecreta);
        }
    }
    public static void dibujarAhorcado(int vidas) {
        switch (vidas) {
            case 6:
                System.out.println("\n\n\n");
                break;
            case 5:
                System.out.println(" o \n\n");
                break;
            case 4:
                System.out.println(" o \n | \n");
                break;
            case 3:
                System.out.println(" o \n/| \n");
                break;
            case 2:
                System.out.println(" o \n/|\\\n");
                break;
            case 1:
                System.out.println(" o \n/|\\\n/");
                break;
            case 0:
                System.out.println(" o \n/|\\\n/ \\");
                break;
        }
    }
}