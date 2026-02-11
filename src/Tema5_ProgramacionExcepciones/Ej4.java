package Tema5_ProgramacionExcepciones;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(100)+1; // pongo el +1 pq si no se pone es 99
        int[] vector = new int[numero];

        for (int i = 0; i < numero; i++) {
            vector[i] = random.nextInt(10)+1;// pongo el +1 pq si no se pone es 9
        }

        int posicion = 0;

        while (posicion >= 0) {
            try {
                System.out.print("Dime una posicion (negativo para salir):  ");
                posicion = sc.nextInt();

                if (posicion >= 0) {
                    System.out.println("Valor: " + vector[posicion]);
                }


            } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
                System.out.println("Error: Esa posicion no existe en el vector.");
                outOfBoundsException.printStackTrace();

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Error: Debes introducir un num entero.");
                inputMismatchException.printStackTrace();
                sc.nextLine();
            }
        }
    }
}
