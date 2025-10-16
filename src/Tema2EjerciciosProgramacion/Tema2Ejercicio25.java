package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero no negativo: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        }else{ long factorial = 1;

        for (int n2 = n; n2 > 1; n2--) {
            factorial *= n2;
        }
        System.out.println(n + "! = " + factorial);
        }

    }
}
