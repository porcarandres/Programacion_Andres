package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce 'D' para convertir de euros a dolares o 'E' para convertir de dolares a euros: ");
        char opcion= sc.next().charAt(0);

        System.out.print("Introduce la cantidad: ");
        double cantidad = sc.nextDouble();

        double resultado;

        if (opcion == 'D') {
            resultado = cantidad * 1.16;
            System.out.printf(cantidad+" euros son "+resultado+" dólares");
        } else if (opcion == 'E') {
            resultado = cantidad * 0.86;
            System.out.printf(cantidad+" dolares son "+resultado+" euros");
        } else {
            System.out.println("Opcion no válida. Usa 'D' o 'E'.");
        }
    }
}

