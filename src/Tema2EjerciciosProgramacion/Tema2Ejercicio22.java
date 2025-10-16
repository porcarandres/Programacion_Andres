package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        int contador = 0;

        if (n == 0) {
            int contador1 = contador + 1;
            System.out.println("El número tiene " + contador1 + " cifras.");
        } else {
            while (n > 0|| n < 0) {
                n = n / 10;
                contador++;
            } System.out.println("El número tiene " + contador + " cifras.");
        }
    }
}
