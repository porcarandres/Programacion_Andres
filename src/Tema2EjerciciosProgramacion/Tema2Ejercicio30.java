package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operacion = "";

        while (!operacion.equals("0")) {
            System.out.println("Escribe '0' como operación para salir.");

            System.out.print("Número 1: ");
            double num1 = sc.nextDouble();

            System.out.print("Número 2: ");
            double num2 = sc.nextDouble();

            double resultado = 0;

            System.out.print("Operación (+, -, *, /, %) o 0 para salir: ");
            operacion = sc.next();

            if (operacion.equals("0")) {
                break;
            }

            if (operacion.equals("+")) {
                resultado = num1 + num2;
            } else if (operacion.equals("-")) {
                resultado = num1 - num2;
            } else if (operacion.equals("*")) {
                resultado = num1 * num2;
            } else if (operacion.equals("/")) {
                if (num2 == 0) {
                    System.out.println("No se puede dividir entre 0.");
                    continue;
                }
                resultado = num1 / num2;
            } else if (operacion.equals("%")) {
                if (num2 == 0) {
                    System.out.println("No se puede hacer módulo con 0.");
                    continue;
                }
                resultado = num1 % num2;
            } else {
                System.out.println("Operación no válida.");
                continue;
            }

            System.out.println("Resultado: " + resultado);
        }

        System.out.println("Calculadora finalizada.");
    }
}