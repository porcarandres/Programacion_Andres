package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int num=0;

        while (num>=0) {
            System.out.print("Ingrese un número entero positivo y cuando quieras terminar negativo: ");
            num = sc.nextInt();

            if (num < 0) {
                break;
            }

            suma += num;
            contador++;
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No hay numeros positivos.");
        }
    }
}
