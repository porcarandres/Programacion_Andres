package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1-12): ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();

        if (anio< 0 ) {
            System.out.println("Error: año no válido.");
        } else {

            int dias = 0;

            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dias = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dias = 30;
                    break;
                case 2:
                    if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                        dias = 29;
                    } else {
                        dias = 28;
                    }
                    break;
                default:
                    System.out.println("Mes inválido.");

                    return;
            }

            System.out.printf("El mes " + mes + " del año " + anio + " tiene " + dias + " días");

        }
    }
}
