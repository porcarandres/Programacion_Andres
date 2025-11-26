package Tema3_ProgramacionModular;

import java.util.Scanner;
import static Tema3_ProgramacionModular.MyMath.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("\n MENU ");
        System.out.println("1. Perimetro y área del cuadrado");
        System.out.println("2. Perimetro y área del rectangulo");
        System.out.println("3. Perimetro y área del circulo");
        System.out.println("4. Propiedades de un número (primo, digitos, factorial)");
        System.out.println("5. Ecuación cuadrática (ax^2 + bx + c = 0)");
        System.out.println("6. Suma de digitos de un numero");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");

        do {
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el lado del cuadrado: ");
                    int lado = sc.nextInt();
                    System.out.println("Perímetro del cuadrado: " + squarePerimeter(lado));
                    System.out.println("Área del cuadrado: " + squareArea(lado));
                    break;
                case 2:
                    System.out.print("Introduce base y altura del rectángulo: ");
                    int base = sc.nextInt();
                    int altura = sc.nextInt();
                    System.out.println("Perímetro del rectángulo: " + rectanglePerimeter(base, altura));
                    System.out.println("Área del rectángulo: " + rectangleArea(base, altura));
                    break;
                case 3:
                    System.out.print("Introduce el radio del círculo: ");
                    int radio = sc.nextInt();
                    System.out.println("Perímetro del círculo: " + circlePerimeter(radio));
                    System.out.println("Área del círculo: " + circleArea(radio));
                    break;
                case 4:
                    System.out.print("Introduce un número entero: ");
                    int num = sc.nextInt();
                    System.out.println(num + " es primo? " + esPrimo(num));
                    System.out.println(num + " no es primo? " + noPrimo(num));
                    System.out.println("Número de dígitos: " + contadorDigitos(num));
                    System.out.println("Dígitos pares: " + numerosPares(num));
                    System.out.println("Dígitos impares: " + numerosImpares(num));
                    System.out.println("Factorial: " + factorial(num));
                    System.out.println("Factorial recursivo: " + factorialRecursiva(num));
                    break;
                case 5:
                    System.out.print("Introduce los coeficientes a, b y c: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    System.out.println("Soluciones: " + solucionesQuadraticas(a, b, c));
                    break;
                case 6:
                    System.out.print("Introduce un número: ");
                    int n = sc.nextInt();
                    System.out.println("Suma de dígitos: " + sumaDigitos(n));
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}


