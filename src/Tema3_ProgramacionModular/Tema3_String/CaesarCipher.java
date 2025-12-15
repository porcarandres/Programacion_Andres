package Tema3_ProgramacionModular.Tema3_String;

import java.util.Scanner;

public class CaesarCipher {
    public static String encrypt(String mensaje) {
        mensaje = mensaje.toUpperCase();
        String resultado = "";

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);

            if (caracter == 'Z') {
                caracter = 'A';
            } else if (caracter >= 'A' && caracter < 'Z') {
                caracter++;
            } else if (caracter == '9') {
                caracter = '0';
            } else if (caracter >= '0' && caracter < '9') {
                caracter++;
            }
            resultado += caracter;
        }
        return resultado;
    }

    public static String decrypt(String mensaje) {
        String resultado = "";

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);

            if (caracter == 'A') {
                caracter = 'Z';
            } else if (caracter > 'A' && caracter <= 'Z') {
                caracter--;
            } else if (caracter == '0') {
                caracter = '9';
            } else if (caracter > '0' && caracter <= '9') {
                caracter--;
            }
            resultado += caracter;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el mensaje a cifrar: ");
        String mensajeOriginal = sc.nextLine();

        String mensajeCifrado = encrypt(mensajeOriginal);
        System.out.println("Cifrado: " + mensajeCifrado);
        String mensajeDescifrado = decrypt(mensajeCifrado);
        System.out.println("Descifrado: " + mensajeDescifrado);
    }
}
