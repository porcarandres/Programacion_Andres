package Tema3_ProgramacionModular;

import java.util.Scanner;

public class Tema3Ejercicio5 {
    public static void Multiplicar(){
        System.out.println("Dame un numero entero entre 1 y 10: ");
    }
    public static void main(String[] args){
        Multiplicar();
        Scanner sc= new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a >= 1 && a <= 10){
            for (int i = 1; i <= 10; i++) {
                System.out.println(a + " x " + i + " = " + (a * i));
            }
        }
    }
}
