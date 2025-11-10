package Tema3_ProgramacionModular;

import java.util.Scanner;

public class Tema3Ejercicio3 {

    public static boolean validRadius(double radius) {
    return radius > 0;
    }

    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;

        do {
            System.out.print("Introduce el radio del circulo (>0): ");
            radius = sc.nextDouble();

            if (!validRadius(radius)) {
                System.out.println("El radio debe ser mayor que 0.");
            }
        } while (!validRadius(radius));

        double perimetro = calculateCirclePerimeter(radius);
        double area = calculateCircleArea(radius);
        System.out.println("Perimetro del círculo: "+perimetro);
        System.out.println("Area del círculo: "+area);

    }
}
