package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Escribe: 0 para un cuadrado, 1 para un rectángulo, 2 para un triángulo:");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 0:
                System.out.print("Introduce el lado del cuadrado: ");
                double ladoC = sc.nextDouble();
                double superficieC = ladoC * ladoC;
                double perimetroC = 4 * ladoC;
                System.out.println("Superficie del cuadrado: " + superficieC);
                System.out.println("Perímetro del cuadrado: " + perimetroC);
                break;

            case 1:
                System.out.print("Introduce la base del rectángulo: ");
                double baseR = sc.nextDouble();
                System.out.print("Introduce la altura del rectángulo: ");
                double alturaR = sc.nextDouble();
                double superficieR = baseR * alturaR;
                double perimetroR = 2 * (baseR + alturaR);
                System.out.println("Superficie del rectángulo: " + superficieR);
                System.out.println("Perímetro del rectángulo: " + perimetroR);
                break;

            case 2:
                System.out.print("Introduce la base del triángulo: ");
                double baseT = sc.nextDouble();
                System.out.print("Introduce la altura del triángulo: ");
                double alturaT = sc.nextDouble();
                double superficieT = (baseT * alturaT) / 2;
                System.out.println("Superficie del triángulo: " + superficieT);
                break;

            default:
                System.out.println("Error: opción no válida.");
                break;
        }
    }
}

