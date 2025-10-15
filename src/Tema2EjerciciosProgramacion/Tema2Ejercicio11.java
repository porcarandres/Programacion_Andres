package Tema2EjerciciosProgramacion;
import java.util.Scanner;
public class Tema2Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("escribe 3 numeros:");
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        int num3=sc.nextInt();

        if  ((num1 + 1 == num2 && num2 + 1 == num3)||(num1 - 1 == num2 && num2 - 1 == num3)) {
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Los números NO son consecutivos.");
        }


    }
}
