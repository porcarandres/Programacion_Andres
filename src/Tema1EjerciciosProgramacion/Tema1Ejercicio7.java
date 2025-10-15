package Tema1EjerciciosProgramacion;

import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un lado de un dado: ");
        int C = sc.nextInt();
        if (C<0 && C>6) {
            System.out.println("numero no valido");
        }
        else{
            int opuesto = 7-C;
            System.out.println("el numero opuesto es: "+opuesto);
        }
        }


    }

