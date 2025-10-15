package Tema2EjerciciosProgramacion;
import java.util.Scanner;

public class Tema2Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base del triángulo: ");
        double base = sc.nextDouble();

        System.out.print("Introduce la altura del triángulo: ");
        double altura = sc.nextDouble();

        double superficie = (base * altura) / 2;

        System.out.println("La superficie del triángulo es: " + superficie);


    }
}

