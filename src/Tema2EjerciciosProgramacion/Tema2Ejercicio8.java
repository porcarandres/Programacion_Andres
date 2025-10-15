package Tema2EjerciciosProgramacion;
import java.util.Scanner;
public class Tema2Ejercicio8 {
    public static void main(String[] args) {
        final double cambio = 1.17;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad en euros €:");
        double euros = sc.nextDouble();
        double dolares = euros * cambio;

        System.out.println("la cantidad de euros en dolares son:"+dolares);

    }
}
