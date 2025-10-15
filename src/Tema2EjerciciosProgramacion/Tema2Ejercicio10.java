package Tema2EjerciciosProgramacion;
import java.util.Scanner;
public class Tema2Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escribe 3 numeros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Los números están ordenados de menor a mayor.");
        } else {
            System.out.println("Los números no están ordenados de menor a mayor.");
        }


    }
}
