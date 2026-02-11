package Tema5_ProgramacionExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce num1: ");
            int num1 = sc.nextInt();
            System.out.print("Introduce num2: ");
            int num2 = sc.nextInt();

            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Error: No has introducido un número entero.");
            inputMismatchException.printStackTrace();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Error de division por cero.");
            arithmeticException.printStackTrace();
        }
    }
}
