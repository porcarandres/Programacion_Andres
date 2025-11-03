import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        System.out.println("Escribe:\n 1 = si quieres calcular aprobados y suspendidos\n 2 = si quieres calcular billetes a madrid \n 3 = salir del programa");
        int opcion;
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Opcion 1 Aprobados y Suspendidos");
                int n = 0;
                int max;
                int aprobados = 0;
                int suspendidos = 0;

                System.out.println("inserte el maximo de notas que va a poner");
                max = sc.nextInt();

                while (n < max) {
                    n++;
                    System.out.println("Escribe la nota numero " + n + ":");
                    int nota;
                    nota = sc.nextInt();

                    if (nota >= 5) {
                        aprobados++;
                    } else {
                        suspendidos++;
                    }
                }
                System.out.println("El numero de aprobados es:" + aprobados);
                System.out.println("El numero de suspendidos es:" + suspendidos);
                if (aprobados > suspendidos) {
                    System.out.println("Has aprobado a mas alumnos que has suspendido");
                } else if (aprobados < suspendidos) {
                    System.out.println("Has suspendido a mas alumnos que has aprobado");
                } else {
                    System.out.println("Empate de suspendidos y aprobados");
                }
                break;

            case 2:
                System.out.println("Opcion 2 Billete de tren");
                int personas = 0;
                int maxpersonas;
                System.out.println("Inserte el maximo de personas:");
                maxpersonas = sc.nextInt();

                double edad;

                double costemax;
                do {
                    personas++;
                    System.out.println("Inserte el nombre y los apellidos:");
                    String id = sc.next();
                    System.out.println("\nBienvenido:" + id);
                    System.out.println("\nInserte edad:");
                    edad = sc.nextDouble();

                    int coste1 = 0;
                    double costerebaj1 = 0;
                    int coste2 = 0;
                    double costerebaj2 = 0;
                    int coste3 = 0;
                    double costerebaj3 = 0;
                    int coste4 = 0;
                    int costerebaj4 = 0;
                    int coste5 = 0;
                    double costerebaj5 = 0;

                    if (edad >= 65) {
                        costerebaj1 = 32 * 0.90;
                        System.out.println("El precio es:" + costerebaj1);
                        coste1 = 1;
                    } else if (12 >= edad && edad <= 15) {
                        costerebaj2 = 32 * 0.92;
                        System.out.println("El precio es:" + costerebaj2);
                        coste2 = 1;
                    } else if (4 >= edad && edad <= 11) {
                        costerebaj3 = 32 * 0.65;
                        System.out.println("El precio es:" + costerebaj3);
                        coste3 = 1;
                    } else if (edad <= 4) {
                        costerebaj4 = 0;
                        System.out.println("El precio es:" + costerebaj4);
                        coste4 = 1;
                    } else {
                        costerebaj5 = 32;
                        System.out.println("El precio es:" + costerebaj5);
                        coste5 = 1;
                    }
                    costemax = (coste1 * costerebaj1) + (coste2 * costerebaj2) + (coste3 * costerebaj3) + (coste4 * costerebaj4) + (coste5 * costerebaj5);

                } while (personas < maxpersonas);
                System.out.println("El coste maximo es:" + costemax);
            case 3:
                System.out.println("Salir");
                break;
        }
    }
}

