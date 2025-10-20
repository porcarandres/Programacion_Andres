package Tema2EjerciciosProgramacion;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29 {
    public static void main(String[] args) {
        Random random = new Random();
        int numerosecreto = random.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int intento;

        do{
            System.out.println("introduce numero:");
            intento=sc.nextInt();
            if(intento==numerosecreto){
                System.out.println("has adivinado el numero");
            }else if(intento<numerosecreto){
                System.out.println("el numero es mayor");
            }else{
                System.out.println("el numero es menor");
            }
        }while(intento != numerosecreto);
    }
}
