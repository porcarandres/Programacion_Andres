package Tema3_ProgramacionModular;

import java.util.Scanner;

import static Tema3_ProgramacionModular.Tema3Ejercicio1.numberSign;

public class Tema3Ejercicio2 {
    public static boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("ESCRIBE UN NUMERO:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        number= numberSign(number);

        if(number > 0){
            System.out.println(number);
        } else if (number < 0) {
            System.out.println(number);
        }else{
            System.out.println(number);
        }

        System.out.println("ESCRIBE TU EDAD:");
        int edad = sc.nextInt();

        boolean mayor = isAdult(edad);

        if (mayor) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
