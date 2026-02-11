package Tema5_ProgramacionExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[5];
        int contador = 0;

        while (contador < 5) {

            try {
                System.out.print("Introduce valor para posición " + contador + ":  ");
                vector[contador] = sc.nextDouble();
                contador++;

            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Error en el tipo de dato.");
                inputMismatchException.printStackTrace();
                sc.nextLine();
            }
        }
    }
}
