package Tema3_ProgramacionModular;

import java.util.Scanner;

public class Tema3Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el símbolo para el triángulo: ");
        char simbolo = sc.next().charAt(0);

        System.out.print("Introduce la cantidad de filas: ");
        int filas = sc.nextInt();

        if (filas > 0) {
            creaTriangulo(simbolo, filas);
        } else {
            System.out.println("El número de filas debe ser mayor que 0.");
        }

    }

    public static void creaTriangulo(char caracter, int altura) {
        for (int nivel = 0; nivel <= altura; nivel++) {
            for (int espacio = 1; espacio <= altura - nivel; espacio++) {
                System.out.print(" ");
            }
            for (int ancho = 1; ancho <= 2 * nivel - 1; ancho++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
