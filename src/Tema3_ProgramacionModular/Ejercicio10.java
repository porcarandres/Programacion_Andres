package Tema3_ProgramacionModular;

import java.util.Scanner;
import static Tema3_ProgramacionModular.MyMath.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println(" MENU ");
        System.out.println("1.Perimetro y area del cuadrado");
        System.out.println("2.Perimetro y area del rectangulo");
        System.out.println("3.Perimetro y area del circulo");
        System.out.println("4.Propiedades de un numero (primo, digitos, factorial)");
        System.out.println("5.Ecuación cuadratica (ax^2 + bx + c = 0)");
        System.out.println("6.Suma de digitos de un numero");
        System.out.println("0.Salir");


        do {
            System.out.print("Elige una opcion del menu:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el lado del cuadrado: ");
                    int lado = sc.nextInt();
                    System.out.println("Perimetro del cuadrado: " + squarePerimeter(lado));
                    System.out.println("Area del cuadrado: " + squareArea(lado));
                    break;
                case 2:
                    System.out.print("Introduce base y altura del rectangulo: ");
                    int base = sc.nextInt();
                    int altura = sc.nextInt();
                    System.out.println("Perimetro del rectangulo: " + rectanglePerimeter(base, altura));
                    System.out.println("Area del rectangulo: " + rectangleArea(base, altura));
                    break;
                case 3:
                    System.out.print("Introduce el radio del circulo: ");
                    int radio = sc.nextInt();
                    System.out.println("Perimetro del circulo: " + circlePerimeter(radio));
                    System.out.println("Area del circulo: " + circleArea(radio));
                    break;
                case 4:
                    System.out.print("Introduce un número entero: ");
                    int num = sc.nextInt();
                    System.out.println(num + " es primo? " + esPrimo(num));
                    System.out.println(num + " no es primo? " + noPrimo(num));
                    System.out.println("Numero de digitos: " + contadorDigitos(num));
                    System.out.println("Digitos pares: " + numerosPares(num));
                    System.out.println("Digitos impares: " + numerosImpares(num));
                    System.out.println("Factorial: " + factorial(num));
                    System.out.println("Factorial recursivo: " + factorialRecursiva(num));
                    break;
                case 5:
                    System.out.print("Introduce a: ");
                    int a = sc.nextInt();
                    System.out.print("Introduce b: ");
                    int b = sc.nextInt();
                    System.out.print("Introduce c: ");
                    int c = sc.nextInt();
                    System.out.println("Soluciones: " + solucionesQuadraticas(a, b, c));
                    break;
                case 6:
                    System.out.print("Introduce un número: ");
                    int n = sc.nextInt();
                    System.out.println("Suma de digitos: " + sumaDigitos(n));
                    break;
                case 0:
                    System.out.println("FIN");
                    break;
                default:
                    System.out.println("Opciun no valida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}


