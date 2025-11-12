package Tema3_ProgramacionModular;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    public static void main(String[] args){
        System.out.println("Pon numeros positivos y si quieres acabar pon 0: ");
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            numero = sc.nextInt();

            if (numero > 0) {
                if (esPrimo(numero)) {
                    System.out.println(numero + " es primo.");
                } else {
                    System.out.println(numero + " no es primo.");
                }
            } else if (numero < 0) {
                System.out.println("Por favor, introduce solo números positivos.");
            }

        } while (numero != 0);

        System.out.println("Programa finalizado.");
    }
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

