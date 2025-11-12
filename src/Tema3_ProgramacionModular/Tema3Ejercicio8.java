package Tema3_ProgramacionModular;

import java.util.Scanner;

public class Tema3Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día (1-31): ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes (1-12): ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();

        if (fechaValida(dia, mes, anio)) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha NO es correcta.");
        }

    }
    public static boolean fechaValida(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int diasMes;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasMes = 30;
                break;
            case 2:
                diasMes = esBisiesto(anio) ? 29 : 28;
                break;
            default:
                return false;
        }

        return dia >= 1 && dia <= diasMes;
    }

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
