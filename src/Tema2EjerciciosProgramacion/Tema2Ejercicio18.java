package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio18 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Escribe un numero:");
        int num=sc.nextInt();
        if (num<0){
            System.out.println("Error");
        }
        double raiz= Math.sqrt(num);
        System.out.println("La raíz cuadrada de " + num + " es " + raiz);
    }
}
