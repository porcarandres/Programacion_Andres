package Tema2EjerciciosProgramacion;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe la base y la altura de un rectangulo:");
        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        double superficie = (base + altura);
        double perimetro = ((base+altura)*2);
        System.out.println("la superficie:"+superficie+" /el perimetro:"+perimetro);

    }
}
