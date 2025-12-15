package Tema3_ProgramacionModular.Tema3_String;

import java.util.Scanner;

public class Lingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraSecreta = "hueso";
        int intentosMaximos = 5;
        boolean ganada = false;

        System.out.println("Palabra secreta: " + palabraSecreta);
        System.out.println("Pista: -----");

        for (int i = 0; i < intentosMaximos; i++) {
            System.out.print("Intento : ");
            String intento = sc.next().toLowerCase();

            if (intento.length() != 5) {
                System.out.println("La palabra debe tener 5 letras, pierdes el intento.");
                continue;
            }

            if (intento.equals(palabraSecreta)) {
                ganada = true;
                break;
            }
            char[] secretoChars = palabraSecreta.toCharArray();
            char[] intentoChars = intento.toCharArray();
            char[] resultado = {'-', '-', '-', '-', '-'};

            for (int k = 0; k < 5; k++) {
                if (intentoChars[k] == secretoChars[k]) {
                    resultado[k] = intentoChars[k];
                    secretoChars[k] = '0';
                    intentoChars[k] = '0';
                }
            }
            for (int k = 0; k < 5; k++) {
                if (intentoChars[k] != '0') {
                    for (int j = 0; j < 5; j++) {
                        if (secretoChars[j] != '0' && secretoChars[j] == intentoChars[k]) {
                            resultado[k] = '*';
                            secretoChars[j] = '0';
                            break;
                        }
                    }
                }
            }
            System.out.println("Hint: " + String.valueOf(resultado));
        }
        if (ganada) {
            System.out.println("Has ganado");
        } else {
            System.out.println("Perdiste, has agotado tus intentos.");
        }
    }
}
