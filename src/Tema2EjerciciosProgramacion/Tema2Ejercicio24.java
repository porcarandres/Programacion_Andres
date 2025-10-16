package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados = 0;
        int suspendidos = 0;
        double nota;

        System.out.println("Introduce las notas de los alumnos (pon -5 para terminar):");

        while (true) {
            System.out.print("Nota: ");
            nota = sc.nextDouble();

            if (nota == -5) {
                System.out.println("Se ha detectado el -5 (por el...FIN).");
                break;
            }if (nota < 0 || nota > 10) {
                System.out.println("Debe estar entre 0 y 10 la nota.");
                continue;
            }if (nota >= 5) {
                aprobados++;
            } else {
                suspendidos++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspendidos: " + suspendidos);
        if(suspendidos>aprobados){
            System.out.println("Has suspendido a mas alumnos que aprobados, que valor.");
        }
    }
}