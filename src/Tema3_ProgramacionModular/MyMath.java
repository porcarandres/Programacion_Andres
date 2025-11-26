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
    }public static boolean noPrimo(int num) {
        return !esPrimo(num);}

    public static int contadorDigitos(int num) {
        num = Math.abs(num);
        int contador = 0;

        while (num > 0) {
            if ((num % 10) % 2 != 0) contador++;
            num /= 10;
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
    public static void main(String[] args) {

        System.out.println("Perimetro del cuadrado: " + MyMath.squarePerimeter(8));
        System.out.println("Area del cuadrado: " + MyMath.squareArea(8));

        System.out.println("Perimetro del rectangulo: " + MyMath.rectanglePerimeter(5, 8));
        System.out.println("Area del rectangulo: " + MyMath.rectangleArea(5, 8));

        System.out.println("Perimetro del circulo: " + MyMath.circlePerimeter(8));
        System.out.println("Area del circulo: " + MyMath.circleArea(8));


        System.out.println("Pon un numero entero:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num + " el numero es primo? " + MyMath.esPrimo(num));
        System.out.println(num + " no es primo? " + MyMath.noPrimo(num));

        System.out.println("Numero de digitos: " + MyMath.contadorDigitos(num));
        System.out.println("Digitos pares: " + MyMath.numerosPares(num));
        System.out.println("Digitos impares: " + MyMath.numerosImpares(num));

        System.out.println("Factorial: " + MyMath.factorial(num));
        System.out.println("Factorial recursivo: " + MyMath.factorialRecursiva(num));

        System.out.println("Pon 3 numeros enteros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Soluciones de la ecuacion (x^2 + 2x - 3 = 0): " + MyMath.solucionesQuadraticas(num1, num2, num3));

        System.out.println("Suma de los digitos de " + num + ": " + MyMath.sumaDigitos(num));
    }
}
