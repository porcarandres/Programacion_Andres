package Tema2EjerciciosProgramacion;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio28 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroganador = random.nextInt(99999);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero ganador generado.");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce tu numero (intento " + i + " de 5): ");
            int numerousuario = scanner.nextInt();

            if (numerousuario == numeroganador) {
                System.out.println("Felicidades has ganado la loteria.");
                scanner.close();
                return;
            } else {
                System.out.println("No has ganado.");
            }
        }

        System.out.println("No has ganado, el numero ganador es: " + numeroganador);
        scanner.close();
    }
}
