package Tema1EjerciciosProgramacion;

import java.util.Scanner;
public class Tema1Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor del radio (R): ");
        double R = sc.nextDouble();
        double A = Math.PI * R * R;
        System.out.println("El area es "+ A);
        sc.close();
    }
}
