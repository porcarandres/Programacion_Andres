package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero A:");
        int A = sc.nextInt();
        System.out.println("Introduce un numero B:");
        int B = sc.nextInt();
        if (B > A) {
            int num = (A + 1);
            while (num < B) {
                if (num % 2 != 0) {
                    System.out.println(num);
                }
                num++;
            }

        }else{
            System.out.println("ERROR");
        }
    }
}
