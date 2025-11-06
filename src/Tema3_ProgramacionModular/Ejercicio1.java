package Tema3_ProgramacionModular;

import java.util.Scanner;

public class Ejercicio1 {
    public static int numberSign(int a){
        if(a > 0){
            return 1;
        } else if (a < 0) {
            return -1;
        } else{
            return 0;
        }
    }
    public static void main(String[] args){
        System.out.println("ESCRIBE UN NUMERO:");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();

        number= numberSign(number);

        if(number > 0){
            System.out.println("Es un numero positivo");
        } else if (number < 0) {
            System.out.println("Es un numero negativo");
        }else{
            System.out.println("El numero es 0");
        }
    }
}
