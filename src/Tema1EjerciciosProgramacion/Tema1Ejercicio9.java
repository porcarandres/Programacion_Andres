package Tema1EjerciciosProgramacion;

import java.util.Scanner;
public class Tema1Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame dos numeros:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        double suma = A+B;
        double producto = A*B;
        double resta = A-B;
        double division = A/B;
        double resto = A%B;
        System.out.println("El resultado de la suma es:"+suma+" |El resultado del producto es:"+producto+"|El resultado de la resta es:"+resta+"|El resultado de la division es:" + division+"|El resultado del resto es:"+resto);
    }
}