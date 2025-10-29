package Tema2EjerciciosProgramacion;
import java.util.Scanner;
public class
Tema2Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el lado de un cuadrado:");
        double lado = sc.nextDouble();
        double perimetro = (4 * lado);
        double area= (lado * lado);
        System.out.println("el perimetro es "+perimetro+" y el area es "+area);

    }
}
