package Tema5_ProgramacionExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un entero: ");
    try {
        int num = sc.nextInt();
        System.out.println("Valor introducido: " + num);
    } catch (InputMismatchException inputMismatchException) {
        System.out.println("Valor introducido incorrecto");
    }
}
}
