package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Pon un número entero: ");
        int num = sc.nextInt();
        boolean numPrimo = true;
        if(num<=1){
            numPrimo=false;
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    numPrimo=false;
                    break;
                }
            }
        }
        if (numPrimo) {
            System.out.println(num + " es un numero primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
    }
}
