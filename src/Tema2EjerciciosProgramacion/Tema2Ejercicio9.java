package Tema2EjerciciosProgramacion;
import java.util.Scanner;
public class Tema2Ejercicio9 {
    public static void main(String[] args) {
        final double cambio = 0.86;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad en dólares $: ");
        double dolares = sc.nextDouble();
        double euros = dolares * cambio;

        System.out.println("la cantidad de dolares en euros son:"+euros);


    }
}
