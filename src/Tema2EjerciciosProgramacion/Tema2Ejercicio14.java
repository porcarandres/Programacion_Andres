package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el número de personas: ");
    int personas = sc.nextInt();

    System.out.print("Introduce el número de días: ");
    int dias = sc.nextInt();

    double tarifa = 15.0;
    double precioTotal = dias * tarifa * personas;

    if (personas >= 5 && dias >= 7) {
        precioTotal =precioTotal * 0.75;
    }

    System.out.printf("El precio total de la estancia es:"+precioTotal);


}
}
