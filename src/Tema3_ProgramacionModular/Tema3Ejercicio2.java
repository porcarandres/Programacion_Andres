package Tema3_ProgramacionModular;

import java.util.Scanner;

public class Tema3Ejercicio2 {
    public static boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ESCRIBE TU EDAD:");
        int edad = sc.nextInt();

        boolean mayor = isAdult(edad);

        if (mayor) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}

