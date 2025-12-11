package Tema3_ProgramacionModular;
import java.util.Scanner;

public class CoberturaWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int tamano = 20;
        int[] habitaciones = new int[tamano];
        System.out.print("Introduce la habitacion donde colocar el router (1-20): ");
        int habitacion = sc.nextInt();

        System.out.print("Introduce la potencia del router (1-6): ");
        int potencia = sc.nextInt();

        int indiceRouter = habitacion - 1;
        for (int i = 0; i < tamano; i++) {
            int distancia = Math.abs(i - indiceRouter);
            int a = potencia - distancia;
            habitaciones[i] = Math.max(0, a);
        }
        System.out.println("Cobertura final:");
        for (int i = 0; i < tamano; i++) {
            System.out.print(habitaciones[i]+" ");
        }
    }
}

