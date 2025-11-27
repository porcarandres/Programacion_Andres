package Tema3_ProgramacionModular;
import java.util.Scanner;

public class MyMath {
    public static double squarePerimeter(double lado) {
        return 4 * lado;
    }
    public static double squareArea(double lado) {
        return lado * lado;
    }
    public static double rectanglePerimeter(double base, double altura) {
        return 2 * (base + altura);
    }
    public static double rectangleArea(double base, double altura) {
        return base * altura;
    }
    public static double circlePerimeter(double radio) {
        return 2 * Math.PI * radio;
    }
    public static double circleArea(double radio) {
        return Math.PI * radio * radio;
    }
    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static boolean noPrimo(int num) {
        return !esPrimo(num);}

    public static int contadorDigitos(int num) {
        num = Math.abs(num);
        int contador = 0;

        while (num > 0) {

            num /= 10;
            contador++;

        }

        return contador;
    }
    public static int numerosPares(int num) {
        num = Math.abs(num);
        int contador = 0;

        while (num > 0) {
            if ((num % 10) % 2 == 0) contador++;
            num /= 10;
        }

        return contador;
    }
    public static int numerosImpares(int num) {
        num = Math.abs(num);
        int contador = 0;

        while (num > 0) {
            if ((num % 10) % 2 != 0) contador++;
            num /= 10;
        }

        return contador;
    }

    public static long factorial(int n) {
        if (n <= 1) return 1;
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;}
        return resultado;
    }

    public static long factorialRecursiva(int num) {
        if (num <=1) return 1;
        return num * factorialRecursiva(num - 1);
    }

    public static int solucionesQuadraticas(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) return 2;
        else if (D == 0) return 1;
        else return 0;
    }

    public static int sumaDigitos(int num) {
        num = Math.abs(num);
        int suma = 0;

        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
}//fin (conectado con el Ejercicio10)
