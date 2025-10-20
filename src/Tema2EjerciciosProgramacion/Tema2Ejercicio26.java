package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Pon un número entero: ");
        int num = sc.nextInt();
        boolean NumPrimo = true;
        if(num<=1){
            NumPrimo=false;
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    NumPrimo=false;
                    break;
                }
            }
        }
        if (NumPrimo) {
            System.out.println(num + " es un numero primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
    }
}
