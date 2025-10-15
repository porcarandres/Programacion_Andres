package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static void main(String[] args){
        System.out.println("escribe dos numeros:");
        Scanner sc = new Scanner(System.in);
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        if(numero1>=numero2){
            double mayor = numero1-numero2;
            System.out.println("el resultado de mayor - menor es:"+mayor);
        } else if (numero2>numero1) {
            double mayor = numero2-numero1;
            System.out.println("el resultado de mayor - menor es:"+mayor);
        }

    }

}
